public class MyArray {
	private char[] s;
	private String str;
	private char[] tempArray;
	
	{
		s=new char[26];
	}
	
	public char[] createArray()
	{
		for(int i=0;i<s.length;i++)
		{
			s[i]=(char)('A'+i);
		}
		String str="Hello World";
		return s;
	}
	
	public void displayArray()
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+",");
		}
	}
	
	public void convertStringToArray(String str)
	{
		this.str=str;
		tempArray=str.toCharArray();//converts string to char array
		
		
	}
	public void displayConvertedArray()
	{
		int count =0 ;
		//enhanched for loop
		for(int i=0;i<tempArray.length;i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch== 'e' || ch== 'i' || ch== 'o'|| ch== 'u')
			{
				
				count++;
			}
		}
		System.out.print("Number of vowel in string : "+count);
	}
	

	
	
	
	
}