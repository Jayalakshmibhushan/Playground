import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int column = sc.nextInt();
      int count = 0, res = 1;
      while(count<column)
      {
        res = res*row;
        count++;
      }
      System.out.println(res);
    }
}