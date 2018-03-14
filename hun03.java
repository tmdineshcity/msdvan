import java.util.*;
import java.util.ArrayList;
public class MyClass {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),i,count=0;
        int a[]=new int[N];
        for(i=0;i<N;i++)
        {
            a[i]=in.nextInt();
        } 
        LinkedHashSet<Integer> d=new LinkedHashSet<Integer>();
        for(i=0;i<N;i++)
        {
            if(a[i]==i)
             {
              d.add(i);count++;
             }
            
        }
        ArrayList<Integer> aa=new ArrayList<Integer>(d); 
        Collections.sort(aa);
         if(count==0){
                  System.out.print("-1");
             }
             else{
        for(int j:aa){
                System.out.print(j+" ");
            }
    
             }
            
    }
}
