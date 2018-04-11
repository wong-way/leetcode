package solution;

import java.util.Stack;

/**
 * Created by DELL on 2017-07-23.
 */
public class MinStack {
    private static Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Stack<Integer>();
    }

    public static void push(int x) {
        minStack.push(x);
    }

    public static void pop() {
       minStack.pop();
    }

    public static int top() {
        return minStack.peek();
    }

    public static int getMin() {
        int[] arr = new int[minStack.size()];
        int i = 0;
        int temp;
        while(!minStack.isEmpty()){
            arr[i]=minStack.pop();
            i++;
        }
        temp = arr[--i];
        while(i>=0){
            if(arr[i]<temp)
                temp = arr[i];
            minStack.push(arr[i]);
            i--;
        }
        return temp;
    }

    public static void main(String[] args) {
        MinStack minStack= new MinStack();
        minStack.push(2);
        minStack.push(-3);
        minStack.push(1);
        System.out.println(minStack.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */