public class Expense {

    private final String description;
    private final double amount;
    private final String category;


    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public  String getCategory() { return category; }

    @Override
    public String toString(){
        return description + " | " + amount + " | " + category;
    }

    public Expense(String description, double amount, String category) {


        if(amount<=0) {
            throw new IllegalArgumentException("amount must be positive");
        }

        this.description = description;
        this.amount = amount;
        this.category = category;
    }

}
