package ArrayCoding;

import java.sql.SQLOutput;

public class ReverseString {
    public static void stringReverse(char[] ch){
        //TwoPointerApproach
        int left =0;
        int right = ch.length-1;
        while(left<right){
            char temp = ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left ++;
            right--;


        }
    }
    public static void main(String[] args){
 // char[] str ={'h','e','l','l','o'};
        String str ="I love India";
        char[] ch = str.toCharArray();
        stringReverse(ch);
        System.out.println(String.valueOf(ch));

    }
}
