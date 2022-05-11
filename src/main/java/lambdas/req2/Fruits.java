package lambdas.req2;
public class Fruits implements ShopItem {
    private String name;
    private int price;
    private Category category;
    private int timeOnShelf;
    public Fruits(String name, int price, Category category, int timeOnShelf) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.timeOnShelf = timeOnShelf;
    }
    public int getTimeOnShelf() {
        return timeOnShelf;
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
        return "Fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", timeOnShelf=" + timeOnShelf +
                '}';
    }
}
