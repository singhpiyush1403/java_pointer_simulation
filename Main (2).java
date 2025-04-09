class Pointer {
    int value;
}

public class Main {
    public static void main(String[] args) {
        Pointer a = new Pointer();
        a.value = 10;

        Pointer b = a;  
        b.value = 20;

        System.out.println("a.value = " + a.value); 
    }
}