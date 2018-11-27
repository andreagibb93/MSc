
/**
 * Write a description of class ElectronicDevice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectronicDevice
{
    // instance variables - replace the example below with your own
    private String location;
    private String available;

    /**
     * Constructor for objects of class ElectronicDevice
     */
    public ElectronicDevice()
    {
        // initialise instance variables
        location = "";
        available = "";
    }

    public String get_location()
    {
        return location;
    }
    
    public String get_available()
    {
        return available;
    }
    
    public void set_location(String new_location)
    {
        location = new_location;
    }
    
    public void set_available(String new_available)
    {
        available = new_available;
    }
    
    public void print_details()
    {
        System.out.println(location);
        System.out.println(available);
    }
}
