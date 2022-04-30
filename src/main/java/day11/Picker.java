package day11;


public class Picker implements Worker {
    private int salary = 0;
    private boolean isBonusTaken=false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void doWork() {
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
        salary+=80;
        //System.out.println("ЗП пришла сукинсын, пиздуй за пивком. счет пополнен на :" + salary);
    }

    public void bonus() {
        if (!isBonusTaken && warehouse.getCountOrders() == 1500) {
            salary = salary * 3;
            isBonusTaken = true;
        }
    }
}
