public class TestProduct {
//    （2）声明测试类`TestProduct`，在main方法中，创建3个产品类对象放到数组中，并且遍历输出，最后输出`totalProducts`的值，确认它正确反映了创建的对象数量。
    public static void main(String[] args) {
        Product[] products= new Product[3];
        products[0] = new Product(1, "Laptop", 1200.0);
        products[1] = new Product(2, "Smartphone", 800.0);
        products[2] = new Product(3, "Headphones", 150.0);

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getDetail());
        }
        System.out.println(Product.getTotalProducts());
    }
}
