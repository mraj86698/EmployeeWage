package empwage;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation Program");
		final int employeePresent = 1;
		final int wage_per_Hour = 20;
		int working_Hours = 0;
		int isPresent = (int) (Math.random() * 100) % 2;
		if (isPresent == employeePresent) {
			System.out.println("Employee is Present");
			working_Hours=8;
		} else {
			System.out.println("Employee is Absent");
		}
		int wage = working_Hours * wage_per_Hour;
		System.out.println("Employee daily Wage is "+ wage);

	}
}
