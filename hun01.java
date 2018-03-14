import java.util.*;
public class array{
      public static void main(String args[]){
            Scanner in=new Scanner(System.in);
            int N=in.nextInt();
            int a[]=new int[N],b[]=new int[N];
            for(int i=0;i<N;i++)
            {
                a[i]=in.nextInt();

            }
             Arrays.sort(a);
            for(int i=0;i<N;i++)
            {
                for(int j=i+1;j<N;j++)
               {
                    if(a[i]==a[j])
                    {
                     System.out.print(a[i]+" ");
                    }
                    
               }
       }
             
      }
}
