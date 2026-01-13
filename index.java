 import java.util.*;
 class index
{
    public static void main(String[] args) 
    {
       
       Scanner sc = new Scanner (System.in);
       @SuppressWarnings("unused")
       int age =sc.nextInt();
       if (age>=18)
       {
        System.out.println("You are eligible to vote !");
       }
      else {System.err.println("Your are not adult");}



    }
}