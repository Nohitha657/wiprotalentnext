package IO_Streams;

import java.io.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the source file");
        String sourceFile = sc.nextLine();
        
    	System.out.println("Enter the destination file");
        String destinationFile = sc.nextLine();

        try (
            FileReader fr = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(destinationFile);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;
            System.out.println("Copying content from " + sourceFile + " to " + destinationFile + ":\n");
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                System.out.println(line); // print while copying
            }
            System.out.println("\nCopy completed successfully.");
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}

