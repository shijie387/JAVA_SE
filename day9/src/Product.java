public class Product {
//    （1）设计一个`Product`类，它代表一个商品，包含以下属性：
//
//            - `id`：一个`int`类型的实例变量，表示产品ID。
//            - `name`：一个`String`类型的实例变量，表示产品的名称。
//            - `price`：一个`double`类型的实例变量，表示产品的价格。
//            - `totalProducts`：一个`static int`类型的静态变量，用于记录创建了多少个`Product`对象。
//
//    确保所有变量都是私有的，并提供适当的getter和setter方法。提供`getDetail`方法，返回产品对象的详细信息。
//
//    在`Product`类的构造器中，每创建一个新对象时，使`totalProducts`递增。
    private int id;
    private String name;
    private double price;
    private static int TotalProducts = 0;

    public Product() {
        TotalProducts++;
    }

    public Product(int id, String name, double price) {
        this();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalProducts() {
        return TotalProducts;
    }

    public static void setTotalProducts(int totalProducts) {
        TotalProducts = totalProducts;
    }

    public String getDetail() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
