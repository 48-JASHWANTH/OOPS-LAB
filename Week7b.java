import java.util.*;

class Stack<T> {

    ArrayList<T> stackArray;

    public Stack() {
        this.stackArray = new ArrayList<>();
    }

    public void push(T obj) {
        stackArray.add(obj);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return stackArray.remove(stackArray.size() - 1);
    }

    public boolean isEmpty() {
        return stackArray.isEmpty();
    }
}

public class Week7b{

    public static void main(String[] args) {
        // Create a Stack object to hold Strings
        Stack<String> stringStack = new Stack<>();

        // Push elements onto the stack
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("!");

        // Pop elements from the stack
        String poppedElement;
        while (!stringStack.isEmpty()) {
            poppedElement = stringStack.pop();
            System.out.println("Popped element: " + poppedElement);
        }

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stringStack.isEmpty());
    }
}
