public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int[][] array = new int[3][4];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				array[i][j] = 1000 + 100*i + 10*j;
			}
		}

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.println(array[i][j]);
			}
		}



		System.out.println("Hello World!");
	}
}
