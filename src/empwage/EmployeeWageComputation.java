package empwage;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation Program\n");
		final int part_Time = 1;
		final int full_Time = 2;
		final int wage_per_Hour = 20;
		final int max_working_Days = 20;
		final int max_working_Hours = 100;
		
		int total_Wage = 0;
		int working_Hours = 0;
		System.out.printf("%5s		%5s		%5s		%5s\n","Day","Working_Hours","Wage","Total_Working_Hours\n\n");
		for(int day=1,total_working_Hours = 0;day <= max_working_Days && total_working_Hours < max_working_Hours; day++,total_working_Hours +=working_Hours) {
		
		int empType = (int) (Math.random() * 100) % 3;
		
		switch (empType) {
		case full_Time:
			System.out.println("Employee is Present FullTime\n");
			working_Hours = 8;
			break;
		case part_Time:
			System.out.println("Employee Present PartTime\n");
			working_Hours = 4;
			break;
		default:
			System.out.println("Employee is Absent\n");

		}
		int wage = working_Hours * wage_per_Hour;
		
		total_Wage += wage;
		System.out.printf("%5d		%5d		%5d		%5d\n",day,working_Hours,wage,total_working_Hours + working_Hours);
		}
		System.out.println("Total wage for a month is "+ total_Wage);

	}
}
