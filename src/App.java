public class App {
    public static void main(String[] args) throws Exception {
        TicketMegaSena ticketMegaSena = new TicketMegaSena();
        SortMegaSena.drawNumber(ticketMegaSena);
        SortMegaSena.sortNumber(ticketMegaSena);
        SortMegaSena.showNumbers(ticketMegaSena);
    }
}
