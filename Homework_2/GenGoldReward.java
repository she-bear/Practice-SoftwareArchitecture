// создание отдельного объекта делегируем в отдельный класс
public class GenGoldReward implements GenItem {

    @Override
    public IGameItem createItem {
        return new GoldReward();
    }
}
