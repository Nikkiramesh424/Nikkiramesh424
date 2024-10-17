import java.lang.*;
public class UserDefined
{
    public static void validate(int age)
    {
       if(age<18)
       {
          throw new ArithmeticException("Not eligible to vote");
       }
       else
       {
          System.out.println("Eligible to vote");
       }
    }
    public static void main(String args[])
    {
          validate(13);
    }
}

OUTPUT:
Exception in thread "main" java.lang.ArithmeticException: Not eligible to vote
