import java.util.Scanner;

public class DateDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Äê£º");
		int year = sc.nextInt();
		System.out.println("ÔÂ£º");
		int month = sc.nextInt();
		System.out.println("ÈÕ£º");
		int day = sc.nextInt();

		int num = 0;
		int run = 0;

		if((year%100 != 0 && year%4 == 0) || year%400 == 0)
		{
			
		}
		switch(month)
			case 1:
				num += 31;
			case 3:
				num += 31;
			case 5:
				num += 31;
			case 7:
				num += 31;
			case 8:
				num += 31;
			case 10:
				num += 31;

			case 2:
				num += 31;
			case 4:
				num += 31;
			case 6:
				num += 31;
			case 9:
				num += 31;
			case 11:
				num += 31;
			case 12:
				num += 31;
	}
}
