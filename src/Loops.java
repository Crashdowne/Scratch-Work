import java.util.Arrays;


public class Loops {

	public static void main(String[] args)
	{
		bubbleSort();
	}
	
	public static void bubbleSort()
	{
		int[] a1 = {10,100,58,99,22,54,25,33,68,88,99,45,26,2,55,1,88,0,57,15,20};
		System.out.println("Array before Bubble Sort \n" + Arrays.toString(a1));
		int temp = 0;
		int countSwaps = 0;
		int outerCount = 0;
		boolean isSorted = true;
		
		for(int i = 0; i<a1.length-1; i++)
		{
			for(int j =1; j<a1.length; j++)
			{
				
				if(a1[j-1] > a1[j])
				{
					temp = a1[j-1];
					a1[j-1] = a1[j];
					a1[j] = temp;	
					countSwaps++;
					isSorted = false;
				}
			}
			outerCount++;
			
			if(isSorted == true)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(a1) + " swaps: " + countSwaps + " outer count: " + outerCount);
	}
}
