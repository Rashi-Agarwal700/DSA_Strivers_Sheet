public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 3, 27, 53, 18, 62, 88, 6, 53};
        int target = 18;
        int found = -789; // means target array mein ni hai 
        for(int i = 0; i < arr.length ; i++){
                if(arr[i] == target){
                    found = i;
                    break;
                } 
        }
        if(found != -789){
            System.out.println("Target Exists in Array at Index: " + found);
        }
        else{
            System.out.println("Target does not exist in array");
        }
    }
}
