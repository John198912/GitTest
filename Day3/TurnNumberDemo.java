import java.util.Scanner;

public class  TurnNumberDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("a =");
		int a = sc.nextInt();
		int b1, b2, b3, b4, b5;
		b1 = a / 10000 % 10;
		b2 = a / 1000 % 10;
		b3 = a / 100 % 10;
		b4 = a / 10 % 10;
		b5 = a % 10;
		int c = b5*10000 + b4*1000 + b3*100 + b2*10 + b1;
		System.out.println("b =" + c);

	}
}
