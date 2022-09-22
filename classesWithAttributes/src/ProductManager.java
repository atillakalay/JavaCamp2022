public class ProductManager {
    private Product product;
    public ProductManager(Product product) {
        this.product = product;
    }
    public void add(){
        System.out.println("Ürün eklendi: "+product.getName());
    }
    public void remove(){
        System.out.println("Ürün silindi: "+product.getName());
    }
    public void update(){
        System.out.println("Ürün güncellendi: "+product.getName());
    }

}
