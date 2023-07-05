

public class Plate {

    private int food;

    public Plate() {
        this(100);
    }

    public Plate(int food) {
        if (food < 0) {
            throw new IllegalArgumentException("food must be positive");
        }

        this.food = food;
    }

    public void increaseFood(int food) {
        if (food > 0) {
            this.food += food;
        }
    }

    public int decreaseFood(int appetite, int hunger) {
         int eat = ((hunger) / 100 * appetite);
        if (this.food >= eat) {
            this.food -= eat;
            return 0;
        }
         int outHunger = this.food/appetite * 100 + hunger;
        this.food = 0;
        return outHunger;
    }
    

    @Override
    public String toString() {
        return "(" + food + ")";
    }
}
