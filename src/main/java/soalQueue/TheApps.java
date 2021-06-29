package soalQueue;
public class TheApps {
    public static void main(String[] args) {
        mainQueue newQueue = new mainQueue(10);
        newQueue.enqueue(58);
        newQueue.show();
        newQueue.enqueue(60);
        newQueue.show();
        System.out.println("nilai yang paling depan = "+newQueue.peek());
        System.out.println("Nama Saya Adalah Adhen Kurdi");
        System.out.println(" ");
        newQueue.enqueue(70);
        newQueue.show();
        System.out.println("yang diambil dari antrian = "+newQueue.dequeue());
        newQueue.show();
        System.out.println("nilai yang paling depan = "+newQueue.peek());
    }
}
