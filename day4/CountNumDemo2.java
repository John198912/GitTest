//��λ��Ϊ6���ܱ�3��������λ��Ȼ�����ж��ٸ����ֱ�����Щ��

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
				System.out.println("�������" + i);
			} 
		}
		System.out.println("count��" + count);
	}
}