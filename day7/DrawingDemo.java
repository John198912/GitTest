public class  DrawingDemo
{
	public static void main(String[] args) 
	{
		
	}
}

abstract class Drawing
{
	public int areaCount();
}

class Triangle extends Drawing
{
	private int longness;
	private int height;
	private int area;

	public Triangle(int longness, int height){
		this.longness = longness;
		this.height = height;
	}
	public int areaCount(int longness, int width){
		area = longness * width / 2;
		System.out.println("三角形面积：" + area);
		return area;
	}
}

class Oblong extends Drawing
{
	private int longness;
	private int width;
	private int area;

	public Triangle(int longness, int width){
		this.longness = longness;
		this.width = width;
	}
	public int areaCount(int longness, int width){
		area = longness * width;
		System.out.println("长方形面积：" + area);
		return area;
	}
}

class Circle extends Drawing
{
	private int r;
	private int area;

	public Triangle(int r){
		this.r = r;
	}
	public int areaCount(int longness, int width){
		area = r * r * 3.14;
		System.out.println("长方形面积：" + area);
		return area;
	}
}
