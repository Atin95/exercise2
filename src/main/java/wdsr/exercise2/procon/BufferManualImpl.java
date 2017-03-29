package wdsr.exercise2.procon;

import java.util.LinkedList;

/**
 * Task: implement Buffer interface without using any *Queue classes from java.util.concurrent package.
 * Any combination of "synchronized", *Lock, *Semaphore, *Condition, *Barrier, *Latch is allowed.
 */
public class BufferManualImpl implements Buffer
{
	private LinkedList<Order> ll = new LinkedList<>();
	
	public void submitOrder(Order order) throws InterruptedException
	{
		synchronized(ll)
		{
			ll.add(order);
		}
	}
	
	public synchronized Order consumeNextOrder() throws InterruptedException 
	{
		synchronized (ll) 
		{
			return ll.removeFirst();
		}
	}
}
