class prod
{
   int product(int x,int y)
   {
     return x*y;
   }
}
public class done
{
   public static void main(String [] args)
   {
     prod op=new prod();
     int k=op.product(10,10);
     System.out.println(k);
   }
}