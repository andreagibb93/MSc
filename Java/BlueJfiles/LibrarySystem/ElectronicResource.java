import java.util.ArrayList;
public class ElectronicResource
{
    // instance variables - replace the example below with your own
    private ArrayList <ElectronicDevice> devices;
    
    public ElectronicResource()
    {
        // initialise instance variables
        devices  = new ArrayList<ElectronicDevice>();    
    }

    public ArrayList <ElectronicDevice> get_devices()
    {
        return devices;
    }
    
    public void add_devices(ElectronicDevice device)
    {
        devices.add(device);
    }
    
    public void print_details()
    {
        System.out.println(devices);
    }
    
}
