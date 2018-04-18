//电饭锅，包含属性（品牌、容量大小、颜色等）方法：（煮粥，米饭）
//汽车，包含属性（品牌、排量、类型等）方法:(加速，减速，停车，转弯，直行)
//学生，包含属性（姓名，年龄，性别等）

public class ClazzDemo1
{
	public static void main(String[] args) 

	{
		Car c = new Car();
		Student s = new Student();
		DianFanGuo d = new DianFanGuo();
		c.jianSu();
		d.zhuZhou();

		s.cook(d);
	}
}

class Student
{
	String name = "Tom";
	int age = 16;
	String xingBie = "男";
	
	public void cook(DianFanGuo d){
		d.zhuZhou();
		d.miFan();
	}
	public void drive(Car c){
		c.jiaSu();
	}
}

class DianFanGuo
{
	String pinPai = "GeLi";
	int Count = 0;
	String color = "white";
	
	public void zhuZhou(){
		System.out.println("煮粥。");
	}
	public void miFan(){
		System.out.println("焖米饭。");
	}
}

//汽车，包含属性（品牌、排量、类型等）方法:(加速，减速，停车，转弯，直行)
class Car
{
	String pinPai = "Benz";
	String type = "PaoChe";
	int turbo = 10;
	
	public void jiaSu(){
		System.out.println("汽车加速");
	}
	public void jianSu(){
		System.out.println("汽车减速");
	}
	public void tingChe(){
		System.out.println("汽车停车");
	}

	public void zhuanWan(){
		System.out.println("汽车转弯");
	}
	public void zhiXing(){
		System.out.println("汽车直行");
	}
}