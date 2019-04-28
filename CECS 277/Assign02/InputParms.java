class InputParms
{
  public static void main(String argv[])throws java.io.IOException,Exception
  {
    String[] names = {"Kevin", "Jack" , "Jude"};
    java.io.BufferedReader br = new java.io.BufferedReader(
      new java.io.InputStreamReader(System.in));
    String userInput;
    System.out.println("Please enter your name: ");
    do{
        userInput = br.readLine();
        for(int i = 0; i < names.length; i++)
        {
          if(names[i].equals(userInput))
            System.out.println("The name " + userInput + " was found");
        }
      }while(true);
  }
}
