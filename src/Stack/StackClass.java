package Stack;

/**
 *
 * @author felmaralfonso
 */
public class StackClass {
    
    private int maxSize;
    private double[] StackArray;
    private int top;
    
    public StackClass(int Size){
        // pwede e this
        maxSize = Size;
        StackArray = new double[maxSize];
        top = -1;
        
        
    }
    
    public void push(double number){
        if (!isFull()) {
           StackArray[++top] = number;
        } else {
            System.out.println("You're stack is full");
        }
    }
    


    
    public double pop(){
        
        if (!isEmpty()) {
            return StackArray[top--];
        }
        
        else {
            System.out.println("Stack is Empty");
            return -1;          
        }
    
    }
    
    public double peek(){
        if (!isEmpty()) {
            return StackArray[top];
        }
        else {
            System.out.println("Stack is Empty"
                    + ", so you can't see anything");
            return -1;
        }
    }
    
    public boolean isEmpty(){
         return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize -1);
    }

   

}
