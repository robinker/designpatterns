package lab9.state;

public class ExpenseState {
    private VendingMachine vendingMachine;

    public ExpenseState() {
        this.vendingMachine = new VendingMachine();
    }

    public void showBalance(){
        System.out.println(vendingMachine.getBalance());

    }
    public void intsertCoin(int coin){
        vendingMachine.insertCoin(coin);
        if(vendingMachine.getBalance() > vendingMachine.getPrice())
            System.out.println("Your change is " + (vendingMachine.getBalance() -  vendingMachine.getPrice()));
        else if(vendingMachine.getBalance() < vendingMachine.getPrice())
            System.out.println("Your balance is not enough");



    }

}
