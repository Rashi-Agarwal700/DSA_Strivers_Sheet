import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] x = arr; // x is a shallow copy of arr (mtlb jo change hum x mein krege wo change arr mein v hoga )
        x[0] = 5;
        System.out.println("Shallow copy "+ x[0]+ " and original "+ arr[0]);
        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[2] = 90;
        System.out.println("original " + arr[2] + " and deep copy " + deep[2]);
        // there is one more way of deep copy
        int[] brr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            brr[i] = arr[i];
        } // brr is a deep copy
    }
    
}
