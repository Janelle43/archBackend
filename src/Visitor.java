public class Visitor implements IVisitor {

    @Override
    public void discount(double num) {
        if(num >= 5000 ){
            System.out.println("За покупки свыше 5000 тг делаем 10% скидку");
            System.out.println("Cумма с учетом скидки: ");
            System.out.println(num - num*0.1);
        }
    }

    @Override
    public void disCount() {

    }
}
