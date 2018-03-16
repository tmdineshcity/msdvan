import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class chart
{
     public static void main(String args[])
     {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      String dd=" ", b=String.valueOf(a);
      char c[]=b.toCharArray();
      HashMap<Integer,Character> m=new HashMap<Integer,Character> ();
      char ch='a';
      int count=0;
      for(int i=1;i<26;i++)
      {
          m.put(i,ch);
          ch++;
      }
      for(int i=0;i<c.length;i++)
      {
          int r=Character.getNumericValue(c[i]);
          if(m.containsKey(r))
          {
          char t=m.get(r);
          dd=dd+t;
          count++;
          }
      }
      System.out.println(dd);
      System.out.println(count-1);
     }
}
