package empwage;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation Program\n");
		final int part_Time = 2;
		final int full_Time = 1;
		final int wage_per_Hour = 20;
		final int WorkingDayInMonth = 20;
		final int WorkingHourPerMonth = 100;

		int total_Wage = 0;

		int dailyWages = 0;
		int MonthlyWages = 0;
		int workingDay = 1;
		int day = 1;
		int working_Hours = 0;
		int totalWorkingHoursInMonth = 0;
		System.out.printf("%5s		%5s		%5s		%5s\n","Day","Working_Hours","daily Wage","Total_Working_Hours\n\n");
		//for(int day=1,total_working_Hours = 0;day <= WorkingDayInMonth && total_working_Hours < WorkingHourPerMonth; day++,total_working_Hours +=working_Hours) {
		while (workingDay <= WorkingDayInMonth && totalWorkingHoursInMonth <= WorkingHourPerMonth) {
		int empType = (int) (Math.random() * 100) % 3;

		switch (empType) {

		case full_Time:
			System.out.println("Employee is Present FullTime\n");
			working_Hours = 8;
			dailyWages = working_Hours * wage_per_Hour;
			MonthlyWages = dailyWages + MonthlyWages;
			totalWorkingHoursInMonth = totalWorkingHoursInMonth + working_Hours;
			break;

		case part_Time:
			System.out.println("Employee Present PartTime\n");
			working_Hours = 4;
			dailyWages = working_Hours * wage_per_Hour;
			MonthlyWages = dailyWages + MonthlyWages;
			totalWorkingHoursInMonth = totalWorkingHoursInMonth + working_Hours;
			break;

		default:
			System.out.println("Employee is Absent\n");

		}
		day++;
		workingDay++;



		System.out.printf("%5d		%5d		%5d		%5d\n",day,working_Hours,dailyWages, totalWorkingHoursInMonth);
		}

		System.out.println("Total Working Hours of the Month : "+ totalWorkingHoursInMonth );
		System.out.println();
		System.out.println("Total wage for a month :  "+ MonthlyWages);

	}
}
