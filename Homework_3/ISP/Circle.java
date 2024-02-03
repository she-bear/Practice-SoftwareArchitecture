// Класс должен производить только те операции, которые необходимы для осуществления его функций. 
// Поэтому методы расчета периметра (для всех фигур) и объема (для объемных фигур) разносим по разным интерфейсам
package ISP;

public class Circle implements Shape {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2 * 3.14 * radius;
    }
}
