// Callum Chapman
// Student Number 17828243
//CI284

public class Main {
	
	static DoublyLinkedList priority_1 = new DoublyLinkedList(); //priority 1 list
	static DoublyLinkedList priority_2 = new DoublyLinkedList(); //priority 2 list
	static DoublyLinkedList priority_3 = new DoublyLinkedList(); //priority 3 list
	static DoublyLinkedList priority_4 = new DoublyLinkedList(); //priority 3 list
	static int ID = 1; //ID will be increase with each node entered in to the list
	
	public static void main(String[] args) {
		//adding people to the queue
		addAtBack("Callum" , "Bill" , 1); 	//creator: Callum   owner: bill   priority: 1
		addAtBack("John" , "Bill" , 3);		//creator: John   	owner: bill   priority: 3
		addAtBack("Allyson" , "Bill" , 2);	//creator: Allyson  owner: bill   priority: 2
		addAtBack("jill" , "Bill" , 4);		//creator: Jill   	owner: bill   priority: 4
		addAtBack("Liam" , "Bill" , 3);		//creator: Liam   	owner: bill   priority: 3
		addAtBack("jim" , "Bill" , 1);		//creator: Jim   	owner: bill   priority: 1
		addAtBack("Becky" , "Bill" , 4);	//creator: Becky   	owner: bill   priority: 4
		addAtBack("Tony" , "Bill" , 2);		//creator: Tony   	owner: bill   priority: 2
		addAtBack("Freddie" , "Bill" , 3);	//creator: Freddie  owner: bill   priority: 3
		addAtBack("Pam" , "Bill" , 4);		//creator: Pam   	owner: bill   priority: 4
		//finshed adding people
		
		print();//print queue
		System.out.println("-----------------------------------");
		sawpPriorityBycreator("Callum", 3); //change Callum to priority 3
		sawpPriorityByID(3,1); //change ID 3(Allyson) to priority 1
		deleteBycreator("Pam"); //remove Pam
		print(); //print queue
		size(); //print the size
		System.out.println("-----------------------------------");
		deleteFront(1); //remove first ticket from priority 1 (Jim)
		print();//print queue
	}

//------------------------------------------------------------------------------------
	
	public static void print() //print queue
	{
		priority_1.print(); //print priority 1
		priority_2.print(); //then print priority 2
		priority_3.print(); //then print priority 3
		priority_4.print(); //then print priority 4
	}
	
//------------------------------------------------------------------------------------
	
	public static void size() //print size of all lists
	{
		System.out.println("Size: " + (priority_1.size() + priority_2.size() + priority_3.size() + priority_4.size() ));	
	}
	
//------------------------------------------------------------------------------------	
	
	public static void addAtBack(String creator, String owner, int priority) //add to the back of a queue
	{
		switch(priority)//check which priority it is
		{
		case 1: //if priority 1 then
			priority_1.addRear(ID++, creator, owner, priority); //add ticket to the back of the list
			break;
		case 2: //if priority 2 then
			priority_2.addRear(ID++, creator, owner, priority); //add ticket to the back of the list
			break;
		case 3:  //if priority 3 then
			priority_3.addRear(ID++, creator, owner, priority); //add ticket to the back of the list
			break;
		case 4:  //if priority 4 then
			priority_4.addRear(ID++, creator, owner, priority); //add ticket to the back of the list
			break;
		default: //if none of the above then
			System.out.println("invalid Priority"); //print invalid priority
		}
	}
	
//------------------------------------------------------------------------------------
	
	public static void copyNode(int ID, String creator, String owner, int priority)
	{
		switch(priority)//check which priority it is
		{
		case 1: //if priority 1 then
			priority_1.addRear(ID++, creator, owner, priority); //add ticket to the back of the list
			break;
		case 2: //if priority 2 then
			priority_2.addRear(ID++, creator, owner, priority); //add ticket to the back of the list
			break;
		case 3:  //if priority 3 then
			priority_3.addRear(ID++, creator, owner, priority); //add ticket to the back of the list
			break;
		case 4:  //if priority 4 then
			priority_4.addRear(ID++, creator, owner, priority); //add ticket to the back of the list
			break;
		default: //if none of the above then
			System.out.println("invalid Priority"); //print invalid priority
		}
	}
	
//------------------------------------------------------------------------------------

