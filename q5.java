import java.util.*;
import java.lang.*;

class Q5
{
  public static void op()
  {
    System.out.println("Enter the number of Student: ");

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int arr[]= new int[n];

    int max=-1;
    int min= 1000;
    int sum= 0;

    for(int i=1;i<=n;i++)
    {
      System.out.println("Enter the marks of Student"+i+": ");
      arr[i-1]=sc.nextInt(); 
      if(!(arr[i-1]>=0&&arr[i-1]<=100))
      {
        System.out.println("INVALID INPUT");
        System.exit(0);
      }
      if(arr[i-1]>max)
        max=arr[i-1];
      if(arr[i-1]<min)
        min=arr[i-1];
      sum=sum+arr[i-1];
    }
    float avg= sum/n;

    System.out.println("Minimum "+min);
    System.out.println("Maximum "+max);
    System.out.println("Average "+avg);





  }
}