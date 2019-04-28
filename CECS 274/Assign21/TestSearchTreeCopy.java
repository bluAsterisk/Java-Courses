// The tester for the tree copy assignment
// The student info and student key classes need
// to be modified to support HasClone.
public class TestSearchTreeCopy
{
  static java.io.BufferedReader br;
  public static StudentKey GetKey() throws java.io.IOException
  {
    String userInput;
    double NewWidget;
    int newID;
    System.out.print("Enter Widget ");
    userInput = br.readLine();
    NewWidget = Float.parseFloat(userInput);
    System.out.print("Enter StudentID ");
    userInput = br.readLine();
    newID = Integer.parseInt(userInput);
    StudentKey Answer = new StudentKey(NewWidget,newID);
    return Answer;
  };
  public static StudentInfo GetInfo() throws java.io.IOException
  {
    String userInput;
    String Name;
    char Grade;
    System.out.print("Enter Name ");
    Name = br.readLine();
    System.out.print("Enter Letter Grade ");
    userInput = br.readLine();
    Grade = userInput.charAt(0);
    StudentInfo Answer = new StudentInfo(Name,Grade);
    return Answer;
  };
  public static void main(String argv[]) throws java.io.IOException
  {
    SearchTree<StudentKey,StudentInfo> myTree =
      new SearchTree<StudentKey,StudentInfo>();
    String userInput;
    StudentKey key;
    StudentInfo data;
    int answer;
    br = new java.io.BufferedReader(
      new java.io.InputStreamReader(System.in));
    do
    {
      userInput = "";
      try
      {
        System.out.println(
          "r)eport, f)ind, i)nsert, d)elete, s)ize, h)eight u)pdate c)opy q)uit");
        System.out.print("enter choice: ");
        userInput = br.readLine();
        switch (userInput.charAt(0))
        {
          case 'r' :
            myTree.Report();
            System.out.println(" ");
            break;
          case 'f' :
            System.out.println("Enter key ");
            key = GetKey();
            data = myTree.Find(key);
            System.out.println("Data was: ");
            data.Visit();
            break;
          case 'i' :
            System.out.println("Enter key ");
            key = GetKey();
            System.out.println("Enter Data ");
            data = GetInfo();
            data.Visit();
            myTree.Insert(key, data);
            break;
          case 'd' :
            System.out.println("Enter key ");
            key = GetKey();
            myTree.Delete(key);
            break;
          case 's' :
            answer = myTree.Size();
            System.out.println("Tree size is " + answer);
            break;
          case 'h' :
            answer = myTree.Height();
            System.out.println("Tree height is " + answer);
            break;
          case 'u' :
            System.out.println("Enter key: ");
            key = GetKey();
            System.out.println("Enter Data: ");
            userInput = br.readLine();
            data = GetInfo();
            myTree.Update(key, data);
          case 'c' :
            {
              System.out.println("Doing copy");
              SearchTree<StudentKey,StudentInfo> newTree = 
                new SearchTree<StudentKey,StudentInfo>();
              newTree.CopyOf(myTree);
              System.out.println("Original was");
              myTree.Report();
              System.out.println("Copy is");
              newTree.Report();
              System.out.println("Doing Copy Constructor");
              SearchTree<StudentKey,StudentInfo> newTree2 = 
                new SearchTree<StudentKey,StudentInfo>(myTree);
              System.out.println("Copy construtor gives");
              newTree2.Report();
            }
          default :
            break;
        }
      }
      catch (Exception e)
      {
        System.out.println("Oops, try again");
      }
    } while (userInput.charAt(0) != 'q');

    //begin test code
    SearchTree<StudentKey,StudentInfo> testTree =
      new SearchTree<StudentKey,StudentInfo>();
    System.out.println("Beginning Tree Copy test...");
    System.out.println("Creating tree with 12 a, 9 b, 15 c, and 7 d");
    StudentKey testkey;
    StudentInfo testdata;
    try {
      testkey = new StudentKey(12,12);
      testdata = new StudentInfo("a",'a');
      //testdata.Visit();
      testTree.Insert(testkey,testdata);
      testkey = new StudentKey(9,9);
      testdata = new StudentInfo("b",'b');
      //testdata.Visit();
      testTree.Insert(testkey,testdata);
      testkey = new StudentKey(15,15);
      testdata = new StudentInfo("c",'c');
      //testdata.Visit();
      testTree.Insert(testkey,testdata);
      testkey = new StudentKey(7,7);
      testdata = new StudentInfo("d",'d');
      //testdata.Visit();
      testTree.Insert(testkey,testdata);
    } catch(Exception e) {
      System.out.println("Creating the testTree failed.");
    }
    System.out.println("Printing testTree. Should read d, b, a, c.");
    testTree.Report();
    System.out.println("Printing size. Should be 4.");
    System.out.println(testTree.Size());
    System.out.println("Printing height. Should be 3.");
    System.out.println(testTree.Height());
    
    System.out.println("Begining tree copy.");
    try{ 
      SearchTree<StudentKey,StudentInfo> newTestTree = 
        new SearchTree<StudentKey,StudentInfo>();
      newTestTree.CopyOf(testTree);
      System.out.println("Printing copied tree. Should read d, b, a, c.");
      newTestTree.Report();
      System.out.println("Deleting node 9 b from the copied tree.");
      newTestTree.Delete(new StudentKey(9,9));
      System.out.println("Printing copied tree. Should read d, a, c.");
      newTestTree.Report();
      System.out.println("Printing original tree. Should still read d, b, a, c.");
      testTree.Report();
    } catch(Exception e) {
      System.out.println("Tree copy failed.");
    }
    //end test code

  };
};
