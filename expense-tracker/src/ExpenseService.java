import java.util.List;

public class ExpenseService {

    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public void addExpense(Expense expense) {
        repository.save(expense);
    }

    public double total() {
        double sum = 0;
        for (Expense e : repository.findAll()) {
            sum += e.getAmount();
        }
        return sum;
    }

    public List<Expense> getAll() {
        return repository.findAll();
    }
}