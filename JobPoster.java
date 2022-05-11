package models;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;



public class JobPoster extends Personal_Info {
	private  Company name;
	private ArrayList<Vacancies> jobposts = new ArrayList <Vacancies>();
	Vacancies test = new Vacancies();
	Scanner input = new Scanner(System.in);
	public JobPoster(String name2, String email, String password, String title, Company company_name) {
		super(name2, email, password, title);
		this.name = company_name;
	}
	
	public JobPoster() {
		
	}

	public Company GetCompanyName() {
		return name;
	}

	public void setCompanyName(Company name) {
		this.name = name;
	}

	public ArrayList<Vacancies> getJobposts() {
		return jobposts;
	}

	public void setJobposts(ArrayList<Vacancies> jobposts) {
		this.jobposts = jobposts;
	}

	public static void ViewApplication(String candidateCv) throws IOException, URISyntaxException{
    	
    	Desktop d = Desktop.getDesktop();
    	d.browse(new URI(candidateCv));
    	
    }
    
    public boolean iscompanyexist(ArrayList<Company> x , String name) {
		int found = 0;
    	if(x.size() != 0) {
	    	for(int i = 0 ; i < x.size() ; i++) {
	    		if(x.get(i).getName().equals(name)) {
	    			found = 1;
	    			return true;
	    		}
	    	}
    }
    if(found == 0) {
    	return false;
    }
	return false;
    }
    public Company companyname(ArrayList<Company> x , String name) {
  		int found = 0;
      	if(x.size() != 0) {
  	    	for(int i = 0 ; i < x.size() ; i++) {
  	    		if(x.get(i).getName().equals(name)) {
  	    			found = 1;
  	    			return x.get(i);
  	    		}
  	    	}
      }
      if(found == 0) {
      	System.out.println("There is no company with that name");
      }
  		return null;
      }
    
    
    public void showposts(ArrayList <Vacancies> x , JobPoster y) {
    	for(int i = 0 ; i < x.size() ; i++) {
    		if(x.get(i).getEmployer().getName().equals(y.getName())) {
    			test.showjobdetails(x.get(i));
    			System.out.println();
    		}
    	}
    }
    public void showapps(ArrayList <JobSeeker> applicants , JobPoster currentposter) {
    	if(applicants.size() != 0) {
    		for(int i = 0 ; i < applicants.size() ; i++) {
    			JobSeeker currentseeker = applicants.get(i);
    			for(int j = 0 ; j < currentseeker.getJobList().size() ; j++) {
    				
    				if(currentposter.GetCompanyName().getName().equals(currentseeker.getJobList().get(j).getEmployer().GetCompanyName().getName()))
    					System.out.println("Applying for " + currentseeker.getJobList().get(i).getJobName() + " job");
    					currentseeker.showseekerdetails();
    				
    					}
    			}
    	}
    	else
    		System.out.println("No current applicants !!");
    }
    
    
    public JobSeeker findseeker(ArrayList<JobSeeker> x , String name ) {
    	for(int i = 0 ; i < x.size() ; i++) {
    		if(x.get(i).getName().equals(name)) {
    			return x.get(i);
    		}
    	}
    	return null;
    }
    public static boolean applicantexist(ArrayList<JobSeeker> x , String name ) {
    	for(int i = 0 ; i < x.size() ; i++) {
    		if(x.get(i).getName().equals(name)) {
    			return true;
    		}
    	}
    	System.out.println("No Job seeker with that name ");
    	return false;
    }
    
    public Vacancies addPoster(JobPoster poster) {
    	System.out.println("What is the Job Title : ");
    	String Jobtitle = input.nextLine();
    	System.out.println();
    	System.out.println("What is the salary of the job :");
    	int x = input.nextInt();
    	System.out.println();
    	System.out.println("Enter the requieremnts of the job in one line ");
    	System.out.println();
    	String reqs = input.nextLine();

    	System.out.println("Loading !! publishing the job ");
    	System.out.println("Job added successfully ");
    	Vacancies newjob = new Vacancies(Jobtitle , x , reqs , poster);
    	poster.getJobposts().add(newjob);
    	return newjob;
    }
    
    public void reviewApp(JobSeeker name) {
    
    		System.out.println("What status do you want to give to  " + name.getName());
    		System.out.println();
    		String statusupdated = input.next();
    		System.out.println("Loading !!");
    		System.out.println(name.getName() + " status " + "has been changed to " + statusupdated + " successfully ." );
	    	System.out.println();	
	    		
    		}
    		
    
    	
  

}
