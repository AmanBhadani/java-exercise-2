import java.util.*;
import java.lang.*;

abstract class Q3
{
  abstract void member_name();
  abstract void member_age();
  abstract void member_salary();

}

class Member_variable extends Q3
{
  void member_name()
  {
    System.out.println("HARRY POTTER");
  }
  void member_age()
  {
    System.out.println("40");
  }
  void member_salary()
  {
    System.out.println("25,000");
  }
}