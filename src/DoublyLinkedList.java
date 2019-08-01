// Callum Chapman
// Student Number 17828243
//CI284


public class DoublyLinkedList {

	
	private Node head;
	private int size;
	
	public DoublyLinkedList()
	{
		head = null; //head of the Doubly Linked List
		size = 0; //Doubly Linked List size counter 
	}
	
//------------------------------------------------------------------------------------
	
	public void addFront(int ID, String creator, String owner, int priority) // add a new node at the front
	{
		
		
	if(head == null) //checks to see if there is a head already
	{
		// if head hasn't been create yet then make the head
		head = new Node(null, ID, creator, owner, priority, null);
	}
	else
	{
		// if the head already exits insert new node
		//before head and make the new node the head
		Node newnode = new Node(null, ID, creator, owner, priority, head);
		head.previous = newnode;
		head = newnode;
	}
	size++; //increases size of the Doubly Linked List counter
	
	}
	
//------------------------------------------------------------------------------------
	
	public void insertAt(int ID, String creator, String owner,  int priority, int index) //insert a node at place in the list
	{
		if (head == null) return; //if there is no head then leave method
		
		if(index < 1 || index > size) return; // if the index is less of higher then
											  // the size of the list then leave method
		
		Node current = head; //change current node to the head
		int i = 1; //make a counter
				while (i < index) 
				{
					// while the count is less then the index number
					//keep going to the next node
					
					current = current.next; 
					i++;
				}
		if(current.previous == null)
		{
			//if the node before the current node is null add a new node before
			//current node and make new node the head
			
			Node newnode = new Node(null, ID, creator, owner, priority, current);
			current.previous = newnode;
			head = newnode;
		}
		else
		{
			//else make a new node between current and previous node
			// and link them to the new node
			
			Node newnode = new Node(current.previous, ID, creator, owner, priority, current);
			current.previous.next = newnode;
			current.previous = newnode;
		}
		 size++; //increase size of the list counter
	}
	
//------------------------------------------------------------------------------------
	
	public void addRear(int ID, String creator, String owner, int priority) //insert a node at the end of the list
	{
		if(head == null)
		{
			//if the list is empty/hasn't got a head then make a new head
			
			head = new Node(null, ID, creator, owner, priority, null);
		}
		else
		{
			//otherwise go to the end of the list and
			//add a new node on the end and link it up
			
			Node current = head;
			while(current.next != null)//check to see if at the end of the list
			{
				current= current.next;
			}
		
		Node newnode = new Node(current, ID, creator, owner, priority, null); //add new node
		current.next = newnode; //link new node to end of the list
		}
		size++; //increase size of list counter
	}
	
//------------------------------------------------------------------------------------
	
	public void removeFront() //remove node from end of the list
	{
		if(head == null) return; //if the list doesn't have a head/ is empty then leave method
		
		head = head.next; //change head to next node
		head.previous = null; //remove node at the front of the list
		size--; //decrease size of the list counter
	}
	
//------------------------------------------------------------------------------------
	
	public void removeAt(int index) //remove a node from a point in the list
	{
		if(head == null) return;  //if the list doesn't have a head/ is empty then leave method
		
		//if the index number is before the head or after the tail then leave method
		if(index < 1 || index > size)return; 
				
		Node current = head; //current node is the head
		int i = 1; //make a counter
		while(i < index) //while counter is less than index do
		{
			current = current.next; //change current node to the next node
			i++; //increment counter
		}
		if (current.next == null)// if the next node doesn't exist then
		{
			//remove link between current node and the previous node to delete it
			current.previous.next = null;
		}
		else
			if (current.previous == null)//if the previous node doesn't exist
			{
				current = current.next; // go to next node
				current.previous = null; //remove previous node
				head = current; // make current node the head
			}
			else
			{
				//else if both if statements are not true then remove not in the middle
				
				current.previous.next = current.next; //change link of previous node
				current.next.previous = current.previous; //change link of the next node
				
				//once the current node is not linked by other nodes then it will delete itself
			}
		size--; //decrease the size of the list counter
	}
	
//------------------------------------------------------------------------------------
	
	public void removeRear() //remove node from the rear
	{
		if (head == null) return;  //if the list doesn't have a head/ is empty then leave method
		
		if(head.next == null) //if the node next to the head doesn't exist then
		{
			head = null; //remove the head
			size--; //decrease size of the list counter
			return; //leave method
		}
		Node current = head; //make the head the current node
		while(current.next.next != null) //while the 2nd node in front exists do
		{
			current = current.next; //go to next node
		}
		current.next = null; //remove node at the rear
		size--; //decrease size of the list counter
	}
	
//------------------------------------------------------------------------------------
	
	public void print()// print out the whole list
	{
		Node current = head; //make the head the current node
		while(current != null) // while the current node exists do
		{
			 //print out the contents of the node
			System.out.println("ID: " + current.ID + "   Creator: " + current.creator + "   owner: " + current.owner + "   priority: " + current.priority);
			
			current = current.next; // go to next node
		}
	}
	
//------------------------------------------------------------------------------------
	
	public int size() //get the size of the list
	{
		return size; //return the size of the list
	}
	
//------------------------------------------------------------------------------------
	
	public boolean isEmpty()//checks if the the list is empty
	{
		return head == null; //return false if there is a head or false if the list is empty
	}
	
//------------------------------------------------------------------------------------

	public int searchByCreator(String creator)//search by creator
	{
		Node current = head; //current node is the head
		int i = 1; //make counter
		while(current != null) //while current node exists
		{
			if(current.creator == creator) // if node creator = inputed creator then
			{
				return i; //return position
			}
			current = current.next; // go to next node
			i++; //increase counter
		}
		
		return 0; // return 0 if can't find creator
	}
	
//------------------------------------------------------------------------------------
	
	public int searchByID(int ID)
	{
		Node current = head; //current node is the head
		int i = 1; //make counter
		while(current != null) //while current node exists
		{
			if(current.ID == ID)// if node creator = inputed creator then
			{
				return i; //return position
			}
			current = current.next; // go to next node
			i++; //increase counter
		}
		
		return 0; // return 0 if cant find creator
	}
	
//------------------------------------------------------------------------------------	
	
	public int searchByOwner(String owner )
	{
		Node current = head; //current node is the head
		int i = 1; //make counter
		while(current != null) //while current node exists
		{
			if(current.owner == owner)// if node creator = inputed creator then
			{
				return i; //return position
			}
			current = current.next; // go to next node
			i++; //increase counter
		}
		
		return 0; // return 0 if can't find creator
	}
	
	
	public String getOwner(int index)
	{		
		Node current = head; //current node is the head
		int i = 1; //make a counter
		while(i < index) //while counter is less than index do
		{
			current = current.next; //change current node to the next node
			i++; //increment counter
		}
		
		return current.owner; //returns owners name
	}
	
	public String getCreator(int index)
	{		
		Node current = head; //current node is the head
		int i = 1; //make a counter
		while(i < index) //while counter is less than index do
		{
			current = current.next; //change current node to the next node
			i++; //increment counter
		}
		
		return current.creator; //returns creators name
	}
	
	public int getID(int index)
	{		
		Node current = head; //current node is the head
		int i = 1; //make a counter
		while(i < index) //while counter is less than index do
		{
			current = current.next; //change current node to the next node
			i++; //increment counter
		}
		
		return current.ID; //returns ID number
	}

	
	
}
