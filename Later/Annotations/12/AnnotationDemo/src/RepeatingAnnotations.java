public class RepeatingAnnotations
{

	public static void main(String[] args)
	{

		/*
		 * Retrieving Annotations using Reflection API
		 * method
		 */
		Schedules schedules = ServerRestartSchedule.class
				.getAnnotation(Schedules.class);
		System.out.println(schedules);
		Schedule[] scheduleArray = schedules.value();
		for (Schedule schedule : scheduleArray)
		{
			System.out.println(schedule + " , dayOfMonth = "
					+ schedule.dayOfMonth() + " , dayOfWeek = "
					+ schedule.dayOfWeek() + " , hour = " + schedule.hour());
		}

	}
}