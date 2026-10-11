
import java.util.Scanner;

public class JArray {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        Scanner input =new  Scanner(System.in);

        System.out.println("Enter the size Of Array: ");
        int size = input.nextInt();
        // System.out.println(size);

        System.out.println("Enter the Array Element");

        long[] array = new long[size];

        for(int i =0 ;i<size; i++){
            array[i] = input.nextLong();
        }

        for(int i=0; i<size;i++){
            System.out.print(array[i] + " ");
        }


    }
}