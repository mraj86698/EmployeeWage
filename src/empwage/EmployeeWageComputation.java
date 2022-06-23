package empwage;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation Program");
		final int part_Time = 1;
		final int full_Time = 2;
		final int wage_per_Hour = 20;
		final int working_Days = 20;
		
		int total_Wage = 0;
		for(int day=0;day <= working_Days;day++) {
		
		int empType = (int) (Math.random() * 100) % 3;
		int working_Hours = 0;
		switch (empType) {
		case full_Time:
			System.out.println("Employee is Present FullTime");
			working_Hours = 8;
			break;
		case part_Time:
			System.out.println("Employee Present PartTime");
			working_Hours = 4;
			break;
		default:
			System.out.println("Employee is Absent");

		}
		int wage = working_Hours * wage_per_Hour;
		System.out.println("Day "+day+" Wage is "+ wage);
		total_Wage += wage;
		
		}
		System.out.println("Total wage for a month is "+ total_Wage);

	}
}
