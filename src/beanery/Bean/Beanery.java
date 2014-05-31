/*
 * Beanery.java
 * @author SonnyGauran
 */

package beanery.Bean;

public class Beanery {
    public Beanery () { }
    public static void main(String args[]) {
	EmployeeBean minion = new EmployeeBean();
	minion.setName ("Nobody");
	minion.setDepartment ("Some Department");
	minion.setSalary (20000);
	minion.setPhone(0,2100);
	minion.setMarried(false);
	
        System.out.println("Name: " + minion.getName());
        System.out.println("Department: " + minion.getDepartment());
        System.out.println("Phone: " + minion.getPhone(0));
        System.out.println("Married: " + minion.isMarried());
	System.out.println("Salary: " + minion.getSalary());
	minion.incrementSalary ();
	System.out.println("Incremented Salary: " + minion.getSalary());
	
    }
}
