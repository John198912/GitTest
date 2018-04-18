import java.util.Scanner;

public class  SwitchDemo1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String addr = sc.next();
		System.out.println("请输入a,b,c");

		switch(addr){		
			case "a":
			case "A":
				System.out.println("日本");
				break;
			case "b":
			case "B":
				System.out.println("意大利");
				break;
			case "c":
			case "C":
				System.out.println("巴黎");
				break;
			default:
				System.out.println("输入错误。");
				break;
		}
	}
}
