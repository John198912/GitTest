//��˵�����յ�ǰ��λ��������ͬ�ģ�
//��˵�����յĺ���λ��������ͬ�ģ�����ǰ��λ��ͬ��
//������ѧ�ң���˵����λ�ĳ��Ÿպ���һ��������ƽ����
//��������������ҳ����š�
public class FindNum 
{
	public static void main(String[] args) 
	{
		int a ,b,c,d;
		for(int i = 1000; i <= 9999; i++){
			a = i/1000;
			b = i/100%10;
			c = i/10%10;
			d = i%10;
			int num = a*1000 + b*100 + c*10 + d;
			for(int j = 32; j <=99; j++){
				if((a == b)&&(c == d)&&(c != a)&&(j*j == num))
				{
					System.out.println("���ƺţ�" + num );
				}		
			}			
		}
	}
}
