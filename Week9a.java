class Temp extends Thread {
    String mes;
    int in;

    public Temp(String mes, int in) {
        this.mes = mes;
        this.in = in;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(mes);
            try {
                Thread.sleep(in);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Week9a{
    public static void main(String[] args) {
        Temp th1 = new Temp("Good Morning", 1000);
        Temp th2 = new Temp("Hello", 2000);
        Temp th3 = new Temp("Welcome", 3000);

        th1.start();
        th2.start();
        th3.start();
    }
}
