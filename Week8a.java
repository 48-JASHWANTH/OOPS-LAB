public class Week8a{
    public static void main(String[] args) {
        int a1 = 42;
        Integer a2 = a1; 

        char b1 = 'A';
        Character b2 = b1;
        
        System.out.println("Autoboxing:");
        System.out.println("Primitive Int: " + a1);
        System.out.println("Wrapper Int: " + a2);
        System.out.println("Primitive Char: " + b1);
        System.out.println("Wrapper Char: " + b2);

        int a3 = a2; 
        char b3 = b2;

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper Int: " + a2);
        System.out.println("Unboxed Int: " + a3);
        System.out.println("Wrapper Char: " + b2);
        System.out.println("Unboxed Char: " + b3);
    }
}
