package lesson4.threads;

public class Worker2 extends Thread {
    Shared shared;

    public Worker2(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if(shared.x%2 == 0){
                System.out.println(shared.x);
            }

        }
    }
}
