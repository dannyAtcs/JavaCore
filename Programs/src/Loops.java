
public class Loops {

	public static void main(String[] args)
	{
		int arr[] = new int[] {23,67,43,87,65,75,245,756,987};
		
		int i = arr.length;
		int k=0;
		System.out.println("WhileLoop");
		while(i!=0)
		{
			System.out.println(arr[k]);
			k++;
			i--;
		}
		i = arr.length;
		k=0;
		//do while
		System.out.println("DowhileLoop");
		do{
			System.out.println(arr[k]);
			i--;
			k++;
			
		}
		while(i!=0);
		
		//for loop
		System.out.println("ForLoop");
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		
		//Enhance for loop
		
		for(int j : arr)
		{
			System.out.println(j);
		}
		
		//nested loop
		for(int p = 0;p<5;p++)
		{
			for(int q=0;q<=p;q++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
	}
}
