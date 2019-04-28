
public class JoinStrings 
{
	public static void main(String argv[])
	{
		String str1 =  argv[0];
		String str2 = " will win the Super Bowl this year.";
		String strcat = str1 + str2;
		int vowelTotal = 0;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(strcat);
		for(int i = 0; i < strcat.length(); i++)
		{
			switch (strcat.charAt(i))
			{
			case 'a':
			{
				vowelTotal++;
				continue;
			}
			case 'e':
			{
				vowelTotal++;
				continue;
			}
			case 'i':
			{
				vowelTotal++;
				continue;
			}
			case 'o':
			{
				vowelTotal++;
				continue;
			}
			case 'u':
			{
				vowelTotal++;
				continue;
			}
			default:
				continue;
			}
		}
		System.out.println("Total vowels is " + vowelTotal);
	}
}
