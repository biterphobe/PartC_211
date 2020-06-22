package midterm;

/**
 * A class to model an AirTicket. For simplicity, assume that each ticket is
 * identified by a unique passport number of the traveler and its class.
 * Possible options for the ticket's class are provided in the array
 * 'TicketClassOptions'.
 *
 * Students are reminded to add themselves as authors when editing the code.
 *
 * @author Ali Hassan
 * @author Paul Bonenfant
 */
public class AirTicket {

    private String passportNo;  //Passport number of the passenger
    private String ticketClass; //Class of the ticket

    private String[] TicketClassOptions = {"Economy", "Business", "First"}; //Ticket's class

    /**
     * The constructor takes in passport number of the traveler and the ticket
     * class.
     *
     * @param passportNo This is the passport number of the traveler.
     * @param ticketClass This is the class of the ticket. Possible options are
     * given in String 'TicketClassOptions'.
     */
    public AirTicket(String passportNo, String ticketClass) {
        this.passportNo = passportNo;
        this.ticketClass = ticketClass;
    }

    /**
     * This method checks whether the format of the provided passport number is
     * valid or not. The format of a valid passport is TWO_CHARACTER + 7_DIGITS.
     * Example: AB1234567
     *
     * @param ppNo Passport number of the traveler.
     * @return This method returns true if the format of the provided passport
     * no. is valid.
     */
    public boolean isPassportValid(String ppNo) {
        boolean validationFlag = false;
        int validPassportNoLength = 9; // Number of letters+digits in a valid passport number;
        if (ppNo.length() == validPassportNoLength) {
            if (Character.isLetter(ppNo.charAt(0))
                    && Character.isLetter(ppNo.charAt(1))) {
                validationFlag = true;
                for (int k = 2; k < ppNo.length(); k++) {
                    if (!Character.isDigit(ppNo.charAt(k))) {
                        validationFlag = false;
                    }
                }
            }
        }
        return validationFlag;
    }

    /**
     * A getter method which returns passport number of the air traveler.
     *
     * @return the passportNo
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * A setter method to set passport number of the air traveler.
     *
     * @param passportNo the passportNo to set
     */
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    /**
     * A getter method that returns class of the ticket.
     *
     * @return the ticketClass
     */
    public String getTicketClass() {
        return ticketClass;
    }

    /**
     * A setter method that sets ticket's class.
     *
     * @param ticketClass the ticketClass to set
     */
    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }
}
