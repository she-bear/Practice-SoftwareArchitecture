package ISP;

// здесь будут использованы два интерфейса
public class Cube implements Shape3D {
    int edge;

    public Cube(int edge){
        this.edge = edge;
    }

    @Override
    public double perimetr() {
        return edge * 12;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
