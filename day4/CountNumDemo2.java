//个位数为6且能被3整除的三位自然数共有多少个，分别是哪些？

public class CountNumDemo2 
{
	public static void main(String[] args) 
	{
		int num = 0 ;
		int count = 0;
		for(int i = 100; i <= 999 ; i++)
		{
			if((i%10 == 6)&&(i%3 == 0)){
				count++;
				System.out.println("这个数：" + i);
			} 
		}
		System.out.println("count：" + count);
	}
}
