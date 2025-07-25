package ExceptionHandling;


	import java.util.Scanner;

	// Custom exception for invalid marks
	class InvalidMarksException extends Exception {
	    public InvalidMarksException(String message) {
	        super(message);
	    }
	}

	public class StudentAverageMarks {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] students = new String[2];
	        int[][] marks = new int[2][3];

	        try {
	            for (int i = 0; i < 2; i++) {
	                System.out.print("Enter name of student " + (i + 1) + ": ");
	                students[i] = sc.nextLine();

	                for (int j = 0; j < 3; j++) {
	                    System.out.print("Enter marks for subject " + (j + 1) + ": ");
	                    String input = sc.nextLine();
	                    
	                    int mark = Integer.parseInt(input); // may throw NumberFormatException

	                    if (mark < 0) {
	                        throw new InvalidMarksException("Negative marks are not allowed.");
	                    } else if (mark > 100) {
	                        throw new InvalidMarksException("Marks should be in the range 0 to 100.");
	                    }

	                    marks[i][j] = mark;
	                }
	            }

	            for (int i = 0; i < 2; i++) {
	                int sum = 0;
	                for (int j = 0; j < 3; j++) {
	                    sum += marks[i][j];
	                }
	                double avg = sum / 3.0;
	                System.out.println("Average marks for " + students[i] + " = " + avg);
	            }

	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormatException: Please enter valid numeric marks.");
	        } catch (InvalidMarksException e) {
	            System.out.println("InvalidMarksException: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("General Exception: " + e.getMessage());
	        }
	    }
	}



