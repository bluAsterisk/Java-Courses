// Modify this class to implement the HasVisit interface
// (as defined in the assignment and lecture)
public class StudentInfo implements HasVisit<StudentInfo>, HasClone<StudentInfo>
{
    public StudentInfo(StudentInfo Item)
    {
      StudentName = Item.StudentName;
      Grade = Item.Grade;
    };
    public StudentInfo(String iName, char iGrade)
    {
      StudentName = iName;
      Grade = iGrade;
    }
    public StudentInfo()
    {
    };
    public void Visit()
    {
	     System.out.println(StudentName + " " + Grade);
    };
    public StudentInfo Clone()
    {
	     StudentInfo newStudentInfo = new StudentInfo(this);
	     return newStudentInfo;
    };
    public String StudentName;
    public char Grade;
};
