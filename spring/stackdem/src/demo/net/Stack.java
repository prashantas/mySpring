package demo.net;

public class Stack {

	private int maxSize;
	   private long[] stackArray;
	   private int top;
	   public Stack(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
	      stackArray[++top] = j;
	   }
	   public long pop() {
	      return stackArray[top--];
	   }
	   public long peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
  public static void main(String[] args) {
	      Stack theStack = new Stack(10); 
	      
	  int n=5;
       do
       {   System.out.println("\n1.PUSH ELEMENT 2.POP ELEMENT 3.PEEK STACK 4.DISPLAY STACK 5.EXIT");
           System.out.print("ENTER YOUR CHOICE (1-5) : ");
           n=Integer.parseInt(br.readLine());
           if(n<1||n>5)    System.out.println("Error ! Try Again.");
           else 
               switch(n)
               {
                   case 1: 
                   theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      
                  // S.push(); break;
                   case 2: 
                   while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
           //        S.pop(); break;
             //      case 3: S.peek(); break;
               //    case 4: S.display(); break;
                   case 5: System.out.println("\nProgram Terminated");break;
               }
       }while(n!=5);
   }

	   
	}
