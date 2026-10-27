import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Expense> expenses = new ArrayList<>();

        expenses.add(new Expense("jalebi", 25, "food"));
        expenses.add(new Expense("bhindi", 10, "vegetable"));
        expenses.add(new Expense("fish", 5, "meat"));

        for (Expense e : expenses) {
            System.out.println(e.getDescription() + " - " + e.getAmount());
        }
    }
}