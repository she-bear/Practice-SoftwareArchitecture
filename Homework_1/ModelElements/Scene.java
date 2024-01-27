package ModelElements;

public class Scene {
    public  int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    
    public Scene(int id, List<PoligonalModel> models,
                 List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        
        // реализация условия агрегации 1..*
        if (models.size() > 0) {
            this.Models = models;
        }
        else {
            throw  new Exception("Here is exception message for empty models list");
        }
        
        // реализация условия агрегации 0..*, проверка на пустоту не нужна
        this.Flashes = flashes;
        
        // реализация условия агрегации 1..*
        if (cameras.size() > 0) {
            this.Cameras = cameras;
        }
        else {
            throw  new Exception("Here is exception message for empty cameras list");
        }
    }

    public <T> T method1(T flash){
        return flash;
    }

    public <T, E> T method2(T flash, E camera){
        return flash;
    }
