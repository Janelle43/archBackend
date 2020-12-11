public abstract class Notifier {
    Notifier nextNotifier;

     void setNotifier(Notifier notifier) {
        nextNotifier = notifier;
    }
    void print(String message){
        printMessage(message);
        if(nextNotifier != null){
            nextNotifier.print(message);
        }
    }
    abstract void printMessage(String message);
}
