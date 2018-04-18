public class  BuyChickenDemo1
{
	public static void main(String[] args) 
	{
		int money = 100;
		int chicken = 100;
		int sum = 0;
		for(int gongji = 0 ; gongji <= 33; gongji++)
		{
			for(int muji = 0; muji <= 50; muji++)
			{
				for(int xiaoji = 0; xiaoji <= 100; xiaoji = xiaoji+3){
					if((gongji*3 + muji * 2 + xiaoji/3 == 100)
						&&(gongji + xiaoji + muji == 100))
					{
						sum++;
						System.out.println("xiaoji: " + xiaoji);
						System.out.println("muji: " + muji);
						System.out.println("gongji: " + gongji);
					}
				}
			}
		}
		System.out.println("方法种类：" + sum);
	}
}
