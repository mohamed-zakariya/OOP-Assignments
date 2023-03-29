import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Hello world!");

        ArrayList<Integer> a1 = new ArrayList<>();
        java.io.File file = new java.io.File("Heba.txt");

        if(file.exists()){
            System.out.println("the file already exists");
            System.exit(0);
        }
        java.io.PrintWriter write = new java.io.PrintWriter(file);

        for(int i = 1; i <= 100; i++){

            int randomNum = (int)(Math.random() * 101);
            write.print(randomNum);
            write.print(" ");
        }
        write.close();

        Scanner input = new Scanner(file);

        while(input.hasNext()){
            a1.add(input.nextInt());
        }
        System.out.println(a1);
        System.out.println(sortList(a1));
    }
    public static ArrayList<Integer>  sortList(ArrayList<Integer> a1){

        for(int i = 0; i < a1.size(); i++){
            for(int j = i+1; j < a1.size(); j++){
                if((a1.get(i) > a1.get(j))){
                    int x = a1.get(i);
                    a1.set(i,a1.get(j));
                    a1.set(j,x);
                }
            }
        }
        return a1;
    }
}