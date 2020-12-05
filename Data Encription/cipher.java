package DataStructure;

import java.util.Scanner;
public class cipher {
public static void main(String[] args)
{
Scanner input=new Scanner (System.in);
System.out.println("Enter a String ");
String s=input.nextLine();
int l=s.length();
if(l<=3)
{
	System.out.println("Invalid String");
}
else {
	System.out.print("Cipher text : "+cipher(s));
	
}
}
public static String cipher(String s) {
	String f="";
	char ch;
	int a;
	for(int i=0;i<s.length();i++)
	{
		ch=s.charAt(i);
		if(Character.isLetter(ch))
		{
			a=ch+2;
			if((Character.isUpperCase(ch)&&a>90)||(Character.isLowerCase(ch)&&a>122))
			{
				a=a-26;
			}
			ch=(char) a; ///value a is converted to character///
			}
		f=f+ch;
		}
	return f;
}

}

	

