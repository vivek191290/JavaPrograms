hpackage com.java.basic;

public class Stack {

	static LinkedList stack = new LinkedList();
	   
	   public void push(Object data)
	   {
	       
	       stack.addLast(data);
	   }
	   
	   public void pop()
	   {
	       stack.deleteLast();
	       
	   }
	   
	   public void print()
	   {
	           stack.display();
	   }

	   public static void main(String[] args) {
	       Stack data = new Stack();
	       data.push(10);
	       data.print();
	       data.push(20);
	       data.print();
	       data.push(30);
	       data.print();
	       data.pop();
	       data.print();
	       data.pop();
	       data.print();
	       data.pop();
	       data.print();
	       data.pop();
	       data.print();
	       
	   }

}
