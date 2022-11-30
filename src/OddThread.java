public class OddThread extends Thread {
    public OddThread() {
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Odd thread is interrupted");
        }
    }
}
