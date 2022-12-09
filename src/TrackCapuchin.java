public class TrackCapuchin {
    private int xMonkey;
    private int yMonkey;
    private int xFood;
    private int yFood;

    public TrackCapuchin(int xF, int yF)
    {
        xMonkey = 0;
        yMonkey = 0;
        xFood = xF;
        yFood = yF;
    }

    public int getxMonkey() {
        return xMonkey;
    }

    public int getyMonkey() {
        return yMonkey;
    }

    public int getxFood() {
        return xFood;
    }

    public int getyFood() {
        return yFood;
    }

    public void moveMonkey(int xMovements, int yMovements)
    {
        xMonkey += xMovements;
        yMonkey += yMovements;
    }

    public double calcFoodDistance()
    {
        return Math.sqrt(Math.pow(xFood - xMonkey, 2) + Math.pow(yFood - yMonkey, 2));
    }

    public boolean isCloserTo(TrackCapuchin other)
    {
        if (this.calcFoodDistance() < other.calcFoodDistance())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
