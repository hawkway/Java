// http://www.easywayserver.com/blog/java-queue-example/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> qe=new LinkedList<String>();

        qe.add("b");
        qe.add("a");
        qe.add("c");
        qe.add("e");
        qe.add("d");

        Iterator it=qe.iterator();

        System.out.println("Initial Size of Queue :"+qe.size());

        while(it.hasNext())
        {
            String iteratorValue=(String)it.next();
            System.out.println("Queue Next Value :"+iteratorValue);
        }

        // get value and does not remove element from queue
        System.out.println("Queue peek :"+qe.peek());

        // get first value and remove that object from queue
        System.out.println("Queue poll :"+qe.poll());

        System.out.println("Final Size of Queue :"+qe.size());
    }
}
/*
Initial Size of Queue :5
Queue Next Value :b
Queue Next Value :a
Queue Next Value :c
Queue Next Value :e
Queue Next Value :d
Queue peek :b
Queue poll :b
Final Size of Queue :4 
*/