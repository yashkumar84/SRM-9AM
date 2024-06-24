class Stack {

    int arr[];
    int capacity;
    int top;

    Stack(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Can not push Element");
            return;
        }

        arr[++top] = data;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Can not Pop Element");
            return -1;
        }
        int data = arr[top];
        top--;
        return data;

    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Can not Peek Element");
            return -1;
        }
        return arr[top];

    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

}

public class StackImplementation {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.pop());
        System.out.println(st.peek());

    }
}
