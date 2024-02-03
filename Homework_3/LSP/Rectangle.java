// Необходимо, чтобы класс-потомок был способен обрабатывать те же запросы, что и родитель, и выдавать тот же результат. Или же результат может отличаться, но при этом относиться к тому же типу.
package LSP;

public class Rectangle extends QuadRangle {
    public int height;
    public int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }


    @Override
    // потомок ДОЛЖЕН считать площадь и больше ничего другого, т.е. реализовывать ТУ ЖЕ ЗАДАЧУ, что и класс-родитель
    int area() {
        return height * width;
    }
}
