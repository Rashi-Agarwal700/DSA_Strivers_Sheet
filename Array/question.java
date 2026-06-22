public class question {
    public static void main(String[] args) {
        int[] arr = {11, 21, 31, 41, 51, 61, 71, 81, 91, 101};
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                arr[i] = arr[i] + 10;
            }
            else{
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i]+ " ");
        }
    }
}
