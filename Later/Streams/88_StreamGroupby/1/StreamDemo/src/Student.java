public class Student
{
	private String studentName;
	private String teacherName;
	private int level;
	private String className;

	public Student(String studentName, String teacherName, int level,
			String className)
	{
		super();
		this.studentName = studentName;
		this.teacherName = teacherName;
		this.level = level;
		this.className = className;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}

	public String getTeacherName()
	{
		return teacherName;
	}

	public void setTeacherName(String teacherName)
	{
		this.teacherName = teacherName;
	}

	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	@Override
	public String toString()
	{
		return "Student [studentName=" + studentName + ", teacherName="
				+ teacherName + ", level=" + level + ", className=" + className
				+ "]";
	}

}
