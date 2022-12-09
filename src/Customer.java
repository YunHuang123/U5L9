public class Customer {
    private static int nextAccNum = 1;
    private String name;
    private int currAccNum;

    public Customer(String n)
    {
        name = n;
        currAccNum = nextAccNum;
        nextAccNum++;
    }

    public String amountDue(double amt)
    {
        return name + ", account number " + currAccNum + ", please pay $" + amt;
    }

    public static int getNextAccNum()
    {
        return nextAccNum;
    }

    public void updateName(String name)
    {
        this.name = name;
    }
}
