//从终端（键盘）读入20个数据到数组中，统计其中正数的个数，
//并计算这些正数之和。
import java.util.Scanner;

public class CountDemo1
{
	public static void main(String[] args) 
	{
		int[] arrayInt = new int[20];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arrayInt.length ; i++){
			System.out.println("请输入第" + i + "个数");
			arrayInt[i] = sc.nextInt();
		}
		for(int j = 0; j < arrayInt.length; j++)
		{
			if(arrayInt[j] > 0)
			{
				sum += arrayInt[j];
			}
		}
		System.out.println("sum:" + sum);
	}
}
