//Ҫ��5��100Ԫ�Ĵ�Ʊ�����ɵ�ֵ��50Ԫ��20Ԫ��10Ԫ��
//5Ԫһ�ŵ�С��Ʊ���ҡ�ÿ����ֵ����1�ţ��������Ҫ������ֽ

public class CashDemo1 
{
	public static void main(String[] args) 
	{
		int money = 500;
		int num = 0;
		int count =0;
		for(int wushi = 1;wushi <= 9;wushi++)
		{
			for(int ershi =1;ershi <= 21;ershi++)
			{
				for(int shi = 1; shi <= 45; shi++)
				{
					for(int wu = 1; wu <= 90; wu++)
					{
						if(wushi*50 + ershi*20 + shi*10 + wu*5 == 500)
						{
							count++;
							num = wushi+ershi+shi+wu;
							System.out.println("50:"+wushi+" 20:"+ershi+" 10:"
												+shi+" 5:"+wu+" num:"+num);
						}
					}
				}
			}
		}
		System.out.println("count:" + count);
	}
}