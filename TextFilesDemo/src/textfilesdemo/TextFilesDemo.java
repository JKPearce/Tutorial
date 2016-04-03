/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilesdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class TextFilesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String txtFile = "temp.txt";
        WriteToFile(txtFile);
        ReadFromFile(txtFile);

    }

    
    private static void ReadFromFile(String txtFile) throws IOException {
        String line;

        FileReader reader = new FileReader(txtFile);

        BufferedReader fileReader = new BufferedReader(reader);

        line = fileReader.readLine();
        System.out.println("Reading from file : ");
        while (line != null) {
            System.out.println(line);
            line = fileReader.readLine();
        }
        fileReader.close();

    }

    private static void WriteToFile(String txtFile) throws IOException {
        String line;

        FileWriter writer = new FileWriter(txtFile);

        BufferedWriter fileWriter = new BufferedWriter(writer);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line   (type 'END' to stop writing) : ");
        line = sc.nextLine();

        while (line.compareTo("END") != 0) {
            fileWriter.write(line);

            fileWriter.newLine();
            System.out.print("Enter a line : ");
            line = sc.nextLine();
        }
        fileWriter.close();

    }
}
