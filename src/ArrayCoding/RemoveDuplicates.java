package ArrayCoding;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main (String[] args){
        int[] num = {0,0,1,1,2,2,3,4,5,6,6};
        Set<Integer> Duplicates = new HashSet<Integer>();
        for(Integer nums :num){
            Duplicates.add(nums);
        }
        int[] uniqueArray = Duplicates.stream().mapToInt(Integer::intValue).sorted().toArray();
        System.out.println(Arrays.toString(uniqueArray));

    }

}
