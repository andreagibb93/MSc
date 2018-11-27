
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> membership;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        membership = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        membership.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return membership.size();
    }
    
    public int joinedInMonth(int month)
    {
        if(month < 0 || month > 12){
            System.out.println("This month does not exist");
        }
        return 0;
    } 
    
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> members = new ArrayList();
        
        if(month < 0 || month > 12){
            System.out.println("This member does not exist");   
        }
        else {
            Iterator<Membership> it = membership.iterator();
            
            while (it.hasNext()) {
                Membership member = it.next();
                if (member.getMonth() == month && member.getYear() == year) {
                    members.add(member);
                    it.remove();
                }
            }
        }
        return members;
    }
}
