import java.util.*; 
class Employ
 {
    float salary=10000;
 }
class HR extends Employ
{ 
   float salary=20000;
   void display()
   {
     System.out.println("salary is "+super.salary);
   }
   public static void main(String args[])
   {
        HR obj=new HR();
        obj.display();
   }
} 



OUTPUT:
salary is 10000.0
  
