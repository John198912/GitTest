import java.util.Scanner;

public class CountNumDemo1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int big = 0,small = 0,equal = 0;
		for(int i = 0; i < 10; i++)
		{
			System.out.println("pls print" + (i + 1)+ "num");
			int a = sc.nextInt();
			if(a > 0){
				big++;
				System.out.println("big");
			}
			if(a < 0){
				small++;
				System.out.println("small");
			}
			if(a == 0){
				equal++;
				System.out.println("equal");
			}
		}
		System.out.println("big: "+big + " small: " + small + " equal: " + equal);
	}
}
