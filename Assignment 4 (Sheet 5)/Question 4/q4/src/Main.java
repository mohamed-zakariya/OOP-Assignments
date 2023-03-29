import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        File inputFile = new File("src/scan.txt");
        File tempFile = new File("src/myTempFile.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String toRemove = "John";
        String currentLine;

        while ((currentLine = reader.readLine()) != null){
            String trimmedLine = currentLine;
            if(trimmedLine.equals(toRemove)){
                continue;
            }
            writer.write(currentLine +"\n");
        }
        writer.close();
        reader.close();


        tempFile.renameTo(inputFile);
    }
}