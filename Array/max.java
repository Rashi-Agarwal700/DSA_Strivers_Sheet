import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            else if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);
        scan.close();
    }
}
