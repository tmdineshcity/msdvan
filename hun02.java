import java.util.*;
public class array
{
      public static void main(String args[])
      {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            LinkedHashSet<Integer> d=new LinkedHashSet<Integer>();
            for(int i=0;i<n;i++){
               int  m=in.nextInt();
                d.add(m);
            }
            ArrayList<Integer> a=new ArrayList<Integer>(d);
            Collections.sort(a,Collections.reverseOrder());
            for(int j:a){
                System.out.print(j);
            }

    }
}
