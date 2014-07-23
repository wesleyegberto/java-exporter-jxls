import java.util.Date;

public class Payment {
	private Date date;
	private double salary;

	public Payment(Date date, double salary) {
		this.date = date;
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
