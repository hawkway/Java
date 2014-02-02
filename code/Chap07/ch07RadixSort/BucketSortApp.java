/**
 * @author Dr. Paul Mullins
 * @version Mar 24, 2009
 */
import java.util.Scanner;

public class BucketSortApp {
    static int[] nums;
    static int size;
    static int numDigits;

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the max number of digits: ");
		numDigits = keyboard.nextInt();
		System.out.print("Enter the number of elements: ");
		size = keyboard.nextInt();
		
		nums = new int[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.print("Enter an element: ");
			nums[i] = keyboard.nextInt();
		}
		
		/*
		numDigits = 3;
		size = 15;
		nums = new int[size];
		for(int i=0; i<size; i++)
			nums[i] = (int) (Math.random() * 999);
		*/
		
		BucketSort sorter = new BucketSort(nums, size, numDigits);
		
		System.out.println("Final order:");
		for(int i=0; i<size; i++)
			System.out.printf("%5d",nums[i]);
		System.out.println();

	}

}
