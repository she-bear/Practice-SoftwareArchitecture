package DIP;

public class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
