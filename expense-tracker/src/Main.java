

public class Main {
    public static void main(String[] args) {

        ExpenseService service = new ExpenseService();

        service.addExpense(new Expense("jalebi", 25, new Category("food")));
        service.addExpense(new Expense("bhindi", 10, new Category("vegetable")));
        service.addExpense(new Expense("fish", 5, new Category("meat")));

        for(Expense e: service.getAll()){
            System.out.println(e);
        }
        System.out.println("Total: " + service.total());





    }
}