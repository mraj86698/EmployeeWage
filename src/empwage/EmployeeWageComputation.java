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
		int absent = 0;
		int working_Hours = 0;
		int totalWorkingHoursInMonth = 0;
		System.out.printf("%5s		%5s		%5s		%5s\n", "Day", "Working_Hours", "daily Wage","Total_Working_Hours\n\n");

		for (int workingday = 1; day <= WorkingDayInMonth
				&& totalWorkingHoursInMonth < WorkingHourPerMonth; workingday++) {
			int empType = (int) (Math.random() * 100) % 3;

			switch (empType) {

			case full_Time:
				System.out.println("Employee is Present FullTime\n");
				working_Hours = 8;
				dailyWages = working_Hours * wage_per_Hour;
				day++;

				break;

			case part_Time:
				System.out.println("Employee Present PartTime\n");
				working_Hours = 4;
				day++;
				break;

			default:
				System.out.println("Employee is Absent\n");
				working_Hours = 0;
				day++;
				break;

			}
			dailyWages = working_Hours * wage_per_Hour;
			MonthlyWages = dailyWages + MonthlyWages;
			totalWorkingHoursInMonth = totalWorkingHoursInMonth + working_Hours;

			System.out.printf("%5d		%5d		%5d		%5d\n", day, working_Hours, dailyWages,totalWorkingHoursInMonth);
		}

		System.out.println("Total Working Hours of the Month : " + totalWorkingHoursInMonth + "Hours");
		System.out.println();
		System.out.println("Total wage for a month :  " + MonthlyWages);

	}
}
