package wdsr.exercise2.procon;

import java.util.concurrent.*;

/**
 * Task: implement Buffer interface using one of *Queue classes from java.util.concurrent package.
 */
public class BufferQueueImpl implements Buffer 
{
	private BlockingQueue<Order> bq = new LinkedBlockingQueue<>();
	
	public void submitOrder(Order order) throws InterruptedException 
	{
		bq.put(order);
	}
	
	public Order consumeNextOrder() throws InterruptedException 
	{
		return bq.take();
	}
}
