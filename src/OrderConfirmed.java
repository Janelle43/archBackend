public class OrderConfirmed extends  Notifier{

    @Override
    void printMessage(String message) {
        System.out.println("Zakaz oformlen!!" + message);
    }
}
