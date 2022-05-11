package lambdas.req2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Shop<Clothes> clothesShop = new Shop<>(new ArrayList<>());

        clothesShop.addItem(new Clothes("Blue jeans", 23, Category.NEW, "XL", "Pants", "Blue"));
        clothesShop.addItem(new Clothes("Blouse", 14, Category.REFURBISHED, "XXL", "Tops", "White"));
        clothesShop.addItem(new Clothes("Jacket", 42, Category.NEW, "L", "Tops", "Black"));
        clothesShop.addItem(new Clothes("Shorts", 51, Category.NEW, "XXL", "Pants", "Black"));

        System.out.println(clothesShop.findByCategory(Category.NEW));

        System.out.println(clothesShop.findByName("Blue jeans"));

        System.out.println(clothesShop.findWIthLowerPrice(45));

        System.out.println(clothesShop.findAll());

        System.out.println(clothesShop.removeItem("Shorts"));
        System.out.println(clothesShop.findAll());

        Shop<Fruits> fruitShop = new Shop<>(new ArrayList<>());
        fruitShop.addItem(new Fruits("Apple", 3, Category.REFURBISHED, 3));

        fruitShop.addItem(new Fruits("Cherry", 5, Category.NEW, 2));
        System.out.println(fruitShop.findAll());
    }
}
