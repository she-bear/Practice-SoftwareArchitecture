package Homework4;

public class TicketProvider {
    // TicketProvider должен знать, как именно осуществляется оплата
    private CashProvider cashProvider;

    public Tickets[] getTickets(int rootNumber, Ticket[] tickets){
    }

    // изменить статус доступности билета (доступен (может перейти из возвратных)/куплен)
    public boolean updateTicketStatus(Ticket ticket){
    }
}
