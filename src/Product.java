public class Product {
    private static Product product;
    private static String nameFile = "Выберите фильм:  \n\n";
    int count = 0;


    public static synchronized Product getProduct() {
        if (product == null) {
            product = new Product();
        }
        return product;
    }

    private Product() {
    }
    public void addInfo(String name, double price){
        count++;
        nameFile += count + " " + name + " " + price + "tg\n";
    }
    public void showInfo(){
        System.out.println(nameFile );

    }
}
