
public class Accounts {

    public static void transfer(Account from, Account to, double amount) {
    from.withdrawal(amount);
    to.deposit(amount);}

    public static void main(String[] args) {
     Account aaccount = new Account("A", 100.0);
      Account baccount = new Account("B", 0.0);
       Account caccount = new Account("C", 0.0);
        transfer(aaccount, baccount,50.0);
        transfer(baccount, caccount,25.0);
        
        // Code in Account.Java should not be touched!
        // write your code here
    }

}
