package models;

public class Vacancies {
	
	private String JobName;
	private double Salary;
	private String requirements;
	private static int index = 0;
	private JobPoster employer;
	private String status = "In review";
	int counter = 1;
	public Vacancies(String jobName, double salary, String requirements, JobPoster employer  ) {
		this.employer = employer;
		JobName = jobName;
		Salary = salary;
		this.requirements = requirements;	
	}
	public Vacancies() {
	}
	public void showjobdetails(Vacancies x) {
		
		System.out.print(counter);
		System.out.println(" The job details posted from " + x.getEmployer().GetCompanyName().getName() + " company are : ");
		System.out.println();
		System.out.println("The job title is : " + x.getJobName());
		System.out.println();
		System.out.println("The job salary is : " + x.getSalary());
		System.out.println();
		System.out.println("The job requierements is : " + x.getRequirements());
		System.out.println();
		counter++;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public JobPoster getEmployer() {
		return employer;
	}

	public void setEmployer(JobPoster employer) {
		this.employer = employer;
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		Vacancies.index = index;
	}

	public String getJobName() {
		return JobName;
	}
	public void setJobName(String jobName) {
		JobName = jobName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

}
