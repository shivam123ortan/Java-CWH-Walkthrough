class Good extends Thread{
    public void run(){
        // while(true){
        //     try{
        //         Thread.sleep(200);
        //     }
        //     catch(Exception e){
        //         System.out.println(e);
        //     }
            System.out.println("Good Morning");

        // }
    }
}
class Well extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");;

        }
    }
}

public class Practice_Solution {
    public static void main(String[] args) {
        Good g = new Good();
        Well w = new Well();
        // g.setPriority(6);
        // w.setPriority(9);
        System.out.println(g.getPriority());
        System.out.println(w.getPriority());
        System.out.println(g.getState());
        System.out.println(Thread.currentThread().getState());
        g.start();
        // w.start();
    }
}
