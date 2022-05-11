package models;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyAdmin extends Personal_Info{
	private Company CompanyName; 
	private ArrayList <JobPoster> companyJobPosters = new ArrayList <JobPoster>();
	public CompanyAdmin(String name, String email, String password, String title, Company Name) {
		super(name,email,password,title);
		CompanyName = Name;
	}

	public Company getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(Company companyName) {
		CompanyName = companyName;
	}
	
	Scanner input = new Scanner(System.in);
	int counter2  = 1 ;
	
	
	public Company findcompany(ArrayList<CompanyAdmin> list ,String email) {
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getEmail().equals(email)) {
				Company user = list.get(i).getCompanyName();
				return user;
			}
		}
		return null;
	}
	public JobPoster addJobPoster() {
		System.out.println("What is the name of JobPoster " + counter2  + " ? ");
		String AddingJobPoster = input.nextLine();
		System.out.println();
		System.out.println("What is his email ? ");
		String AddingJobPosteremail = input.nextLine();
		System.out.println();
		System.out.println("What is his password ? ");
		
		String AddingJobPosterpassword = input.nextLine();
		while (!MainClass.lengthofpasswordchecker(AddingJobPosterpassword)) {
			AddingJobPosterpassword = input.nextLine();
		}
		
		System.out.println("What is his job title ? ");
		String AddingJobPostertitle = input.nextLine();
		System.out.println();
		System.out.println("Loading !!! ");
		System.out.println();
		System.out.println(AddingJobPoster + " is successfully added as a job poster in " + this.getCompanyName().getName() + " company");
		System.out.println();
		counter2++;
		JobPoster newPoster = new JobPoster(AddingJobPoster , AddingJobPosteremail ,  AddingJobPosterpassword , AddingJobPostertitle , this.getCompanyName());
		this.getCompanyName().getJobPosters().add(newPoster);
		return newPoster;
	}
	
	public void ListingJobPosters(Company x ) {
		System.out.println("The job posters list for your company is :  " );
		System.out.println();
		int counter = 1;
		if( x.getJobPosters().size() != 0) {
			for(int i = 0 ; i < x.getJobPosters().size() ; i++) {
				System.out.println("Job Poster " + counter + " ) ");
				System.out.println();
				System.out.println("Name is " + " : " + x.getJobPosters().get(i).getName());
				System.out.println();
				System.out.println( "Email" + " : " + x.getJobPosters().get(i).getEmail());
				System.out.println();
				System.out.println("Title " + " : " + x.getJobPosters().get(i).getTitle());
				System.out.println();
				System.out.println("Company Name " + " : " + x.getName());
				System.out.println();
				System.out.println();
				counter++;
			}
		}
	}
	
	public void removeposter(Company companyposters , String name) {
		int found = 0;
		if(companyposters.getJobPosters().size() != 0) {
			for(int i = 0 ; i < companyposters.getJobPosters().size() ; i++) {
				if(companyposters.getJobPosters().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
					found = 1;
					companyposters.getJobPosters().remove(i);
					System.out.println();
					System.out.println("Loading !!");
					System.out.println();
					System.out.println("Removal has been done successfully ");
					System.out.println();
					System.out.println("The new updated list of job posters are : ");
					ListingJobPosters(companyposters);
					break;
				}
			}
			if(found == 0) {
				System.out.println();
				System.out.println("No Job Poster with this name ! Failed to remove ");
				System.out.println();
			}
		}
		else {
			System.out.println("The company has no job posters yet !!");
		}
		
	}
	public void addjobposter(Company companyposters , JobPoster name) {
		if(companyposters.getJobPosters().size() != 0) {
					companyposters.getJobPosters().add(name);
					System.out.println();
					System.out.println("Loading !!");
					System.out.println();
					System.out.println("Removal has been done successfully ");
					System.out.println();
					System.out.println("The new updated list of job posters are : ");
					ListingJobPosters(companyposters);
				}
	}
	public void EditDetails(Company companydetails) {
	
		System.out.println("Do you want to change the company's name ? ");
		String ischangename = input.nextLine();
		while(!MainClass.errorcheck(ischangename)) {
			ischangename = input.nextLine();
		}
		if(ischangename.toLowerCase().equals("yes")) {
				String oldname = companydetails.getName();
				System.out.println();
				System.out.println("What do you the name to be : ");
				String changedname = input.nextLine();
				companydetails.setName(changedname);
				System.out.println("Loading !!");
				System.out.println();
				System.out.println("Name changed successfully from " + oldname + " to " + companydetails.getName() + " !!");
				System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Do you want to change the company's date ? ");
		String ischangedate = input.nextLine();
		while(!MainClass.errorcheck(ischangedate)) {
			ischangedate = input.nextLine();
		}
		if(ischangedate.toLowerCase().equals("yes")) {
				int olddate = companydetails.getPublishDate();
				System.out.println();
				System.out.println("What do you the date to be : ");
				int changedate = input.nextInt();
				while(changedate > 2022) {
					System.out.println("Enter a valid date please " );
					changedate = input.nextInt();
				}
				companydetails.setPublishDate(changedate);
				System.out.println("Loading !!");
				System.out.println();
				System.out.println("date changed successfully from " + olddate + " to " + companydetails.getPublishDate() + " !!");
				System.out.println();
		}
		
		System.out.println("Do you want to change the number of employees ? ");
		String ischangeemployees = input.nextLine();
		ischangeemployees = input.nextLine();
		while(!MainClass.errorcheck(ischangeemployees)) {
			ischangeemployees = input.nextLine();
		}
		if(ischangeemployees.toLowerCase().equals("yes")) {
				int x = companydetails.getNo_of_employees();      // to store the numberr
				System.out.println();
				System.out.println("What do you the number of employees to be : ");
				int changeemployees = input.nextInt();
				companydetails.setNo_of_employees(changeemployees);
				System.out.println("Loading !!");
				System.out.println();
				System.out.println("Number of employees changed successfully to " + companydetails.getNo_of_employees()  +" instead of " + x + " !!");
				System.out.println();
		}
		

	}
	}


