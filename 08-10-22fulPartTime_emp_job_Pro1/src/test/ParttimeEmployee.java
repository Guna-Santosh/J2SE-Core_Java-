/*Class PartTimeEmployee:

        Instance Variables: 
            Name: working_hours
            Type: int
            Visibility: pivate
            
            Name: wagePerHours
            Type: double
            Visibility: pivate
                        
        
        Override the method computeSalary() 
        that computes the employee salary and returns the total salary 
        by following calculation
        
        Constructors:
        Define default constructor.
        Define parameterized constructor with 
        id, name, working_hours and wagePerHours arguments.



*/
package test;

public class ParttimeEmployee extends Employee {

	private int working_hours;
	private double wagePerHours;

	public ParttimeEmployee() {
	}

	double computerSalary() {
		double k = working_hours * wagePerHours;
		return k;

	}

	public ParttimeEmployee(int id, String name, int working_hours, double wagePerHours) {
		this.id = id;
		this.name = name;
		this.working_hours = working_hours;
		this.wagePerHours = wagePerHours;
	}

	@Override
	public String toString() {
		return "ParttimeEmployee [working_hours=" + working_hours + ", wagePerHours=" + wagePerHours + ", id=" + id
				+ ", name=" + name + "]";
	}

}
