import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
    // printNTimes("code", 3);
    // printNums();
    // uprightNumberTriangle(5);
    starTree(5);
    // multTable();
  }

  public static void printNTimes(String word, int N)
  {
    String ans = "";
    for (int i = 0; i < word.length(); i++)
    {
      for (int j = 0; j < N; j++)
      {
        ans += word.substring(i, i+1);
      }
    }
    System.out.println(ans);
  }

  public static void printNums()
  {
    for (int i = 10; i > 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int i = 0; i < N; i++)
    {
      for (int j = 1; j <= i+1; j++)
      {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void starTree(int Height)
  {
    for (int i = (10-Height); i < 10; i++)
    {
      for (int space = 0; space < i; space++)
      {
        System.out.print(" ");
      }
      for (int star = 10; star > i; star--)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void multTable()
  {
    for (int i = 1; i <= 10; i++)
    {
      for (int j = 1; j <= 10; j++)
      {
        System.out.print(i*j + " ");
      }
      System.out.println();
    }
  }
}
