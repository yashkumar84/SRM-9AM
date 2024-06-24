// class Queue {
// int[] arr;
// int capacity;
// int front;
// int rear;

// Queue(int capacity) {
// this.capacity = capacity;
// this.rear = -1;
// this.front = -1;
// this.arr = new int[capacity];

// }

// void enqueue(int data) {

// if (isFull()) {
// System.out.println("Insertion Not Possible");
// return;
// }
// if (front == -1) {
// front++;

// }

// arr[++rear] = data;

// }

// int dQueue() {
// if (isEmpty()) {
// System.out.println("Deletion is Not Possible");
// return -1;
// }

// int data = arr[front];
// front++;

// if (front == arr.length) {
// front = -1;
// }
// return data;
// }

// int peek() {
// if (isEmpty()) {
// System.out.println("Deletion is Not Possible");
// return -1;
// }

// return arr[front];
// }

// boolean isFull() {
// return rear == arr.length - 1;
// }

// boolean isEmpty() {
// return front == -1;
// }
// }

// public class QueueImplementation {
// public static void main(String[] args) {
// Queue q = new Queue(5);
// q.enqueue(1);
// q.enqueue(2);
// q.enqueue(3);
// q.enqueue(4);
// System.out.println(q.dQueue());
// System.out.println(q.peek());
// }

// }
