package Homework4;

public class Customer {
    private int id;
    private Ticket[] tickets;
    private CashProvider cashProvider;

    // билет куплен - снимем флаг доступности
    public  boolean buyTicket(Ticket ticket) {
        return false;
    }

    // возврат билета - возводим флаг доступности
    public boolean repealTicket(Ticket ticket){
        return true;
    }

    // поиск билета
    public Tickets[] searchTicket(int rootNumber){
    }
}
