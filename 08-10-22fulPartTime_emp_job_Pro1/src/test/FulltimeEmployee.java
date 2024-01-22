/*Class FullTimeEmployee: 

    Instance Variable(s): 
        
        Name: salary
        Return Type: double 
        Visibility:  private
        
        Name: BONUS  (assign fixed value 2000)
        Return Type: double 
        Access Specifier:  private static final

    Override the method computeSalary() that computes and returns the total salary
    by adding specified BONUS value

    Constructors:
        Define default constructor.
        Define parameterized constructor with
        id, name and salary s arguments.
*/
package test;

public class FulltimeEmployee extends Employee {
	private double bonus;
	private double salary;

	double computerSalary() {
		double k = salary + bonus;
		return k;
	}

	public FulltimeEmployee(double salary, int id, String name) {
		this.salary = salary;
	}

	public FulltimeEmployee() {
	}

	@Override
	public String toString() {
		return "FulltimeEmployee [bonus=" + bonus + ", salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}

}
