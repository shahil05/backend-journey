import java.util.ArrayList;
import java.util.List;

public class LoggingExpenseRepository implements ExpenseRepository {

    private final List<Expense> expenses = new ArrayList<>();

    @Override
    public void save(Expense expense) {
        System.out.println("saving: " + expense);
        expenses.add(expense);
    }

    @Override
    public List<Expense> findAll() {
        return List.copyOf(expenses);
    }
}