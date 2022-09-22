public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Monster Laptop",7500,250,"Yeşil");
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Monster Laptop");
        product.setPrice(5500);
        product.setStockAmount(250);
        product.setRenk("Siyah");

        ProductManager productManager = new ProductManager(product);
        productManager.add();


    }
}