public class  IfDemo1
{
	public static void main(String[] args) 
	{
		int grade = 90;
		if(grade >= 90){
			System.out.println("优秀");
		}else if(grade >= 80)
		{
			System.out.println("良好");
		}else if(grade > 70)
		{
			System.out.println("还行");
		}else if (grade > 60)
		{
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		System.out.println("Hello World!");
	}
}
