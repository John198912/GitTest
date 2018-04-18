import java.util.Scanner;

public class TriangleDemo1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a = " );
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		System.out.print("c = " );
		int c = sc.nextInt();

		if((a > 0 && b > 0 && c > 0)
			&& ((a + b > c)&&(b + c > a)&&(a + c > b))
			&& ((a - b < c)&&(b - c < a)&&(a - c < b))){
			System.out.println("这个是三角形，三边为：" + a + " " 
				+ b + " " + c);
		}else{
			System.out.println("这个不是三角形。");
		}

	}
}
