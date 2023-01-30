import java.util.List;

/**
 * Initialization and management of the stock.
 */
class FishStockManager {

    /**
     * Fish stock.
     */
    private List<Fish> fishStock;

    /**
     * Constructor.
     */
    FishStockManager() {
        Fish grueneMigraene = new Fish("Grüne Migräne", 70, List.of("Breitmaulmolch", "Grottensprotte"));
        Fish korallenqualle = new Fish("Korallenqualle", 50, List.of());
        Fish schuppenschatulle = new Fish("Schuppenschatulle", 30, List.of("Breitmaulmolch", "Prachtpiranha"));
        Fish breitmaulmolch = new Fish("Breitmaulmolch", 40, List.of("Grüne Migräne", "Schuppenschatulle"));
        Fish prachtpiranha = new Fish("Prachtpiranha", 40, List.of("Schuppenschatulle", "Grottensprotte"));
        Fish zitterling = new Fish("Zitterling", 30, List.of("Grottensprotte"));
        Fish grottensprotte = new Fish("Grottensprotte", 20, List.of("Grüne Migräne", "Prachtpiranha, Zitterling"));
        this.fishStock = List.of(grueneMigraene, korallenqualle, schuppenschatulle, breitmaulmolch, prachtpiranha, zitterling, grottensprotte);
    }

    /**
     * Checks compatibility of a list of fish with a new one.
     * @param newFish new Fish.
     * @param fishList List of fish.
     * @return true if the new fish is compatible with every fish in the list.
     */
    boolean isFishCompatibleWithListOfFish(Fish newFish, List<Fish> fishList) {
        boolean isCompatible = true;
        for(Fish fish : fishList) {
            if(fish.getNotCompatibleWith().contains(newFish.getName())) {
                isCompatible = false;
            }
        }
        return isCompatible;
    }

    List<Fish> getFishStock() {
        return fishStock;
    }
}