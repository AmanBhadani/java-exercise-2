import java.util.*;
import java.lang.*;


    class User {
    private String fname;
    private String lname;
    private int age;
    private int salary;

    public int getAge(){
      if(age>0&&age<100)
        return age;
      else
        return -1;
    }

    public String getFName() {
      return fname;
    }

    public String getLName() {
      return lname;
    }
    public String getName(){
      return fname+" "+lname;
    }

    public int getSalary(){
      return salary;
    }

    public void setAge(int age){
      if(age>0&&age<100)
      this.age=age;
    }

    public void setFName(String fname) {
      this.fname=fname;
    }

    public void setLName(String lname) {
      this.lname=lname;
    }

    public void setSalary(int salary){
      this.salary=salary;
    }
    
}