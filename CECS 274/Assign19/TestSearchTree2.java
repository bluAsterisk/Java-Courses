// The tester for the second search tree assignment
class TestSearchTree2
{
  public static void main(String argv[]) throws Exception
  {
    SearchTree myTree = new SearchTree();
    String userInput;
    int key;
    double data;
    int answer;
    // boolean AutoGood = true;
    java.io.BufferedReader br = new java.io.BufferedReader(
      new java.io.InputStreamReader(System.in));
    do
    {
      userInput = "";
      try
      {
        System.out.println(
          "r)eport, f)ind, i)nsert, d)elete, s)ize, h)eight u)pdate q)uit");
        System.out.println("enter choice: ");
        userInput = br.readLine();
        switch (userInput.charAt(0))
        {
          case 'r' :
            myTree.Report();
            System.out.println(" ");
            break;
          case 'f' :
            System.out.println("Enter key ");
            userInput = br.readLine();
            key = Integer.parseInt(userInput);
            data = myTree.Find(key);
            System.out.println("Data was " + data);
            break;
          case 'i' :
            System.out.println("Enter key ");
            userInput = br.readLine();
            key = Integer.parseInt(userInput);
            System.out.println("Enter Data ");
            userInput = br.readLine();
            data = Float.parseFloat(userInput);
            myTree.Insert(key, data);
            break;
          case 'd' :
            System.out.println("Enter key ");
            userInput = br.readLine();
            key = Integer.parseInt(userInput);
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
	  case 'u':
            System.out.println("Enter key ");
            userInput = br.readLine();
            key = Integer.parseInt(userInput);
            System.out.println("Enter Data ");
            userInput = br.readLine();
            data = Float.parseFloat(userInput);
            myTree.Update(key, data);
            break;

          default :
            break;
        }
      }
      catch (Exception e)
      {
        System.out.println("Oops, try again");
      }
    } while (userInput.charAt(0) != 'q');

  };
};
