import java.util.Random;

class A extends Thread {
    public void run() {
        Random r = new Random();
        int n = r.nextInt(10) + 1;

        System.out.println("Thread 1: Number = " + n);

        if (n % 2 == 0)
            new B(n).start();
        else
            new C(n).start();
    }
}

class B extends Thread {
    int n;

    B(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Thread 2: Square = " + (n * n));
    }
}

class C extends Thread {
    int n;

    C(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Thread 3: Cube = " + (n * n * n));
    }
}

public class Main {
    public static void main(String[] args) {
        A t = new A();
        t.start();
    }
}
