//�Ӽ�������10��սʿ����ߣ������ߡ���͵���ߡ�
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

		System.out.println("max�� " + max + ", min: " + min);
	}
}
