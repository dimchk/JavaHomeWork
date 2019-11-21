package lesson4.threads;

public class RunnerMain {
    public static void main(String[] args) {
//        System.out.println(Thread.activeCount());
//        System.out.println("Start");
        // MyThread myThread = new MyThread();
        //myThread.start();
        //Thread thread  = new Thread(myThread);
        //thread.start();
//        System.out.println("End");
//        System.out.println(Thread.activeCount());



        Runner firstThread = new Runner("Dima");
        Runner secondThread = new Runner("Ruslan");
        firstThread.start();
        secondThread.start();

        while (true) {
            if (!firstThread.isAlive()) {
                secondThread.stop();
                System.out.println(firstThread.name + "is win");
                break;
            }
            if (!secondThread.isAlive()) {
                secondThread.stop();
                System.out.println(secondThread.name + "is win");
                break;
            }
        }

    }
}
