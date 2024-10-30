public class OnlineMonitoringSystem {
    public static void main(String[] args) {
        CentralizedQueue queue = CentralizedQueue.getInstance();

        queue.queueNextNumber();
        queue.queueNextNumber();

        queue.resetNumber(50);

        queue.queueNextNumber();
        queue.queueNextNumber();

        queue.resetNumber(10);
    }
}