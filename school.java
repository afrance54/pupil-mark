import javax.swing.JOptionPane;
import java.io.*;
public class school
{
    private Pupil PupilList[];
    int noOfPupils;
    FILEREADCSV TopMarkFile;
    public school()
    {
        TopMarkFile = new FILEREADCSV();
    }

    public void processPupils()throws IOException

    {
        setUpPupilList();
        TopMark();
        DisplayDetails();
    }

    
public void ReadPupilDetails()
    {
    }

    public void TopMark()
    {
    }

    public void DisplayDetails()
    {
    }

    public void setUpPupilList()throws IOException

    {
        System.out.println("School: Pupil Mark update");
        System.out.println("** Preparing to read data file.");

        String[] dataRows = TopMarkFile.readCSVtable();
        noOfPupils = dataRows.length ;

        System.out.println("** " + noOfPupils + " rows read.\n\n");

        PupilList = new Pupil[noOfPupils];

        for  (int i = 0; i < noOfPupils; i++) {
            PupilList[i] = new Pupil();
                 PupilList[i].readPupilDetails(dataRows[i+0]);
        }
    }
}
