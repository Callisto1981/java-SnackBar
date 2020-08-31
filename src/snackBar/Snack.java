package snackBar;

public class Snack {
    private static int maxId = 0;
    private int id;
    public String name;
    public int quantity;
    public double cost;
    public int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int q) {
        this.quantity += q;
    }

    public void buySnack(int q) {
        this.quantity -= q;
    }

    public double getCost(int q) {
        return this.cost * q;
    }
}