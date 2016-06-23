package PPSengine.net;

import java.lang.*;
import java.io.*;
import java.util.*;

interface PPSengineInterface {
    int n = 20;
    
    public void pop();

    public void push();

    public void dup();
    
    public void add();
    
    public void sub();
    
    public void mul();
    
    //public void dev();
    
    public void display();
}



public class PPSengine implements PPSengineInterface {
    int arr[] = new int[n];
    int top = -1;

    public void push() {
            try {
                    DataInputStream dis = new DataInputStream(System.in);
                    System.out.println("Enter Element:");
                    int ele = Integer.parseInt(dis.readLine());
                    arr[++top] = ele;
            } catch (Exception e) {
                    System.out.println("e");
            }
    }

    public void pop() {
            int popper = arr[top];
            top--;
            System.out.println("popped element: " + popper);
    }

    public void dup() {
            int popper = arr[top];
            arr[++top] = popper;
            System.out.println("dup element; " + popper);
    }
    
    	public void add() {
        int popper = arr[top];
        
        int st = arr[top--];
        top--;
        int ad = (popper + st);
        arr[++top] = ad;
        System.out.println("add the two top elements: " + popper);
    }
    public void sub() {
        int popper = arr[top];
        
        int st = arr[top--];
        top--;
        int ad = (popper - st);
        arr[++top] = ad;
        System.out.println("add the two top elements: " + popper);
    }
    
    public void mul() {
    	int popper = arr[top];
    	
        int st = arr[top--];
        top--;
        int ad = popper*st;
        arr[++top] = ad;
        System.out.println("mul: " + ad);
    }
        
   /* public void div() {
    	int popper = arr[top];
    	
        int st = arr[top--];
        top--;
        int ad = popper/st;
        arr[++top] = ad;
        System.out.println("div: " + ad);
    }*/
        
    public void display() {
            if (top < 0) {
                    System.out.println("Stack is empty");
                    return;
            } else {
                    String str = " ";
                    for (int i = 0; i <= top; i++)
                            str = str + " " + arr[i];
                    System.out.println("Elements are " + str);
            }
    }
}

class StackPPSengine {
    public static void main(String arg[]) throws IOException {
            DataInputStream dis = new DataInputStream(System.in);
            PPSengine stk = new PPSengine();
            int menu = 0;
            do {
                    System.out.println("1.push 2.pop 3.dup 4.add 5.sub 6. mul 7. div 8.display 9.Exit");
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    menu = Integer.parseInt(dis.readLine());
                    switch (menu) {
                    case 1:
                            stk.push();
                            break;
                    case 2:
                            stk.pop();
                            break;
                    case 3:
                            stk.dup();
                            break;
                   case 4:
                        stk.add();
                        break;
                    case 5:
                        stk.sub();
                        break;
                    case 6:
                        stk.mul();
                        break;
                /*  case 7:
                        stk.div();
                        break;
                         */         
                    case 8:
                            stk.display();
                            break;
                      
                    case 9:
                            System.exit(0);
                    }
            } while (menu <= 9);
            System.out.println();
    }
}