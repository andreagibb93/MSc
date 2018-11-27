
/**
 * Write a description of class Users here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Users
{
    // instance variables - replace the example below with your own
    private String name;
    private String id;

    public Users(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        
    }
    
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }
    
       public String getLoginName()
    {
        if(name.length() <= 4 || id.length() <= 3)
            return name + id;
        else{
            return name.substring(0,4) + id.substring(0,3);
        }
    }
    
        /**
     * Return the student ID of this student.
    */
    public String getStudentID()
    {
        return id;
    }
}