//���նˣ����̣�����20�����ݵ������У�ͳ�����������ĸ�����
//��������Щ����֮�͡�
import java.util.Scanner;

public class CountDemo1
{
	public static void main(String[] args) 
	{
		int[] arrayInt = new int[20];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arrayInt.length ; i++){
			System.out.println("�������" + i + "����");
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
