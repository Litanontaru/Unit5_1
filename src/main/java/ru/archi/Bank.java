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

    public synchronized void withdrawMoney(int amount) {
        int a = moneyAmount.get();
        moneyAmount.set(a - amount);
    }

    public synchronized boolean hasMoney(int amount){
        return moneyAmount.get() > amount;
    }
}
