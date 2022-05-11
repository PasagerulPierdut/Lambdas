package lambdas.req2;
public class Electronics implements ShopItem {
    private String name;
    private int price;
    private Category category;
    private String electronicType;
    private String color;
    public Electronics(String name, int price, Category category, String electronicType, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.electronicType = electronicType;
        this.color = color;
    }
    public String getElectronicType() {
        return electronicType;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String name() {
        return name;
    }
    @Override
    public int price() {
        return price;
    }
    @Override
    public Category category() {
        return category;
    }
    @Override
    public String toString() {
        return "Electronics{" + "name='" + name + '\'' + ", price=" + price + ", category=" + category + ", electronicType='" + electronicType + '\'' + ", color='" + color + '\'' + '}';
    }
}
