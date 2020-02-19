package Object____Practice;



public class Bank_account {
    String name;
    String bankName;
    double accountNumber;
    double balance;
    String accountOpenDate;
    String userName;
    String password;

    public void bankInfo(){
        System.out.println("Name of the person is: "+name);
        System.out.println("The name of the Bank is: "+bankName);
        System.out.println("The Account number is: "+accountNumber);
        System.out.println("Balance in the acoount "+balance);
        System.out.println("Account was opened in: "+accountOpenDate);
        System.out.println("username is: "+userName);
        System.out.println("password is: "+password);
    }
    public double deposit(double depositAmount){
        balance+=depositAmount;
        return balance;
    }
    public double withDraw(double withDrawAmount){
      if (withDrawAmount<=balance){
          balance-=withDrawAmount;
      }else{
          System.out.println("insuficient amount");
      }
      return balance;
    }
    public boolean login(String uName, String pWord) {
        if (userName.equals(uName) && password.equals(pWord)) {
            System.out.println("Welcome to the bank " + bankName);
            System.out.println("you are here");
            bankInfo();
            return true;

        } else {
            System.out.println("youe username and password are incorrect");
        }
        return false;
    }
    public void signUp(String personName, double accountNum, double balance, String userName, String password, String accountOpenDate){
        this.name=personName;
        this.accountNumber=accountNum;
        this.balance=balance;
        this.userName=userName;
        this.password=password;
        this.accountOpenDate=accountOpenDate;

}
public void displayTheFunctionality(){
    System.out.println("To display info press 0");
    System.out.println("To deposit press 1");
    System.out.println("To make withdraw press 2");
    System.out.println("To Sign Up press 3");
    System.out.println("To log In press 4");
    System.out.println("To exit the application press 5");
}







}
