/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */

import java.util.ArrayList;

public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();


    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     * 
     * for loop, gives a variable i that can be used for counting number of 
     * loops and as in index for a collection.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int i = 0; i < hourCounts.length; i++) {
            System.out.println(i + ": " + hourCounts[i]);
        }
    }
    
    /**
     * while loop,
     */
    public void newWHILEPrintHourlyCounts()
    {
        int hour = 0;
        while(hour < hourCounts.length){
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
    
    /**
    * Return the number of accesses recorded in the log
    * file.
    * FOR EACH loop
     */
    public int numberOfAccesses()
    {   
        int total = 0;
        for(int count : hourCounts) {
            total += count;
        }
        return total;
    }
    
    public int busiestHour()
    {
        int max = -1;
        int busiest_hour = -1;
        for(int i = 0; i < hourCounts.length; i++) {
            if(hourCounts[i] > max) {
                max = hourCounts[i];
                busiest_hour = i;
            }
        }
        return busiest_hour;
    }
    
    public int quietestHour()
    {
        int min = 1000;
        int quietest_hour = 1000;
        for(int index = 0; index > hourCounts.length; index++) {
            if(hourCounts[index] < min) {
                min = hourCounts[index];
                quietest_hour = index;
            }
        }
        return quietest_hour;
    }
}
        
