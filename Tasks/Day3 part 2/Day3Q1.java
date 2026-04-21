import java.util.Random;

class Day3Q1 {

    // Constants
    private final int WAGE_PER_HOUR = 20;
    private final int FULL_TIME_HOURS = 8;
    private final int PART_TIME_HOURS = 4;
    private final int MAX_WORKING_DAYS = 20;
    private final int MAX_WORKING_HOURS = 100;

    // Method to calculate wages
    public void calculateWage() {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        Random random = new Random();

        while (totalEmpHours <= MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {

            totalWorkingDays++;

            int empCheck = random.nextInt(3); // 0 = Absent, 1 = Full Time, 2 = Part Time
            int empHours = 0;

            switch (empCheck) {
                case 1:
                    empHours = FULL_TIME_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Full Time");
                    break;

                case 2:
                    empHours = PART_TIME_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Part Time");
                    break;

                default:
                    empHours = 0;
                    System.out.println("Day " + totalWorkingDays + ": Absent");
            }

            totalEmpHours += empHours;
            int dailyWage = empHours * WAGE_PER_HOUR;

            System.out.println("   Hours Worked: " + empHours);
            System.out.println("   Daily Wage: " + dailyWage);
        }

        int totalSalary = totalEmpHours * WAGE_PER_HOUR;

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHours);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Day3Q1 emp = new Day3Q1();
        emp.calculateWage();
    }
}