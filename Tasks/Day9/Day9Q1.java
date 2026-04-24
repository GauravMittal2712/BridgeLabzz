import java.util.Random;

public class Day9Q1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        calculate_wages cal =  new calculate_wages();
        cal.calculate();
    }

}
class employeedata {
    public final int employee_wageperhour = 20;
    public final int Employee_fulltime = 8;
    public final int Employee_parttimehour = 4;
    public final int maxi_days = 20;
    public final int maxi_hours = 100;
}

class calculate_wages extends employeedata{ 
    int total_emp_hour = 0;
    int total_emp_days=0;
    Random random = new Random();
    int emphour=0;

    void calculate(){
        while(total_emp_hour < maxi_hours && total_emp_days < maxi_days){
            total_emp_days++;
            int empcheck = random.nextInt(3);
            switch (empcheck){
                case 1:
                    emphour = Employee_fulltime;
                    System.out.println("Day "+ emphour+" Full Time");
                    break;
                case 2:
                    emphour = Employee_parttimehour;
                    System.out.println("Day "+emphour+" Part Time");
                    break;
                default:
                    emphour=0;
                    System.out.println("Day "+emphour+" Absent");
                    break;

            }
            total_emp_hour+=emphour;
            int daily_wages = total_emp_hour*employee_wageperhour;
            System.out.println("Hours Worked " + emphour);
            System.out.println("Daily Wages "+daily_wages);
        }
        int salary = total_emp_hour*employee_wageperhour;
        System.out.println("Total Working Days: " + total_emp_days);
        System.out.println("Total Working Hours: " + total_emp_hour);
        System.out.println("Total Salary: " + salary);
    }
}
    
    
