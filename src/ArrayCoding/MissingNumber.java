package ArrayCoding;

public class MissingNumber {
    public static int numberfound(int[] nums) {
    int n = nums.length;
    int expectedsum = n*(n+1)/2;
    int actualsum =0;
    for(int i=0;i<n;i++){
        actualsum = actualsum +nums[i];
    }


        return expectedsum-actualsum;
    }


    public static void main(String[] args){
  int[] nums ={9,6,4,2,3,5,7,0,1};
  System.out.println(numberfound(nums));

    }

}
