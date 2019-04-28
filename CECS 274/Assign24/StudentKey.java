// Modify this class to implement the Comparable interface
public class StudentKey implements Comparable<StudentKey>, HasClone<StudentKey>
{
    public StudentKey(StudentKey Item)
    {
      Widget = Item.Widget;
      StudentID = Item.StudentID;
    };
    public StudentKey(double iWidget, int iID)
    {
      Widget = iWidget;
      StudentID = iID;
    }
    public StudentKey(){};
    public int compareTo(StudentKey other)
    {
	     if(StudentID == other.StudentID)
	      return 0;
	     else if(StudentID < other.StudentID)
	      return -1;
	     else
	      return 1; // if(StudentID > other.StudentID)
    };
    public StudentKey Clone()
    {
	     StudentKey newStudentKey = new StudentKey(this);
	     return newStudentKey;
    };
    public double Widget;
    public int StudentID;
};
