import java.util.*;
public class RecursionBasics{
    public static boolean isSoeted(int arr[], int i){
        // base case
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i + 1]){
            return false;
        }
        // recursive call
        return isSoeted(arr, i+1);
    }
    public static void main(String args[]){
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println(isSoeted(arr, 0)); 
    }
}
