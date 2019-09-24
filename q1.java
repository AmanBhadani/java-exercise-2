import java.util.*;
import java.lang.*;

class Q1
{
  public static String reverse(String s)
  {
    StringBuilder normal = new StringBuilder();
    StringBuilder reverse = new StringBuilder();
    reverse.append(s);
    normal.append(s);
    reverse.reverse();
    if(normal==reverse)
      return "YES";
    else
      return "NO";
  }
}