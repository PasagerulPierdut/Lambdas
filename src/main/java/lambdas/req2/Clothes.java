package lambdas.req2;

public class Clothes implements ShopItem {
    private String name;
    private int price;
    private Category category;
    private String size;
    private String itemType;
    private String color;
    public Clothes(String name, int price, Category category, String size, String itemType, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.size = size;
        this.itemType = itemType;
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public String getItemType() {
        return itemType;
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
        return "Clothes: " + name + '\'' +
                ", price: " + price +
                ", category: " + category +
                ", size: '" + size + '\'' +
                ", itemType: '" + itemType + '\'' +
                ", color: '" + color + '\'' +
                ';';
    }
}
