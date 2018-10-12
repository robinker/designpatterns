package lab9.state;

public class VendingMachine {
    private ReadyState readyState = new ReadyState();
    private ExpenseState expenseState = new ExpenseState();
    private EndState endState = new EndState();

    private int balance;
    private int price;

    public int getBalance() {
        return balance;
    }

    public int getPrice() {
        return price;
    }

    public void insertCoin(int coin) {
        this.balance += coin;
    }
}
