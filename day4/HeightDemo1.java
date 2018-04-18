//从键盘输入10个战士的身高，输出最高、最低的身高。
import java.util.Scanner;

public class HeightDemo1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		for(int i = 0; i < 10; i++){
			System.out.println("pls print height: ");
			int height = sc.nextInt();
			if(i == 0){
				max = height;
				min = height;
			}
			if(height > max){
				max = height;
			}else if(height < min){
				min = height;
			}
		}

		System.out.println("max： " + max + ", min: " + min);
	}
}
