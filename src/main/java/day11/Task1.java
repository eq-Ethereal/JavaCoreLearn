package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        System.out.println(courier.getSalary());
        System.out.println(picker.getSalary());

        for (int i = 0; i < 1500; i++) {
            courier.doWork();
            courier.bonus();
            picker.doWork();
            picker.bonus();
            //System.out.println("Баланс склада " + warehouse.getBalance());
            //System.out.println("Кол-во заказов склада " + warehouse.getCountOrder());
        }

        System.out.println(courier.getSalary() + " " + warehouse.getBalance());
        System.out.println(picker.getSalary() + " " + warehouse.getCountOrders());
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        courier1.doWork();
        Picker picker1 = new Picker(warehouse1);
        picker1.doWork();
        System.out.println("\n" + courier1.getSalary());
        System.out.println(warehouse1.getBalance() + " " + warehouse1.getCountOrders());
        System.out.println(warehouse1.getCountTotalOrders());

    }
}
