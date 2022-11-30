public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        System.out.println("Odd thread's hashcode is: " + oddThread.hashCode());
        System.out.println("Even thread's hashcode is: " + evenThread.hashCode());

//        oddThread.start();
//        evenThread.start();

        oddThread.start();
        try {
            oddThread.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        evenThread.start();
    }
}
