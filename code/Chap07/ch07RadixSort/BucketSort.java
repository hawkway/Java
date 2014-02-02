/**
 * @author Dr. Paul Mullins
 * @version Mar 24, 2009
 */
public class BucketSort {
	private BucketList list;
	private int numElems;

	public BucketSort(int A[], int numElems, int numDigits)
	{
		list = new BucketList(numElems);
		
		for(int digNum=1; digNum<=numDigits; digNum++)
		{
			for (int indx=0; indx<numElems; indx++)
				list.putInBucket(A[indx], digNum);
			
		    System.out.print("Pass "+digNum+": ");
			for (int i=0; i<numElems; i++)
			    System.out.printf("%5d",A[i]);
		    System.out.println();
		    list.display();
		    
		    int count = 0;
		    for (int bucketNum = 0; bucketNum<10; bucketNum++)
		    {
		    	Queue aBucket = list.getQueue(bucketNum);
		    	while (!aBucket.isEmpty())
		    		A[count++] = aBucket.remove();
		    }
			
		}
		
	}

}
