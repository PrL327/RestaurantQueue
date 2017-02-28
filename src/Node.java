/**
 * 
 * @author Peter Laskai
 */
public class Node<E>
{
	private E data;
	private Node<E> link;
	
	/**
	 * Constructor for Class StringNode
	 * @param initialData
	 * @param initialLink
	 */
	
	public Node(E initialData, Node<E> initialLink)
	{
		data = initialData;
		link = initialLink;
	}
	
	/**gets private variable data
	 * 
	 * @return data
	 */
	public E getData()
	{
		return data;
	}
	/**
	 * gets private variable link
	 * @return link
	 */
	public Node<E> getLink()
	{
		return link;
	}
	/**
	 * sets the value of param data from initialData
	 * @param initialData
	 */
	public void setData(E initialData)
	{
		this.data = initialData;
	}
	/**
	 * sets the value of param link from intialLink
	 * @param initialLink
	 */
	public void setLink(Node<E> initialLink)
	{
		this.link = initialLink;
	}
}
