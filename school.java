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

   public void processPupils()
   {
       setUpPupilList();
       TopMark();
       DisplayDetails();
   }

   public void setUpPupilList()
   {
       // placeholder
   }

   public void TopMark()
   {
       // placeholder
   }
   public void DisplayDetails()
   {
       //placeholder
}
}