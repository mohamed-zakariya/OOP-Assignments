import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> a1 = new ArrayList<>();

        System.out.println("Enter the 5 numbers");

        for(int i = 1; i<=5; i++){
            a1.add(input.nextInt());
        }
        System.out.println(a1);
        System.out.println(sortList(a1));

    }//3(i) 2(j)
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