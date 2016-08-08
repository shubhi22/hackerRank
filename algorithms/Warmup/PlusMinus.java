import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int countOfZeroes=0,countOfPositives=0,countOfNegatives=0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]==0){
                countOfZeroes++;
            }
            else if(arr[arr_i]>0){
                countOfPositives++;
            }
            else
                countOfNegatives++;
        }
        System.out.printf("%.6f\n",((float)countOfPositives)/n);
        System.out.printf("%.6f\n",((float)countOfNegatives)/n);
        System.out.printf("%.6f\n",((float)countOfZeroes)/n);
        
    }
}
