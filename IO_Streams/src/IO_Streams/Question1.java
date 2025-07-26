package IO_Streams;

import java.io.*;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: filename and character
        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        System.out.print("Enter character to count: ");
        char targetChar = sc.nextLine().charAt(0);
        targetChar = Character.toLowerCase(targetChar); // normalize to lowercase

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                char currentChar = Character.toLowerCase((char) ch);
                if (currentChar == targetChar) {
                    count++;
                }
            }
            System.out.println("Character '" + targetChar + "' appears " + count + " times in the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}

