import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,3};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}