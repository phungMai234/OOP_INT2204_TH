

public class StudentManagement
{
	/* method: students have same group */
	public static boolean sameGroup(Student s1, Student s2)
	{
		if(s1.getGroup() == s2.getGroup())
		{
			return true;
		}
		else
			return false;
		
	}
	
	
	/*method : print students have same group*/
	public static void studentByGroup(String group, Student students[])
	{
		
		/*for(Student s: students)
		{
			if(s.getGroup() == group)
			{
				s.getInfo();
			}
		}*/
		int i;
		for(i = 0; i < students.length; i++)
		{
			if(students[i].getGroup() == group)
			{
				students[i].getInfo();
			}
		}
	}
	
	/*method: remove students have sample id*/
	public static void removeStudent(String id, Student students[])
	{
		int i, j;
		for(i = 0; i < students.length; i++)
		{
			if(students[i].getID() == id)
			{
				for(j = i; j < students.length - 1; j++)
				{
					students[j] = students[j + 1];
				}
				System.out.println("done");
		
			}
		}
	}
	
	
	public static void main(String args[])
	{
		Student[] students = new Student[100];
		
		
		/* task 1 */
		Student s = new Student();
		s.setName("Phung Thi Tuyet Mai");
		s.setID("17020875");
		s.setGroup("K62CD");
		s.setMail("phungtuyet234@gmail.com");
		
		System.out.println(s.getName());
		s.getInfo();
		System.out.println("-----------------------------");
		
		
		/*task 2*/
		Student s1 = new Student();
		
		Student s2 = new Student("Mai", "17020875", "17020875@vnu.com");
		
		Student s3 = new Student("quan", "17020984","17020984@vnu.com");
		
		s3.setGroup("INT22041");
		
		Student s4 = new Student(s);
		
		
		
		/* task 3*/
		if(sameGroup(s2, s3))
		{
			System.out.println("Same Group");
		}
		else
		{
			System.out.println("Unsame Group");
		}
		
		if(sameGroup(s2, s4))
		{
			System.out.println("Same Group");
		}
		else
		{
			System.out.println("Unsame Group");
		}
		System.out.println("-----------------------------------");
		
		
		
		/* task 4*/
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s;
		
		studentByGroup("INT22041", students);
		System.out.println("-----------------------------------");
		
		
		
		/*task 5*/
		removeStudent("17020875", students);
		System.out.println("-----------------------------------");
		/* k chay*/
		int i;
		for(i = 0; i < students.length; i++)
		{
			students[i].getInfo();
		}
		
	}	
}