import java.util.Comparator;

public class AgeComparator implements Comparator{
	
	public int compare(Object obj1,Object obj2)
	{
		Employee emp1=(Employee)obj1;
		Employee emp2=(Employee)obj2;
		
		if(emp1.getAge()==emp2.getAge())
			
			return emp1.getDateOfJoining().compareTo(emp2.getDateOfJoining());
		
		else if(emp1.getAge()>emp2.getAge())
			
			return 1;
		
		else
			return -1;
		
		
	}
	
	

}