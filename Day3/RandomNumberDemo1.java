import java.util.Random;
import java.util.Scanner;
public class  RandomNumberDemo1
{
	public static void main(String[] args) 
	{
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int a = rd.nextInt(100);

		while(true){
			System.out.println("pls print a int number");
			int b = sc.nextInt();
			if(a == b){
				System.out.println("number is right :" + a);
				break;
			}
			if(a > b){
				System.out.println("̫С��");
			}
			if(a < b){
				System.out.println("̫����");
			}
		}
	}
}
