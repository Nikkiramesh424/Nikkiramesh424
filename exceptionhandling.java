import java.lang.*;
class CA
{ 
   public static void main(String args[])
   {
   try
   {
       int a=10/0;
       System.out.println(a);
   }
   catch(ArithmeticException ae)
   {
       System.out.println(ae);
   }
  }
}

OUTPUT:
  java.lang.ArithmeticException: / by zero
