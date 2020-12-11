import java.util.Scanner;

public class Facade {
int total = 0;
    RealPaymentProcess realPaymentProcess = new RealPaymentProcess();
    ProxyPaymentProcess proxyPaymentProcess = new ProxyPaymentProcess();

    Notifier notifier = new OrderConfirmed();
    Invoiced invoiced = new Invoiced();
    Shipped shipped = new Shipped();

    public void solution(){
        System.out.println("Добро пожаловать в CinemaTowers!!");
        System.out.println("1-Список фильмов");
        System.out.println("2-Выход");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        switch (choose){

            case 1:

                Product.getProduct().addInfo("The DAWN 2020 USA", 2500 );
                Product.getProduct().addInfo("Shirley 2020 USA", 2000 );
                Product.getProduct().addInfo("Avatar 2 2020 USA", 2700 );
                Product.getProduct().addInfo("Arkansas 2020 USA", 2200 );
                Product.getProduct().showInfo();
                int choose2 = in.nextInt();

                switch (choose2){
                    case 1:
                        total += 2500;
                        System.out.println(total);
                        break;
                    case 2:
                        total += 2000;
                        System.out.println(total);
                        break;

                    case 3:
                        total += 2700;
                        System.out.println(total);
                        break;

                    case 4:
                        total += 2200;
                        System.out.println(total);
                        break;
                }
                break;
            case 2:
                System.out.println("Пока");
                System.exit(0);
        }


//        System.out.println(realPaymentProcess.check.put("Zhanelya", 1234567));
        System.out.println("Для оплаты зайдите в свой аккаунт");
        proxyPaymentProcess.checkAccount();
       Sale sale = new SaleProd();
       sale.doSale(new Visitor());

        notifier.setNotifier(invoiced);

        invoiced.setNotifier(shipped);
        notifier.print(" ");

        System.out.println("Выберите вы: ");
        System.out.println("1-student");
        System.out.println("2-schoolboy/girl");
        System.out.println("3-nothing");
        int utoch = in.nextInt();

        switch (utoch){
            case 1:
                System.out.println("Цена для вас: " + (total - (total*0.1)));

                break;
            case 2:
                System.out.println("Цена для вас: " + (total - (total*0.2)));
                break;
            case 3:
                System.out.println("Цена для вас: " + total);
                break;
        }
       
        System.out.println("Thank you!! Goodbye");
    }
}
