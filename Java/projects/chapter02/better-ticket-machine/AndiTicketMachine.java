/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class AndiTicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    private int studentPrice;
    private int seniorPrice;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private int saving;
    
    private int mean;
    
    private int discount;
    
    private int count;
    
    private int budget;
    

    /**
     * Create a machine that issues tickets of the given price.
     */
    public AndiTicketMachine()
    {
        price = 500;
        studentPrice = 400;
        seniorPrice = 300;
        balance = 0;
        total = 0;
        saving = 0;
        mean = 0;
        discount = 0;
        count = 0;
        budget = 500;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    
     public int getStudentPrice()
    {
        return studentPrice;
    }
    
       public int getSeniorPrice()
    {
        return seniorPrice;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    public void onaBudget()
    {
        if(price > budget){
            System.out.println("Too expensive, your budget is " + budget +" cents");   
        }
        else{
            System.out.println("just right, your budget is " + budget + " cents");
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printRegTicket()
    {
        if(balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
            // multiply price and discount
            saving = price * discount;

        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }
    
    public void printStudentTicket()
    {
        if(balance >= studentPrice) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + studentPrice + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + studentPrice;
            // Reduce the balance by the price.
            balance = balance - studentPrice;
            // multiply price and discount
            saving = studentPrice * discount;

        }
        else {
            System.out.println("You must insert at least: " +
                               (studentPrice - balance) + " more cents.");
                    
        }
    }
    
    public void printseniorTicket()
    {
        if(balance >= seniorPrice) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + seniorPrice + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + seniorPrice;
            // Reduce the balance by the price.
            balance = balance - seniorPrice;
            // multiply price and discount
            saving = seniorPrice * discount;

        }
        else {
            System.out.println("You must insert at least: " +
                               (seniorPrice - balance) + " more cents.");
                    
        }
    }
    
    public void  myprintTicket()
    {
        int amountLeftToPay = price - balance;
        if(amountLeftToPay <= 0) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
            // multiply price and discount
            saving = price * discount;
        }
        else {
            System.out.println("You must insert at least: " +
                               amountLeftToPay + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public int emptyMachine()
    {
        int totalBeforeReturn;
        totalBeforeReturn = total;
        total = 0;
        return totalBeforeReturn;
    }
}
