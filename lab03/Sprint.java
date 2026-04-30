import java.util.Arrays;
public class Sprint {
    private int capacity;
    private int ticketLimit;
    private Ticket[] tickets;
    private int count;
    public Sprint(int capacity, int ticketLimit) {
        this.capacity = capacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new Ticket[ticketLimit];
        this.count = 0;
    }
    public boolean addUserStory(UserStory userStory) {
        if (userStory == null) {
            return false;
        }
        if (userStory.isCompleted()) {
            return false;
        }
        return addTicket(userStory);
    }
    public boolean addBug(Bug bugReport) {
        if (bugReport == null) {
            return false;
        }
        if (bugReport.isCompleted()) {
            return false;
        }
        return addTicket(bugReport);
    }
    private boolean addTicket(Ticket ticket) {
        if (count >= ticketLimit) {
            return false;
        }
        if (getTotalEstimate() + ticket.getEstimate() > capacity) {
            return false;
        }
        tickets[count] = ticket;
        count++;
        return true;
    }
    public Ticket[] getTickets() {
        return Arrays.copyOf(tickets, count);
    }
    public int getTotalEstimate() {
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum = sum + tickets[i].getEstimate();
        }
        return sum;
    }
}