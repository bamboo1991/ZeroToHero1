package Exception;

public class DebitAccount extends Accounts {
int balance;

    public void withDraw(int amount) throws Error{
        if (balance<amount){
            throw new InsuficientBlance();
        }else if (balance>=amount){
            balance-=amount;
            System.out.println("your balance is:"+ balance+" less than withDraw amount"+amount);
        }
    }
    public void deposit( int amount) throws ArithmeticException{
        balance+=amount;
    }

    public static void main(String[] args) {

        DebitAccount debitAccount = new DebitAccount();
        debitAccount.balance=100;
        debitAccount.deposit(50);
        debitAccount.withDraw(100);
        debitAccount.withDraw(55);
    }
}