	public static void addAtFront(String creator, String owner, int priority)
	{
		switch(priority)//check which priority it is
		{
		case 1: //if priority 1 then
			priority_1.addFront(ID++, creator, owner, priority); //add ticket to the front of the list
			break;
		case 2: //if priority 2 then
			priority_2.addFront(ID++, creator, owner, priority); //add ticket to the front of the list
			break;
		case 3: //if priority 3 then
			priority_3.addFront(ID++, creator, owner, priority); //add ticket to the front of the list
			break;
		case 4: //if priority 4 then
			priority_4.addFront(ID++, creator, owner, priority); //add ticket to the front of the list
			break;
		default: //if none of the above then
			System.out.println("invalid Priority"); //print invalid priority
		}
	}
	
//------------------------------------------------------------------------------------
	
	public static void addInMiddle(String creator, String owner, int priority, int index)
	{
		switch(priority)//check which priority it is
		{
		case 1: //if priority 1 then
			priority_1.insertAt(ID++, creator, owner, priority, index); //add ticket at the index in the list
			break;
		case 2: //if priority 2 then
			priority_2.insertAt(ID++, creator, owner, priority, index); //add ticket at the index in the list
			break;
		case 3: //if priority 3 then
			priority_3.insertAt(ID++, creator, owner, priority, index); //add ticket at the index in the list
			break;
		case 4: //if priority 4 then
			priority_4.insertAt(ID++, creator, owner, priority, index); //add ticket at the index in the list
			break;
		default: //if none of the above then
			System.out.println("invalid Priority"); //print invalid priority
		}
	}
	
//------------------------------------------------------------------------------------
		
		public static void deleteFront(int priority)
		{
			switch(priority)//check which priority it is
			{
			case 1: //if priority 1 then
				priority_1.removeFront(); //remove ticket at the front of the list
				break;
			case 2: //if priority 2 then
				priority_2.removeFront(); //remove ticket at the front of the list
				break;
			case 3: //if priority 3 then
				priority_3.removeFront(); //remove ticket at the front of the list
				break;
			case 4: //if priority 4 then
				priority_4.removeFront(); //remove ticket at the front of the list
				break;
			default: //if none of the above then
				System.out.println("invalid Priority"); //print invalid priority
			}
		}
		
//------------------------------------------------------------------------------------
	
		public static void deleteBack(int priority)
		{
			switch(priority)//check which priority it is
			{
			case 1: //if priority 1 then
				priority_1.removeRear();  //remove ticket at the back of the list
				break;
			case 2: //if priority 2 then
				priority_2.removeRear();  //remove ticket at the back of the list
				break;
			case 3: //if priority 3 then
				priority_3.removeRear();  //remove ticket at the back of the list
				break;
			case 4: //if priority 4 then
				priority_4.removeRear();  //remove ticket at the back of the list
				break;
			default: //if none of the above then
				System.out.println("invalid Priority"); //print invalid priority
			}
		}
		
//------------------------------------------------------------------------------------

		public static void deleteFromMiddle(int priority, int index)
		{
			switch(priority)//check which priority it is
			{
			case 1: //if priority 1 then
				priority_1.removeAt(index);  //remove ticket at the index of the list
				break;
			case 2: //if priority 2 then
				priority_2.removeAt(index);  //remove ticket at the index of the list
				break;
			case 3: //if priority 3 then
				priority_3.removeAt(index);  //remove ticket at the index of the list
				break;
			case 4: //if priority 4 then
				priority_4.removeAt(index);  //remove ticket at the index of the list
				break;
			default: //if none of the above then
				System.out.println("invalid Priority"); //print invalid priority
			}
		}
		
//------------------------------------------------------------------------------------
		
