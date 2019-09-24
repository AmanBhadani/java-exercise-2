import java.util.*;
import java.lang.*;

class Q6
{
  public static void factorial()
  {
    int prevfact=1,i=1,newfact;
    while(true)
    {
      newfact= prevfact*i;
      if(prevfact==newfact/i)
        System.out.println("The factorial of "+i+" is "+newfact);
      else
      {
        System.out.println("The factorial of "+i+" is out of range");
        System.exit(0);
      }
      i++;
      prevfact=newfact;
    }

  }
  public static void longfactorial()
  {
    long prevfact=1,i=1,newfact;
    while(true)
    {
      newfact= prevfact*i;
      if(prevfact==newfact/i)
        System.out.println("The factorial of "+i+" is "+newfact);
      else
      {
        System.out.println("The factorial of "+i+" is out of range");
        System.exit(0);
      }
      i++;
      prevfact=newfact;
    }

  }
}