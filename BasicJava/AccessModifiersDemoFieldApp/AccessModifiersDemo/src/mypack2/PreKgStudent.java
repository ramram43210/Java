package mypack2;

import mypack1.Student;

public class PreKgStudent extends Student
{

	public void displayName()
	{
		System.out.println("name : " + name);
	}

	public static void main(String[] args)
	{
		PreKgStudent preKgStudent = new PreKgStudent();
		System.out.println("name : "+preKgStudent.name);
	}

}
