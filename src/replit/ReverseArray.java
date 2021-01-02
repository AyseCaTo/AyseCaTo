package replit;

public class ReverseArray {
    public static String[] reverse(String[] arr) {
        //write your codes here
        for (int i = arr.length-1, j=0 ; i>=0; i--,j++){
            arr[i]=arr[j];
        }
        return arr;
    }
}
