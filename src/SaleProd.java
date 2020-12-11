public class SaleProd implements Sale {

    @Override
    public void doSale(Visitor visitor) {
        visitor.disCount();
    }

}
