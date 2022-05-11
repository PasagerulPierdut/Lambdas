package lambdas.req2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Shop<T extends ShopItem> {

    private List<T> list;

    public Shop(List<T> list) {
        this.list = list;
    }

    void addItem(T item) {
        if (item instanceof Fruits && !item.category().equals(Category.NEW)) {
            System.out.println("Add only new fruits, or else our customers would be angry. Item " + item + " not added!");
        } else if (item.price() > 0 && (item.name() != null && !item.name().equals(""))) {
            list.add(item);
        } else {
            System.out.println("Check again.");
        }
    }

    List<T> findAll() {
        return list;
    }

    List<T> findByCategory(Category category) {
        return list.stream()
                .filter(item -> item.category().equals(category))
                .collect(Collectors.toList());
    }

    List<T> findWIthLowerPrice(int maxPrice) {
        return list.stream()
                .filter(item -> item.price() < maxPrice)
                .collect(Collectors.toList());
    }


    Optional<T> findByName(String name) {
        var optionalItem = list.stream()
                .filter(item -> item.name().equals(name))
                .findFirst();
        if (optionalItem.isPresent()) {
            return optionalItem;
        } else {
            return Optional.empty();
        }
    }

    Optional<T> removeItem(String name) {
        Optional<T> opt = list.stream()
                .filter(item -> item.name().equals(name))
                .findFirst();
        if (opt.isPresent()) {
            list.remove(opt);
            return opt;
        } else {
            return Optional.empty();
        }
    }
}
