package DSP;

public class Car {
    Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    void start(){
        engine.start();
    }
}
