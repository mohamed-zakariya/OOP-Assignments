import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // String urlString = new Scanner((System.in)).next();

        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/ Lincoln.txt.");
            int countWords = 0;
            Scanner input = new Scanner(url.openStream());

            while(input.hasNext()){
                String line = input.nextLine();
                String[] words = line.split((" "));
                countWords += words.length;
            }
            input.close();
            System.out.println(countWords);

        }catch (java.net.MalformedURLException e){
            System.out.println("Invalied URL");
        }
        catch (java.io.IOException e){
            System.out.println("IO Errors");
        }

    }
}