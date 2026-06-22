import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {4,-8,67,43,-97};
        System.out.println(arr.length); // length of array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // printing array 
        }

        int[] arr_input = new int[7];
        // all default values are 0
        for(int i=0; i < 7; i++){
            arr_input[i] = scan.nextInt();
        }
        for(int i = 0; i < 7; i++){
            System.out.print(arr_input[i] + " ");
        }

        scan.close();
    }
}
