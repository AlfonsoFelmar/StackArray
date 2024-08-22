package Stack;

import java.util.Stack;

/**
 *
 * @author felmaralfonso
 */
public class Stack1 {

    public static void main(String[] args) {
        StackClass stack = new StackClass(5);
        

        
        stack.push(100);
        stack.push(5);
        stack.push(50);
        stack.push(500);
        stack.push(90);
        
        System.out.println("Top element: " + stack.peek());
        
        System.out.println("Top element: " + stack.pop());
        
        System.out.println("Top element:(After pop) " + stack.peek());
        
     
        
        System.out.println("\nElements in Stack:");
        while (!stack.isEmpty()) {   
            double popping = stack.pop();
            System.out.println(popping);
            
        }
        
        
    }
    
}
