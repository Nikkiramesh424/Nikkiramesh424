import java.util.*; 
class A
{
     public void methodA() 
     {
     System.out.println("Parent class");
     } 
}
class B extends A
{
     public void methodB()
     {
     System.out.println("Child class");
     }
     public static void main(String args[])
     {
         B obj=new B();
         obj.methodA();
         obj.methodB();
     }
} 
