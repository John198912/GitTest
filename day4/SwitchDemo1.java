import java.util.Scanner;

public class  SwitchDemo1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String addr = sc.next();
		System.out.println("������a,b,c");

		switch(addr){		
			case "a":
			case "A":
				System.out.println("�ձ�");
				break;
			case "b":
			case "B":
				System.out.println("�����");
				break;
			case "c":
			case "C":
				System.out.println("����");
				break;
			default:
				System.out.println("�������");
				break;
		}
	}
}
