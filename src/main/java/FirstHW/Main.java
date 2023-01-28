package FirstHW;

public class Main {
    public static void main(String[] args) {
       VendingMachine vendingMachine = new VendingMachine();
       vendingMachine.getProductList().add(new Product("Яблоко", 10));
        vendingMachine.getProductList().add(new Product("Груша", 20));
        vendingMachine.getProductList().add(new Product("Яблоко1", 10));
        vendingMachine.getProductList().add(new Baton("Батончик Марс", 10, 10.4324324234234));
        vendingMachine.getProductList().add(new SuperBaton("БОЛЬШОЙ Батончик Марс", 10, 10.4324324234234, TypeSize.BIG));
        vendingMachine.getProductList().add(new Milk("Простоквашино", 10, 3.2));
        vendingMachine.getProductList().add(new Chocolate("Alpen Gold", 10, 70));
        for(Product product : vendingMachine.getProductList()) {
            System.out.println(product);
        }
    }


}
