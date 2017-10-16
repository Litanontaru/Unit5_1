package main.java.ru.archi;

/**
 * Created by Черный on 11.10.2017.
 */
public class BankUser {
    Bank bank = null;

    public BankUser(Bank bank){
        this.bank = bank;
    }

    public void withdrawMoney(){
        while (bank.hasMoney(10)) {
            bank.withdrawMoney(10);
        }
    }
}
