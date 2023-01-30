import java.util.ArrayList;
import java.util.List;

/**
 * Returns option with the most fish species for the budget of a fish stock.
 */
class FishSalesManager {

    /**
     * Fish stock management.
     */
    private FishStockManager fishStockManager;

    /**
     * Interim results of compatible fish for the budgets.
     */
    private ArrayList<ArrayList<Fish>> interimResults;

    /**
     * Constructor.
     */
    FishSalesManager() {
        this.fishStockManager = new FishStockManager();
        this.interimResults = new ArrayList<>();
    }

    /**
     * Returns combination of fish in the specified budget.
     * @param remainingBudget Left over budget.
     * @param selectedFish Selected Fish.
     */
    private void returnFishCombinations(int remainingBudget, ArrayList<Fish> selectedFish) {

        for(Fish fish : this.fishStockManager.getFishStock()) {
            int currentBudget = remainingBudget;
            if((selectedFish.isEmpty() || !selectedFish.contains(fish)) && currentBudget >= fish.getPrice() &&
                    this.fishStockManager.isFishCompatibleWithListOfFish(fish, selectedFish)) {

                currentBudget -= fish.getPrice();
                ArrayList<Fish> newList = (ArrayList<Fish>) selectedFish.clone();
                newList.add(fish);
                returnFishCombinations(currentBudget, newList);

            } else if(!selectedFish.isEmpty()) {
                this.interimResults.add(selectedFish);
            }
        }
    }

    /**
     * Returns list with the most variety for the budget.
     * @return List of fish.
     */
    private List<Fish> returnLargestListOfFish() {
        ArrayList<Fish> bestList = new ArrayList<>();
        for(ArrayList<Fish> fishList : this.interimResults) {
            if(fishList.size() > bestList.size()) {
                bestList = fishList;
            }
        }
        return bestList;
    }

    /**
     * Returns list with most variety of fish for the budget.
     * @param budget Budget.
     * @return List of fish.
     */
    List<Fish> makeOffer(int budget) {
        returnFishCombinations(budget, new ArrayList<>());
        return returnLargestListOfFish();
    }

    /**
     * Prints result.
     * @param fishList List of Fish.
     */
    void printOffer(List<Fish> fishList) {

        for(Fish fish : fishList) {
            System.out.println(fish.getName() + ", ");
        }
    }
}