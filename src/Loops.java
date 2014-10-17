import java.util.*;



public class Loops {

	public static void main(String[] args)
	{
		bubbleSort();
		//largeBubbleSort();
	}
	
	public static void bubbleSort()
	{
		
		int[] a1 = {5,4,3,2,1};

		System.out.println("Array 1 before Bubble Sort \n" + Arrays.toString(a1));
		int temp = 0;
		int countSwaps = 0;
		int outerCount = 0;
		
		for(int i =0; i< a1.length-1; i++)
		{
			for(int j = 0; j<a1.length-1; j++)
			{
				if(a1[j] > a1[j+1])
				{
					temp = a1[j+1];
					a1[j+1] = a1[j];
					a1[j] = temp;
					countSwaps++;
				}
			}
			outerCount++;
		}
		System.out.println("Array 1 after Bubble Sort \n" + Arrays.toString(a1));
		System.out.println("Number of swaps: " + countSwaps + "  Number of runs: " + outerCount);
	}
	
	public static void largeBubbleSort()
	{
		int[] a2 = new int[10000000];
		int temp2 = 0;
		int swaps = 0;
		long countSwaps = 0;
		int outerRun = 0;
		int counter = 0;
		
		Random r = new Random();
		int rand = 0;
		
		for(int i = 0; i<a2.length; i++)
		{
			rand = r.nextInt(100);
			a2[i] = rand;
		}
		System.out.println("\nArray 2 before Bubble Sort \n" + Arrays.toString(a2));
		
		for(int k=0; k<a2.length; k++)
		{
			for(int j=0; j<a2.length-1; j++)
			{
				if(a2[j] > a2[j+1])
				{
					temp2 = a2[j+1];
					a2[j+1] = a2[j];
					a2[j] = temp2;
					countSwaps++;
				}
			}
			outerRun++;
		}
		System.out.println("\nArray 2 after Bubble Sort \n" + Arrays.toString(a2));
		System.out.println("\nNumber of swaps: " + countSwaps + "  Number of runs: " + outerRun);
	}
}
