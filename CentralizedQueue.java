public class CentralizedQueue {
    private static CentralizedQueue instance;
    private int currentNumber = 0;

    private CentralizedQueue() {}

    public static synchronized CentralizedQueue getInstance() {
        if (instance == null) {
            instance = new CentralizedQueue();
        }
        return instance;
    }

    public synchronized int queueNextNumber() {
        currentNumber++;
        System.out.println("Serving Customer Queue Number: " + currentNumber);
        return currentNumber;
    }

    public synchronized void resetNumber(int newNumber) {
        currentNumber = newNumber;
        System.out.println("Serving Customer Queue Number: " + currentNumber);
    }
}