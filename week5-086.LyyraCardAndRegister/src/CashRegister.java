
public class CashRegister {
    
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    
    public CashRegister() {
        this.cashInRegister = 1000.0;
        // at start the register has 1000 euros 
    }
    
    public double payEconomical(double cashGiven) {
        
        if (cashGiven >= 2.50) {
            cashInRegister += 2.5;
            economicalSold++;
            return cashGiven - 2.5;
        } else if (cashGiven < 2.5) {
            return cashGiven;
        }
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens 
        return cashInRegister;
        
    }
    
    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4.0) {
            cashInRegister += 4.0;
            gourmetSold++;
            return cashGiven - 4.0;
        } else // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        {
            return cashGiven;
        }
    }
    
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= 2.5) {
            card.pay(2.5);
            economicalSold++;
            return true;
        } else {
            return false;
        }
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }
    
    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4.0) {
            card.pay(4.0);
            gourmetSold++;
            return true;
        } else {
            return false;
        }
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister+=sum;
        }
        // ...
    }
}
