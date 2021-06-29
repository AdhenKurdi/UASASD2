package soalStack;
public class TheApps {
    public static void main(String[] args) {
        MainStack newStack = new MainStack(10);
        newStack.push(58);
        newStack.printData();
        newStack.push(30);
        long bacaTop = newStack.peek();
        newStack.printData();
        System.out.println("Nama Saya Adalah Adhen Kurdi");
        newStack.pop();
        newStack.printData();
        newStack.push(40);
        newStack.printData();
        newStack.push(50);
        newStack.printData();
        System.out.println("nilai top = "+bacaTop);
    }
}
