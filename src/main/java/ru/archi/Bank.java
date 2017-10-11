package main.java.ru.archi;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Черный on 11.10.2017.
 */
public class Bank {
    private AtomicInteger moneyAmount = new AtomicInteger();

    public Bank(int moneyAmount){
        this.moneyAmount.set(moneyAmount);
    }

    public synchronized void getMoney(int amount) throws NoMoneyException {
        int a = moneyAmount.get();
        if(a >= amount){
            moneyAmount.set(a - amount);
        }else {
            throw new NoMoneyException("В банке не хватает денег");
        }
    }

    public boolean hasMoney(){
        return moneyAmount.get() > 0;
    }
}
