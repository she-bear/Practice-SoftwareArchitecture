// Open-Closed (Принцип открытости-закрытости)
// Классы должны  быть  открыты для расширения, но закрыты для модификации.

package OCP;

public class Vehicle {
    public int maxspeed;

    public String type;

    public Vehicle(int maxspeed, int type) {
        this.maxspeed = maxspeed;
        this.type = type;
    }

    public double calculateAllowedSpeed(){
        return maxspeed;
    }
}
