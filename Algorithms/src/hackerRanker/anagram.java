package hackerRanker;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class anagram {
    public static int numberNeeded(String first, String second) {
      int[] flg = new int[256];
      int[] chk = new int[256];
        int deleteCh =0;
        int val1=0;
        int val2=0;
      for(int i=0;i<first.length();i++){
          int ch = first.charAt(i);
          val1 |= 1 << first.charAt(i);
          flg[ch] +=1;      
      }
      for(int i=0;i<second.length();i++){
          int ch = second.charAt(i);
          chk[ch] +=1;
          val2|= 1 << second.charAt(i);
          if((val1 & 1<<second.charAt(i)) == 0 )
              deleteCh++;
          else{
              if(flg[ch] == 0)
                  deleteCh++;
              else
                  flg[ch]--;
          }
      }
        for(int i=0;i<first.length();i++){
        	 int ch = first.charAt(i);
            if((val2 & 1<<first.charAt(i)) == 0 )
              deleteCh++;
          else{
              if(chk[ch] == 0)
                  deleteCh++;
              else
                  chk[ch]--;
          }
        }
        return deleteCh;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}