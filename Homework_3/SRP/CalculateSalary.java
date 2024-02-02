// Single Responsibility (Принцип единственной ответственности)
// Каждый класс должен отвечать только за одну операцию.
package SRP;

public class CalculateSalary {
    int baseSalary;

    public CalculateSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){
        return baseSalary * 1.5;
    }
}
