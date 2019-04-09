package nl.yer.games.constructors;

public class PetrolTank {

    private int minLevel;
    private int maxLevel;

    private int currentLevel;

    public PetrolTank(int minLevel, int maxLevel) {
        this.maxLevel = maxLevel;
        this.minLevel = minLevel;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void drink() {
        this.currentLevel--;
    }
}
