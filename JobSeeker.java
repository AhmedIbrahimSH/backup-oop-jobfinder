package models;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class JobSeeker extends Personal_Info {
	
	private String CV;
	private ArrayList <Vacancies> JobList = new ArrayList <Vacancies>() ;
	
	
	public JobSeeker(String name, String email, String password, String title, String CV) {
		super(name, email, password, title);
		this.CV = CV;
	}

	 public JobSeeker() {
	}

	Scanner input = new Scanner(System.in);
//	UserApplications seekerlist = new UserApplications();
	

	
	public ArrayList<Vacancies> getJobList() {
		return JobList;
	}
	public void setJobList(ArrayList<Vacancies> jobList) {
		JobList = jobList;
	}
	public static void showList(ArrayList<Vacancies> list) {
		if(list.size() != 0) {
		int counter2 = 1;
		System.out.println("Your Job Application list is :");
		for(int j = 0 ; j < list.size(); j++) {
			System.out.println();
			System.out.println();
			System.out.println("Application "+ counter2 + " ) ");
			System.out.println("     Company Name : " + list.get(j).getEmployer().GetCompanyName().getName());
			System.out.println("     Job Title : " + list.get(j).getJobName());
			System.out.println("     Job Status : " + list.get(j).getStatus());
			System.out.println("     Job Reqs : " + list.get(j).getRequirements());
			System.out.println("     Job Salary : " + list.get(j).getSalary());
			counter2++;
			System.out.println();
	}
	}
		if(list.size() == 0)
			System.out.println("You didnot apply for any jobs yet !!");
		
		}
	public static boolean islistempty(ArrayList<Vacancies> list) {
		if(list.size() != 0)
			return false;
		else {
			System.out.println("You donot have any applications !!");
			return true;
		}
	}
	
	public void applyJob() {
		
		
		
	}
	public static boolean reviewchecker(String x) {
		if(x.toLowerCase().equals("excellent") == false && x.toLowerCase().equals("very good") == false && x.toLowerCase().equals("good") == false && x.toLowerCase().equals("bad") == false)
		{
			System.out.println("Enter a relevant review word which are : Excellent , very good , good , bad ");
			return false;
		}
		
		else
			return true;
	}
	public  void deleteApp(ArrayList<Vacancies> x) throws InterruptedException {
			if( x.size() == 0) {
				System.out.println("You cannot delete any application because you didnot apply yet !");
			}
			else {
				System.out.println("How many applications do you want to delete (Enter 0 if you want none to be deleted) ");
				int number = input.nextInt();
				if(number > x.size() || number < 0) {
					System.out.println("Error!\nPlease enter valid number of Application between 0 and " + x.size());
					number = input.nextInt();
				}
				
				for(int i = 0 ; i < number ; i++) {
				System.out.println("Enter the index of the application you want to delete from the list shown above");
				int deletedindex = input.nextInt();
				
				
				if(deletedindex != 0) {
				while(deletedindex < 0 || deletedindex > x.size()) {
					System.out.println("Invalid Index");
					System.out.println("Please enter a valid index");
					deletedindex = input.nextInt();
				}
				System.out.println("Deleting your application for the " + x.get(deletedindex-1).getJobName() + " posted by " + x.get(deletedindex-1).getEmployer().GetCompanyName().getName());
				x.remove(deletedindex-1);
				Thread.sleep(2000);
				System.out.println("Deleted Successfully ");
				System.out.println();
				System.out.println("Your new updated Application list is : ");
				System.out.println();
//								System.out.println("Your Job Application list is :");
				JobSeeker.showList(x);
			}
			else {
				break;
			}
			}
				
	}}
	public void updateApp(ArrayList<Vacancies> x , int index) throws InterruptedException {
		URL url = null;
		String cv_input;
		boolean isurlValid = false;
		if( x.size() == 0) {
			System.out.println("You cannot update any application because you didnot apply yet !");
		}
		else {
			System.out.println("If you want to update your cv , enter the new link : ");
			Thread.sleep(1000);
			System.out.println("Please upload it as a google drive link so it can be easier for the employer to see it ");
			cv_input = input.nextLine();
			while(!isurlValid) {
		        try {
		            url = new URL(cv_input);
		            isurlValid = true;
		            System.out.println("The url is valid");
					Thread.sleep(1000);
		            System.out.println("CV is successfully uploaded");
		            this.CV = cv_input;
		            System.out.println("Your updated application cv link for the job " + x.get(index-1).getJobName() + " by the company " + x.get(index-1).getEmployer().GetCompanyName().getName() + " is : " + this.CV);
		            System.out.println();
		        } catch (MalformedURLException e) {
		            System.out.println("The url is invalid, please try again");
		            cv_input = input.nextLine();
		        }
		    }
		}
		
	}
	
	public void updateyourapp(String new_CV) throws InterruptedException {
		this.CV = new_CV;
		System.out.println("Updating your CV");
		Thread.sleep(1500);
		System.out.println("Your CV has been Successfully updated !! ");
	}
	public String getCv() {
		return CV;
	}
	public void setCv(String CV) {
		this.CV = CV;
	}
	public static void review(String nameofcompany , String review , ArrayList <Company> companies) {
		for(int i = 0 ; i < companies.size(); i++) {
			if(nameofcompany.equals(companies.get(i).getName())) {
				companies.get(i).getReviews().add(review);
				System.out.println("Your review has been succefully added");
				System.out.println("Thank you for your contribution ");
			}}}
	public static boolean companyfound(String name , ArrayList <Company> list ) {
		for(int i = 0 ; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) 
				return true;
			}
		return false;
		}
	
	public void showseekerdetails() {
		System.out.println();
		System.out.println("Name of job seeker is :  " + this.getName() );
		System.out.println();
		System.out.println("Email of " + this.getName()  +" is :  " + this.getEmail() );
		System.out.println();
		System.out.println("Title of " + this.getName()  +  " is :  " + this.getEmail() );
		System.out.println();
		System.out.println("Cv of " + this.getName()  +  " is :  " + this.getCv() );
		System.out.println();
		System.out.println();
		
	}
	 
	public void applyforjob(Vacancies x) {
		this.getJobList().add(x);
	}
	
	}
	

