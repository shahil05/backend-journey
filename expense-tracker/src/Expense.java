public class Expense {

    private final String description;
    private final double amount;
    private final Category category;


    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public  Category getCategory() { return category; }

    @Override
    public String toString(){
        return description + " | " + amount + " | " + category;
    }

    public Expense(String description, double amount, Category category) {


        if(amount<=0) {
            throw new IllegalArgumentException("amount must be positive");
        }
        if (category == null) {
            throw new IllegalArgumentException("category is required");
        }

        this.description = description;
        this.amount = amount;
        this.category = category;
    }

}
