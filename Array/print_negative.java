import java.util.Scanner;
public class print_negative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
        scan.close();
    }
}