		public static void sawpPriorityByOwner(String owner, int priority)//swap priority by owner
		{
		 
			int search1 = priority_1.searchByOwner(owner); //search by owner in priority 1 list
			int search2 = priority_2.searchByOwner(owner); //search by owner in priority 2 list
			int search3 = priority_3.searchByOwner(owner); //search by owner in priority 3 list
			int search4 = priority_4.searchByOwner(owner); //search by owner in priority 4 list
			

			if (search1 > 0 ) //if search from priority 1 list is greater than 0 then
			{
				//make a new ticket with the same ID, Creator and Owner then delete the old one
				copyNode(priority_1.getID(search1), priority_1.getCreator(search1), priority_1.getOwner(search1), priority);
				priority_1.removeAt(search1);
			}
			else
				if (search2 > 0 ) //else if search from priority 2 list is greater than 0 then
				{
					//make a new ticket with the same ID, Creator and Owner then delete the old one
					copyNode(priority_2.getID(search2), priority_2.getCreator(search2), priority_2.getOwner(search2),  priority);
					priority_2.removeAt(search2);
				}
			else
				if (search3 > 0 ) //else if search from priority 3 list is greater than 0 then
				{
					//make a new ticket with the same ID, Creator and Owner then delete the old one
					copyNode(priority_3.getID(search3), priority_3.getCreator(search3), priority_3.getOwner(search3),  priority);
					priority_3.removeAt(search3);
				}
				else
					if (search4 > 0 ) //else if search from priority 1 list is greater than 0 then
					{
						//make a new ticket with the same ID, Creator and Owner then delete the old one
						copyNode(priority_4.getID(search4), priority_4.getCreator(search4), priority_4.getOwner(search4), priority);
						priority_4.removeAt(search4);
					}
					else
					{
						//else print "search not found"
						System.out.println("search not found");
					}
			
			
		}
		
//------------------------------------------------------------------------------------		
				
		public static void sawpPriorityBycreator(String creator, int priority)//swap priority by creator
		{
		 
			int search1 = priority_1.searchByCreator(creator); //search by creator in priority 1 list
			int search2 = priority_2.searchByCreator(creator); //search by creator in priority 2 list
			int search3 = priority_3.searchByCreator(creator); //search by creator in priority 3 list
			int search4 = priority_4.searchByCreator(creator); //search by creator in priority 4 list
			

			if (search1 > 0 )//if search from priority 1 list is greater than 0 then
			{
				//make a new ticket with the same ID, Creator and Owner then delete the old one
				copyNode(priority_1.getID(search1), priority_1.getCreator(search1), priority_1.getOwner(search1), priority);
				priority_1.removeAt(search1);
			}
			else
				if (search2 > 0 )//else if search from priority 2 list is greater than 0 then
				{
					//make a new ticket with the same ID, Creator and Owner then delete the old one
					copyNode(priority_2.getID(search2), priority_2.getCreator(search2), priority_2.getOwner(search2),  priority);
					priority_2.removeAt(search2);
				}
			else
				if (search3 > 0 )//else if search from priority 3 list is greater than 0 then
				{
					//make a new ticket with the same ID, Creator and Owner then delete the old one
					copyNode(priority_3.getID(search3), priority_3.getCreator(search3), priority_3.getOwner(search3),  priority);
					priority_3.removeAt(search3);
				}
				else
					if (search4 > 0 )//else if search from priority 4 list is greater than 0 then
					{
						//make a new ticket with the same ID, Creator and Owner then delete the old one
						copyNode(priority_4.getID(search4), priority_4.getCreator(search4), priority_4.getOwner(search4), priority);
						priority_4.removeAt(search4);
					}
					else
					{
						//else print "search not found"
						System.out.println("search not found");
					}
			
			
		}
		
//------------------------------------------------------------------------------------		
			
		public static void sawpPriorityByID(int ID, int priority)//swap priority by ID
		{
		 
			int search1 = priority_1.searchByID(ID); //search by ID in priority 1 list
			int search2 = priority_2.searchByID(ID); //search by ID in priority 2 list
			int search3 = priority_3.searchByID(ID); //search by ID in priority 3 list
			int search4 = priority_4.searchByID(ID); //search by ID in priority 4 list
			

			if (search1 > 0 )//if search from priority 1 list is greater than 0 then
			{
				//make a new ticket with the same ID, Creator and Owner then delete the old one
				copyNode(priority_1.getID(search1), priority_1.getCreator(search1), priority_1.getOwner(search1), priority);
				priority_1.removeAt(search1);
			}
			else
				if (search2 > 0 )//else if search from priority 2 list is greater than 0 then
				{
					//make a new ticket with the same ID, Creator and Owner then delete the old one
					copyNode(priority_2.getID(search2), priority_2.getCreator(search2), priority_2.getOwner(search2),  priority);
					priority_2.removeAt(search2);
				}
			else
				if (search3 > 0 )//else if search from priority 3 list is greater than 0 then
				{
					//make a new ticket with the same ID, Creator and Owner then delete the old one
					copyNode(priority_3.getID(search3), priority_3.getCreator(search3), priority_3.getOwner(search3),  priority);
					priority_3.removeAt(search3);
				}
				else
					if (search4 > 0 )//else if search from priority 4 list is greater than 0 then
					{
						//make a new ticket with the same ID, Creator and Owner then delete the old one
						copyNode(priority_4.getID(search4), priority_4.getCreator(search4), priority_4.getOwner(search4), priority);
						priority_4.removeAt(search4);
					}
					else
					{
						//else print "search not found"
						System.out.println("search not found");
					}
			
			
		}

