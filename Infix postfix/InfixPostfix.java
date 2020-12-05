package DataStructureLab;

public class InfixPostfix {
public static void main(String[] main)
{
	String infix="A+(B*C-(D/E^F)G)*H";
	
	String postfix=infixtopostfix(infix);
			
			System.out.println(postfix);
}

public static String infixtopostfix(String infix) 
{
	String concatString="";
	InfixPostfixStack st=new InfixPostfixStack(infix.length());
	
	///scan character///
	char c;
	for(int i=0;i<infix.length();i++)
	{
		 c=infix.charAt(i);
		
		if(Character.isLetter(c)||Character.isDigit(c)) 
		{
			concatString=concatString+c;
		}
		else if(c=='('){
			st.push(c);
		}
		else if(c==')')
		{
			do {
				concatString=concatString+st.pop();
			} while (!st.isempty() && st.check()!='(');
		st.pop();
		}
		
		else {
			while (!st.isempty() &&prec(c)<=prec(st.check())) {
				
				concatString=concatString+st.pop();
			}
			st.push(c);
			}
		
	}
	
	while(!st.isempty())
	{
		concatString=concatString+st.pop();
	}
	
	return concatString;
}
public static int prec(char c)
{
 if(c=='+'||c=='-')
	 return 1;
 else if(c=='*'||c=='/')
	 return 2;
 else if(c=='^')
	 return 3;
 else {
	return 0;
}
 
 
}
}
