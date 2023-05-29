/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 
 */
import java.util.*;
public class MinStack {
    Stack<Integer> s1,s2=new Stack<>();

    public MinStack() {
       
        
    }
    
    public void push(int val) {
       if(s1.isEmpty() || val<=s1.peek())
       {
        s2.push(val);
       }
       s1.push(val);
        
    }
    
    public void pop() {
        if(s1.peek()==s2.peek())
        {
            s2.pop();
        }
        s1.pop();
        
    }
    
    public int top() {
        return s1.peek();
        
    }
    
    public int getMin() {
       return s2.peek();

        
    }
    public static void main(String[] args)
    {
        MinStack msObj=new MinStack();
        msObj.push(2);
        msObj.push(5);
        msObj.push(-3);
        System.out.println(msObj.getMin());


    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
    

