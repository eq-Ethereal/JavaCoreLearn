package day11;

public class Warehouse {
    private static int COUNT_TOTAL_ORDERS = 0;
    private int countOrder;
    private int balance;
    private int pickerBonusOrders = 1500;
    private int courierBonusBalance = 1_000_000;

    public int getCountOrders() {
        return countOrder;
    }

    public void setCountOrders(int countOrder) {
        this.countOrder = countOrder;
        COUNT_TOTAL_ORDERS = COUNT_TOTAL_ORDERS+1;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPickerBonusOrders() {
        return pickerBonusOrders;
    }

    public int getCourierBonusBalance() {
        return courierBonusBalance;
    }

    public int getCountTotalOrders() {
        return COUNT_TOTAL_ORDERS;
    }
}
