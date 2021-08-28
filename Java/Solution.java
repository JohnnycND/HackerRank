import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static{
    public static boolean flag = false;
    Scanner lec = new Scanner(System.in);
    
    byte B = lec.nextByte();
    byte H = lec.nextByte();

    if(B > 0 && H > 0){
        int area = B * H;
        flag = true;
    }else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    
}



public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

