package nl.yer.games.exceptions.assignment;

class Application {

    public static void main(String[] args) {

        PetrolTank t = new PetrolTank(5, 40);
        // try ...
        try {
            t.fill(104);
        } catch (TankOverflowException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (TankUnderFillException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Einde van de tankbeurt!!!");
        }


        System.out.println(t.getCurrentLevel());
    }
}

public class PetrolTank {

    private int minLevel;
    private int maxLevel;
    private int currentLevel;

    public PetrolTank(int minLevel, int maxLevel) {
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
    }

    public void fill(int liters) throws TankOverflowException, TankUnderFillException {
        if (this.currentLevel + liters <= maxLevel) {
            this.currentLevel += liters;

        } else {
            throw new TankOverflowException("Too fool!");
        }
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}

class TankOverflowException extends Exception {

    public TankOverflowException(String message) {
        super(message);
    }



}

class TankUnderFillException extends Exception {

}