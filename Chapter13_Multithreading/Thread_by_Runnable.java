class MyThreadRunnable1 implements Runnable{
    public void run(){
        int a = 0;
        while(a<10){
            System.out.println("I am a thread 1 not a threat 1");
            a++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int b=0;
        while(b<10){
            System.out.println("I am a thread 2 not a threat 2");
            b++;
        }
    }
}
public class Thread_by_Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
