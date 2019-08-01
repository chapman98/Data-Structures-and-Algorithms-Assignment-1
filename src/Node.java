// Callum Chapman
// Student Number 17828243
//CI284

public class Node {
 public int ID; //data in node
 public String creator;
 public String owner;
 public int priority;
 public Node previous; //previous node
 public Node next; //next node
 
 public Node(int ID, String creator, String owner, int priority)//create first node
 {
	 previous = null; //link to previous node
	 this.ID = ID; //ID in node
	 this.creator = creator; //creator in node
	 this.owner = owner; //owner in node
	 this.priority = priority; //priority in node
	 next = null; //link to next node
 }
 
 public Node(Node previous, int ID, String creator, String owner, int priority, Node next)//create node if head exists
 {
	 this.previous = previous; //link to previous node
	 this.ID = ID; //ID in node
	 this.creator = creator; //creator in node
	 this.owner = owner; //owner in node
	 this.priority = priority; //priority in node
	 this.next = next; //link to next node
 }
 
 public int ID()
 {
	 return ID; //return ID in node
 }
 
 public String creator()
 {
	 return creator; //return creator in node
 }
 
 public String owner()
 {
	 return owner; //return owner in node
 }
 
 public int priority()
 {
	 return priority; //return priority in node
 }

}
