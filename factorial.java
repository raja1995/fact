
public class array{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in)
    int num=in.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++)
    {
      fact=fact*i;
    }
    System.out.print(fact);
  }
}
