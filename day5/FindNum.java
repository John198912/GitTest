//甲说：牌照的前两位数字是相同的；
//乙说：牌照的后两位数字是相同的，但与前两位不同；
//丙是数学家，他说：四位的车号刚好是一个整数的平方。
//请根据以上线索找出车号。
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
					System.out.println("车牌号：" + num );
				}		
			}			
		}
	}
}
