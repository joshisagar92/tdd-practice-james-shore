public class SavingAccountYear {

    private int startingBalance = 0;
    private  int interestRate;

    public SavingAccountYear(int startingBalance, int interestRate) {

        this.startingBalance = startingBalance;
        this.interestRate = interestRate;
    }

    public SavingAccountYear nextYear(){
        return new SavingAccountYear(this.endingBalance(),interestRate);
    }

    public int endingBalance() {
            return startingBalance() + (startingBalance() * interestRate /100);
    }

    public int startingBalance() {
        return startingBalance;
    }

    public long interestRate() {
        return this.interestRate;
    }
}
