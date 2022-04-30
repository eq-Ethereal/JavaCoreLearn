package day11;

public class Courier implements Worker {
    private int salary = 0;
    private boolean isBonusTaken=false;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void doWork() {
        warehouse.setBalance(warehouse.getBalance() + 1000);
        salary+=100;
        //System.out.println("Бабки сюююююда. счет пополнен на :" + salary);
    }

    public void bonus() {
        if ((warehouse.getBalance() == 1_000_000) && (!isBonusTaken)) salary = salary*2;

    }
}
