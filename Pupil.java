
public class Pupil
{
    // 
    private String Forename;
    private String Surname;
    private int PupilMark;

    public Pupil()
    {
        // initialise instance variables
        Forename = "";
        Surname = "";
        PupilMark = 0;
    }

    public void readPupilDetails(String dataItems)
    {

        // unpack string of row data into fields
        String[] rowItems = dataItems.split(",");

        // store each data item as instance property
        Forename = rowItems[0];
        Surname = rowItems[1];
        PupilMark = Integer.parseInt(rowItems[2]);

      
    }

    public String writeDetails()
    {
        // join up data into a string to output as a row
        // use "," to separate csv columns
        String memberData = "";
        memberData = memberData.concat(Forename);
        memberData = memberData.concat(",");
        memberData = memberData.concat(Surname);
        memberData = memberData.concat(",");
        memberData = memberData.concat(Integer.toString(PupilMark));
        return memberData;
    }
}
