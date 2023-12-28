import java.util.*;

class Animal {
    void eatSomething() {
        System.out.println("eating something");
    }
}

class Dog extends Animal {
    @Override
    void eatSomething() {
        System.out.println("eating foods");
    }
}

class A {
    void m() {
        System.out.println("Good Morning");
    }

    @Deprecated
    void n() {
        System.out.println("Good Evening");
    }
}

class Week8b {
    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        Animal a = new Dog();
        a.eatSomething();

        A objA = new A();
        objA.n();

        
        ArrayList list = new ArrayList();
        list.add("Luffy");
        list.add("Zoro");
        list.add("Sanji");
        for (Object obj : list)
            System.out.println(obj);

    }
}
