class MyQueue{
    Stack<Integer> in;
    Stack<Integer> out;
    /** Initialize your data structure here. */
    public MyQueue() {
        in = new Stack();
        out = new Stack();
    }
    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return out.pop();
    }
    /** Get the front element. */
    public int peek() {
        if (out.isEmpty()) {
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.peek();
    }


    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

}




















//time complexity: o(1)
//spcae complexity: o(n)
// class MyQueue {
//     private Stack<Integer> s1 = new Stack<>();
//     private Stack<Integer> s2 = new Stack<>();

//     /** Initialize your data structure here. */
//     public MyQueue() {

//     }

//     /** Push element x to the back of queue. */
//     public void push(int x) {
//         s1.push(x);
//     }

//     /** Removes the element from in front of queue and returns that element. */
//     public int pop() {
//         if (s2.isEmpty()) {
//             while (!s1.isEmpty())
//                 s2.push(s1.pop());
//         }
//         return s2.pop();
//     }

//     /** Get the front element. */
//     public int peek() {
//         if (!s2.isEmpty()) {
//             return s2.peek();
//         } else {
//             while (!s1.isEmpty())
//                 s2.push(s1.pop());
//         }
//         return s2.peek();
//     }

//     /** Returns whether the queue is empty. */
//     public boolean empty() {
//         return s1.isEmpty() && s2.isEmpty();
//     }
// }






/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */