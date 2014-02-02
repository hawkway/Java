/**
 * @author Dr. Paul Mullins
 * @version Mar 24, 2009
 * Create an array of ten buckets for a radix (base 10) sort
 */

public class BucketList {
  private final int RADIX = 10;
  private Queue[] buckets = new Queue[RADIX];
  private int maxElems;
  
  public BucketList (int size){
	  maxElems = size;
	  for (int i=0; i< RADIX; i++)
		  buckets[i] = new Queue(size);
  }
  
  public void display(){
	  for (int i=0; i<RADIX; i++){
		  System.out.printf("%1d: ", i);
		  buckets[i].display();
	  }
  }
  
  public void putInBucket(int someNum, int digit)
  {
	  double adjust = 0.001; // account for real number representation errors
	  double divideBy = Math.pow(RADIX,digit);
	  double temp = (double)someNum / divideBy;
	  double temp2 = temp - Math.floor(temp);
	  temp2 = temp2*RADIX + adjust;
	  int bucketNum = (int) temp2;
	  buckets[bucketNum].insert(someNum);
  }
  
  public Queue getQueue(int num)
  {
	  return buckets[num];
  }
  
}
