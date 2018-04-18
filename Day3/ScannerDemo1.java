import java.util.Scanner;

public class  ScannerDemo1
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("pls print int a=");
		a = sc.nextInt();
		System.out.println("a=" + a);
		
		System.out.print("pls print String b=");
		String b = sc.next();
		System.out.println("b = " + b);

		System.out.print("pls print Boolean c =");
		boolean c = sc.nextBoolean();
		System.out.println("c = " + c);
	}
}
