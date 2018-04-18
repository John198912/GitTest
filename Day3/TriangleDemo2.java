import java.util.Scanner;

public class  TriangleDemo2
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
			if((a == b) && (b == c)){
				System.out.println("这个是等边三角形。");
			}else if((a == b) || (b == c) || (a == c)){
				System.out.println("这个是等腰三角形。");
				if((a*a + b*b == c*c)||(c*c + b*b == a*a)
									||(a*a + c*c == b*b)){
				System.out.println("这个是等腰直角三角形。");
			}
			}else{
				System.out.println("这个是随意三角形。");
			}
			if((a*a + b*b == c*c)||(c*c + b*b == a*a)
									||(a*a + c*c == b*b)){
				System.out.println("这个是直角三角形。");
			}


		}else{
			System.out.println("这个不是三角形。");
		}
	}
}
