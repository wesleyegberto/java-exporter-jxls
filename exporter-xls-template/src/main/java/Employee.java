import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private Date birthDate;
	private double salary;
	private List<Payment> historic = new LinkedList<Payment>();

	private static int identity;

	public Employee(String name, Date birthDate, double salary) {
		this.id = ++identity;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;

		final int rnd = 1 + (int) (Math.random() * 10);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2010);
		for(int i = 0; i < rnd; i++) {
			historic.add(new Payment(cal.getTime(), Math.random() * salary + salary));
			cal.roll(Calendar.MONTH, 1);
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Payment> getHistoric() {
		return historic;
	}

	public void setHistoric(List<Payment> historic) {
		this.historic = historic;
	}

}
