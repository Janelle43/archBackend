import java.util.HashMap;
import java.util.Scanner;

public class RealPaymentProcess implements PaymentProcess{
private String login = "Zhanelya";
private int password = 10122001;
//    HashMap<String, Integer> check = new HashMap<>();
    Scanner in = new Scanner(System.in);
    private int balance = 100000;


    public int getBalance() {
        return balance;
    }

    @Override
    public void checkAccount() {

        System.out.println("Enter pin code for user " + login + ": ");
        int pin = in.nextInt();
        if(pin == password){
            System.out.println("Вы зашли в аккаунт Zhanelya");
        }
        else{
            System.out.println("Ошибка");
        }
//        if(check.containsKey("Zhanelya")){
//            System.out.println("OK!!");
//        }
//        else{
//            System.out.println("Ошибка!!");
//        }
    }

    @Override
    public void balance() {

        System.out.println("Ваш баланс: " + balance);


    }
}
