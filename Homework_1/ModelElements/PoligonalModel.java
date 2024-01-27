package ModelElements;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> textures) {
        
        
        // реализация условия агрегации 0..*, проверка на пустоту не нужна
        Textures = textures;
        
        // реализация условия композиции 1..*
        Poligons = new ArrayList<>();
        Poligon poligon = new Poligon(new Point3D());
        Poligons.add(poligon);
    }
}
