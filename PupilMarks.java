
public class PupilMarks
{
    // 
    private String Forename;
    private String Surname;
    private int PupilMark;

    public PupilMarks()
    {
        // initialise instance variables
        Forename = "";
        Surname = "";
        PupilMark = 0;
    }

    public void readMemberDetails(String dataItems)
    {

        // unpack string of row data into fields
        String[] rowItems = dataItems.split(",");

        // store each data item as instance property
        Forename = rowItems[0];
        Surname = rowItems[1];
        PupilMark = Integer.parseInt(rowItems[2]);
   
       
      
    }
}
