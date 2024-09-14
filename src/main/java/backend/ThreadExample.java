package backend;

public class ThreadExample extends Thread {

    private String threadName;
    private int counter;
    public ThreadExample(String threadName,int counter){
        this.threadName=threadName;
        this.counter=counter;
    }

    public void run() {
        while (counter<1000000000){
            counter++;
        }

    }

    public static void main(String[] args) {
        ThreadExample thread1=new ThreadExample("Thread A",0);
        ThreadExample thread2=new ThreadExample("Thread B",0);
        ThreadExample thread3=new ThreadExample("Thread C",0);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(thread1.counter);
        System.out.println(thread2.counter);
        System.out.println(thread3.counter);
    }
}
