import java.util.List;

/**
 * DAO class of a fish.
 */
class Fish {

    /**
     * Name of the fish.
     */
    private String name;

    /**
     * Price of the fish.
     */
    private int price;

    /**
     * List of not fish which the this fish is not compatible with.
     */
    private List<String> notCompatibleWith;

    /**
     * Constructor
     * @param name Name
     * @param price Price
     * @param notCompatibleWith Compatibility list
     */
    Fish(String name, int price, List<String> notCompatibleWith) {
        this.name = name;
        this.price = price;
        this.notCompatibleWith = notCompatibleWith;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    List<String> getNotCompatibleWith() {
        return notCompatibleWith;
    }
}