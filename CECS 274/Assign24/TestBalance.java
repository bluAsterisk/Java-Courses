// The tester for the balanced search tree assignment
// Use the StudentInfo and StudentClasses from your previous assignment.
public class TestBalance
{
  static java.io.BufferedReader br;
  public static StudentKey MakeKey(double Widget,int NewID)
      throws java.io.IOException
  {
    StudentKey Answer = new StudentKey(Widget,NewID);
    return Answer;
  };
  public static StudentInfo MakeInfo(String Name, char Grade)
    throws java.io.IOException
  {
    StudentInfo Answer = new StudentInfo(Name,Grade);
    return Answer;
  };
  public static void TestAndPrint(String prompt,boolean answer,
    boolean correctAnswer)
  {
    System.out.print(prompt);
    if (answer == correctAnswer)
      System.out.println("  worked");
    else
      System.out.println("  failed");
  }
  public static void main(String argv[]) throws java.io.IOException
  {
    SearchTree<StudentKey,StudentInfo> myTree =
      new SearchTree<StudentKey,StudentInfo>();
    StudentInfo data;
    data = MakeInfo("Joe",'A');
    TestAndPrint("empty tree test", myTree.Balanced(),true);
    myTree.Insert(MakeKey(3.3,3),data);
    TestAndPrint("one node tree test", myTree.Balanced(),true);
    myTree.Insert(MakeKey(2.2,2),data);
    TestAndPrint("two node tree test", myTree.Balanced(),true);
    myTree.Insert(MakeKey(5.5,5),data);
    TestAndPrint("three node tree test", myTree.Balanced(),true);
    myTree.Insert(MakeKey(6.6,6),data);
    TestAndPrint("four node tree test", myTree.Balanced(),true);
    myTree.Insert(MakeKey(7.7,7),data);
    TestAndPrint("stringy test", myTree.Balanced(),false);
    myTree.Insert(MakeKey(1.1,1),data);
    TestAndPrint("subtree test", myTree.Balanced(),false);
    myTree.Insert(MakeKey(4.4,4),data);
    TestAndPrint("large balanced tree test", myTree.Balanced(),true);
  };
};
