
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min;
    private double max;
    private double increment;
   

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double setMin, double setMax)
    {
        // initialise instance variables
        temperature = 15.0;
        increment = 5.0;
        min = setMin;
        max = setMax;
    }
    
    public double getWarmer()
    {
        return temperature;
    }
    
    public double getCooler()
    {
       return temperature;
    }
    
    public void setWarmer()
    {
        if(temperature < max){
            temperature += increment;
        }
        else {
            System.out.println("error, max temp");
    }
}

    public void setCooler()
   {
       if(temperature > min){
            temperature -= increment;
        }
        else {
            System.out.println("error, min temp");
    }
}
}
