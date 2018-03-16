import java.util.*;
import java.lang.*;
public class dinesh
{
    public static void main(String args[])
     {
     Scanner in=new Scanner(System.in);
     int N=in.nextInt(),m;
     ArrayList<Integer>a=new ArrayList<Integer>();
     for(int i=0;i<N;i++)
     {
         m=in.nextInt();
         a.add(m);
     }
     for(int i=0;i<N;i++)
     {
         if(Collections.frequency(a,a.get(i))==1)
         {
             System.out.print(a.get(i)+" ");
         }
     }

    }

}
