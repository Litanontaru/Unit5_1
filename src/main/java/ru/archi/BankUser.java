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
        try {
            while (true) {
                bank.getMoney(10);
            }
        }catch (NoMoneyException e){
            System.out.println("Не могу снять деньги");
        }
    }
}
