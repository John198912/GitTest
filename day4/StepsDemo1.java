public class StepsDemo1 
{
	public static void main(String[] args) 
	{
		int step = 0;
		while(true){
			step++;
			if((step%2 == 1)&&(step%3 == 2)&&(step%5 == 4)
				&&(step%6 == 5)&&(step%7 == 0))
			{
				System.out.println("��С������Ϊ��" + step);
				break;
			}
			
		}
	}
}
