class Box<T> {

    T contents;

    public void set(T obj) {
        this.contents = obj;
    }
    public T get() {
        return contents;
    }

    public boolean isEmpty() {
        return contents == null;
    }
}

public class Week7a{
    public static void main(String[] args) {
        // Create a Box object to hold an Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);

        // Print the contents of the integerBox
        System.out.println("Integer box contents: " + integerBox.get());

        // Create a Box object to hold a String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, World!");

        // Print the contents of the stringBox
        System.out.println("String box contents: " + stringBox.get());

        // Check if the integerBox is empty
        System.out.println("Is integerBox empty? " + integerBox.isEmpty());

        // Check if the stringBox is empty
        System.out.println("Is stringBox empty? " + stringBox.isEmpty());
    }
}
