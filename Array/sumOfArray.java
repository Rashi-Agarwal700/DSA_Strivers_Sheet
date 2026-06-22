import java.util.Scanner;
public class sumOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            prod *= arr[i];
        }
        System.out.println("Sum of array: "+sum);
        System.out.println("Product of array: "+prod);
        scan.close();
    }
}
