import java.util.*;
import java.lang.*;

class Q2
{
  public static String pow4(int s)
  {

    if(s == 0) 
        return "NO"; 
    while(s != 1) 
    {  
        if(s % 4 != 0) 
            return "NO"; 
        s = s / 4;  
    } 
    return "YES"; 
    
  }
}