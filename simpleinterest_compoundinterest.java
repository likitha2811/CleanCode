package objectmodel;
import java.util.*;
import java.io.*;
public class simpleinterest_compoundinterest {
       public static double findSimpleInterest(double Principle,double time,double rate)
       {
      return (Principle*time*rate)/100;
       }
       public static double findCompoundInterest(double Principle,double time,double rate,boolean yearly)
       {
      if(yearly)
      {
      return Principle*(Math.pow(1+(rate/100),time)-1);
     
      }
      else
      {
      return Principle*(Math.pow(1+((rate/2)/100),2*time)-1);
      }
    }
       public static void main(String[] args) {
    	   System.out.println("Simple Interest is : " +findSimpleInterest(2000,2,5));
    	   System.out.println("Compound Interest yearly is : " + findCompoundInterest(2500,2,5,true));
    	   System.out.println("Compound Interest half yearly is : " +findCompoundInterest(2600,4,4,false));


    	   }
}