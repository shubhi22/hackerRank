import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        int hh=Integer.parseInt(time.substring(0,2));
        String amorpm=time.substring(8);
        if(amorpm.equals("AM")){
            if(hh==12){
                System.out.println("00:"+time.substring(3,8));
            }
            else
                System.out.println(time.substring(0,8));
        }
        else if(amorpm.equals("PM")){
            if(hh==12){
                System.out.println(time.substring(0,8));
            }
            else{
                  System.out.println((hh+12)+time.substring(2,8));
            }
       
        }
    }
}