		//------------------------------------------------------------------------------------
		
				public static void deleteByOwner(String owner)//delete by owner
				{
				 
					int search1 = priority_1.searchByOwner(owner); //search by owner in priority 1 list
					int search2 = priority_2.searchByOwner(owner); //search by owner in priority 2 list
					int search3 = priority_3.searchByOwner(owner); //search by owner in priority 3 list
					int search4 = priority_4.searchByOwner(owner); //search by owner in priority 4 list
					

					if (search1 > 0 )//if search from priority 1 list is greater than 0 then
					{
						//remove ticket
						priority_1.removeAt(search1);
					}
					else
						if (search2 > 0 )//else if search from priority 2 list is greater than 0 then
						{
							//remove ticket
							priority_2.removeAt(search2);
						}
					else
						if (search3 > 0 )//else if search from priority 3 list is greater than 0 then
						{
							//remove ticket
							priority_3.removeAt(search3);
						}
						else
							if (search4 > 0 )//else if search from priority 4 list is greater than 0 then
							{
								//remove ticket
								priority_4.removeAt(search4);
							}
							else
							{
								//else print "search not found"
								System.out.println("search not found");
							}
					
					
				}
				
		//------------------------------------------------------------------------------------		
						
				public static void deleteBycreator(String creator)//delete by creator
				{
				 
					int search1 = priority_1.searchByCreator(creator); //search by creator in priority 1 list
					int search2 = priority_2.searchByCreator(creator); //search by creator in priority 1 list
					int search3 = priority_3.searchByCreator(creator); //search by creator in priority 1 list
					int search4 = priority_4.searchByCreator(creator); //search by creator in priority 1 list
					

					if (search1 > 0 )//if search from priority 1 list is greater than 0 then
					{
						//remove ticket
						priority_1.removeAt(search1);
					}
					else
						if (search2 > 0 )//else if search from priority 2 list is greater than 0 then
						{
							//remove ticket
							priority_2.removeAt(search2);
						}
					else
						if (search3 > 0 )//else if search from priority 3 list is greater than 0 then
						{
							//remove ticket
							priority_3.removeAt(search3);
						}
						else
							if (search4 > 0 )//else if search from priority 4 list is greater than 0 then
							{
								//remove ticket
								priority_4.removeAt(search4);
							}
							else
							{
								//else print "search not found"
								System.out.println("search not found");
							}
					
					
				}
				
//------------------------------------------------------------------------------------		
					
				public static void deteteByID(int ID)//delete by ID
				{
				 
					int search1 = priority_1.searchByID(ID); //search by ID in priority 1 list
					int search2 = priority_2.searchByID(ID); //search by ID in priority 2 list
					int search3 = priority_3.searchByID(ID); //search by ID in priority 3 list
					int search4 = priority_4.searchByID(ID); //search by ID in priority 4 list
					

					if (search1 > 0 )//if search from priority 1 list is greater than 0 then
					{
						//remove ticket
						priority_1.removeAt(search1);
					}
					else
						if (search2 > 0 )//else if search from priority 2 list is greater than 0 then
						{
							//remove ticket
							priority_2.removeAt(search2);
						}
					else
						if (search3 > 0 )//else if search from priority 3 list is greater than 0 then
						{
							//remove ticket
							priority_3.removeAt(search3);
						}
						else
							if (search4 > 0 )//else if search from priority 4 list is greater than 0 then
							{
								//remove ticket
								priority_4.removeAt(search2);
							}
						else
							{
								//else print "search not found"
								System.out.println("search not found");
							}
					
					
				}

		
		
}
