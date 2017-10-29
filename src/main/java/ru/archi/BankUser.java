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
        //критическая ошибка
        //операции выполняются раздельно, поэтому может оказаться,
        //что первая пройдёт, а на момент исполнения второй денег уже не будет
        while (bank.hasMoney(10)) {
            bank.withdrawMoney(10);
        }
    }
}
