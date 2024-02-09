package Homework4;

public class CashProvider {
    private long card;
    private boolean isAuthorization;

    // статус успешности операции покупки
    public  boolean buy(int price) {
    }

    // статус операции возврата денег за билет
    public boolean repealTicket(int price){
    }

    // авторизация пользователя
    public void authorization(Customer customer){
        this.isAuthorization = true;
    }
}
