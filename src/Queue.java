/**
 * 
 * @author Peter Laskai
 * @param <E>
 */
public class Queue<E> 
{
	private Node<E> front;
	private Node<E> rear;
	private int manyItems;
	
	/**
	 * No arg constructor null, null, and zero
	 */
	public Queue()
	{
		front = null;
		rear = null;
		manyItems = 0;
	}
	/**
	 * adds to the queue "line"
	 * @param newValue
	 * @return void
	 */
	public void add(E newValue)
	{
		if( rear == null)
		{
			front = new Node<E>(newValue, null);
			rear = front;
		}
		else
		{
			rear.setLink(new Node<E>(newValue,null));
			rear = rear.getLink();
		}
		manyItems++;
	}
	/**
	 * removes element/value from the queue
	 * @param null
	 * @return value
	 */
	public E remove()
	{
		E value;
		if (front == null)
			value = null;
		else
		{
			value = front.getData();
			if (front !=rear)
				front = front.getLink();
			else
			{
				front = null;
				rear = null;
			}
			manyItems--;
		}
		return value;
	}
	/**
	 * returns size of the queue
	 * @return manyItems
	 */
	public int size()
	{
		return manyItems;
	}
}
