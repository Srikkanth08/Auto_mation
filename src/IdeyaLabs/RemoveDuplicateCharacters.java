package IdeyaLabs;

public class RemoveDuplicateCharacters 
{
		public static void main(String args[])
		{
			String S= "IdeyaLabs";
			String S1 = "";
			for(int i=0; i<S.length();i++)
			{
				char ch = S.charAt(i);
				int a = S1.indexOf(ch);
				if(a==-1)
				{
					S1=S1+ch;
				}
			}
			System.out.println(S1);
		}
}
