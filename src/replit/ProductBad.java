package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductBad {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(badP(arr, 2));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(list));
        System.out.println(removeInst(list, 1));

        ArrayList<String> str = new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
        System.out.println(search(str, "four"));
    }

    public static boolean badP(int[] products,int limit) {
        int count = 0;

        for (int each : products){
            if (each==0){
                count++;
            }
        }
        if (count>limit) return false;
        else return true;

    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> numbers){
        ArrayList<Integer> doubleList = new ArrayList<>();
        for (Integer each:numbers){
            doubleList.add(each);
            doubleList.add(each);
        }
        return doubleList;
    }

    public static String search(ArrayList<String> r, String find){
        for (String each : r){
            if (each.contains(find)) return each;
        }
        return "search failed";
    }

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n){
        r.removeIf(p->p==n);
        return r;
    }
}
