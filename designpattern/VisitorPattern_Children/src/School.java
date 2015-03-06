import java.util.ArrayList;

public class School
{

		static ArrayList<Child> childList;
		
		static
		{
				childList = new ArrayList<Child>();

				Child john = new Child("John");
				Child steve = new Child("Steve");
				Child rohit = new Child("Rohit");
				Child sonu = new Child("Sonu");

				childList.add(john);
				childList.add(steve);
				childList.add(rohit);
				childList.add(sonu);
		}
		
		
		public static void doHealthCheckup()
		{
				ChildSpecialistDoctor childSpecialistDoctor = new ChildSpecialistDoctor("Dr.Smith");
				for( Child child : childList )
                {
		                child.accept(childSpecialistDoctor);
                }
		}

}
