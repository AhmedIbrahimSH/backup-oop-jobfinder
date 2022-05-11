package models;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;


public class MainClass {

	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
		String new_name = new String() ,new_company_name = new String(),new_user_title =new String(),new_email = new String(),new_password= new String(), cv_input = new String();
		URL url = null;
		Company first_company = new Company("Max"), second_company = new Company("Adidas") , third_company = new Company("Siemens");
		String email = new String();
		int newAge = 0;
		ArrayList <CompanyAdmin> CompanyAdmins = new ArrayList<CompanyAdmin>() ;
	//	JobSeeker new_job_seeker = new  JobSeeker(new_name , new_email , new_password , new_user_title , cv_input);
		ArrayList <JobSeeker> JobSeekers = new ArrayList<JobSeeker>();
		ArrayList <JobPoster> max_company_jobposters,Adidas_company_jobposters,Siemens_company_jobposters;

		CompanyAdmin NewAdmin;
		Company NewCompany;
		ArrayList <Vacancies> AppliedFor = new ArrayList<Vacancies>();

		// pre-defined jobposters

		JobPoster maged = new JobPoster("Maged", "maged@gmail.com", "012345678", "HR", first_company);
		JobPoster mariam = new JobPoster("Mariam", "mariam@gmail.com", "12345678", "PR", first_company);
		
		JobPoster wael = new JobPoster("Wael", "wael@gmail.com", "10234568", "Software Developer",second_company);
		JobPoster hazem = new JobPoster("Hazem", "hazem@gmail.com", "012345678", "PR",second_company);
		
		JobPoster hassan = new JobPoster("Hassan", "hassan@gmail.com", "354864846", "HR", third_company);
		JobPoster hamada= new JobPoster("Hamada", "hamada@gmail.com", "354864846", "HR", third_company);
	
		ArrayList <JobPoster> all_jobposters = new ArrayList <JobPoster>(Arrays.asList(maged, mariam , wael , hazem , hassan , hamada));
	
		JobPoster newJobPoster = new JobPoster();
		
		String req1 = "Computer Science Graduate , min age : 20 , excellent english";
		Vacancies JobAtFirstCompany = new Vacancies("Software Developer", 1500, req1 , maged);
		String req2 = "Business Student , min age : 18 , good english";
		Vacancies Job2AtFirstCompany = new Vacancies("Business Analyst", 1600, req2,mariam);
		String req3 = "Doctor , min age : 25 , excellent english";
		Vacancies Job3AtFirstCompany = new Vacancies("Doctor ", 1800, req3, maged);
		String req4 = "Computer Science Graduate , min age : 20 , excellent english";
		Vacancies Job1AtSecondCompany = new Vacancies("Computer Science", 2000, req4, hazem);
		String req5 = "Journalist , min age : 30 , excellent english";
		Vacancies Job2AtSecondCompany = new Vacancies("Journalist", 150, req5,wael);
		String req6 = "Mechanical Engineer , min age : 20 , good english";
		Vacancies Job3AtSecondCompany = new Vacancies("Mechanical Engineer", 1500, req6,hazem);
		String req7 = "Doctor Bachaleors , min age : 26 , advanced english";
		Vacancies Job1AtThirdCompany = new Vacancies("Doctor ", 800, req1 , hamada);
		String req8 = "Electronics Engineer , min age : 19 , excellent english";
		Vacancies Job2AtThirdCompany = new Vacancies("Electronics Engineer", 1500, req1 , hassan);
		String req9 = "Teacher of French , min age : 28 , excellent english and good french";
		Vacancies Job3AtThirdCompany = new Vacancies("Teacher of French", 2500 , req1 , hamada);
		
		maged.getJobposts().add(JobAtFirstCompany);
		maged.getJobposts().add(Job3AtFirstCompany);
		hazem.getJobposts().add(Job1AtSecondCompany);
		hazem.getJobposts().add(Job3AtSecondCompany);
		wael.getJobposts().add(Job2AtSecondCompany);
		mariam.getJobposts().add(Job2AtFirstCompany);
		hamada.getJobposts().add(Job1AtThirdCompany);
		hamada.getJobposts().add(Job3AtThirdCompany);
				
		ArrayList <Vacancies> AllJobs = new ArrayList <Vacancies>(Arrays.asList(JobAtFirstCompany, Job2AtFirstCompany, Job3AtFirstCompany,Job1AtSecondCompany, Job2AtSecondCompany, Job3AtSecondCompany,Job1AtThirdCompany,Job2AtThirdCompany,Job3AtThirdCompany));
		ArrayList <Vacancies> JobsAtFirstCompany = new ArrayList <Vacancies>(Arrays.asList(JobAtFirstCompany, Job2AtFirstCompany, Job3AtFirstCompany));
		ArrayList <Vacancies> JobsAtSecondCompany = new ArrayList <Vacancies>(Arrays.asList(Job1AtSecondCompany, Job2AtSecondCompany, Job3AtSecondCompany));
		ArrayList <Vacancies> JobsAtThirdCompany = new ArrayList <Vacancies>(Arrays.asList(Job1AtThirdCompany, Job2AtThirdCompany, Job3AtThirdCompany));

		// pre-defined reviews 
		
		ArrayList <String> reviews_of_first_company = new ArrayList <String>(Arrays.asList("Given by Ahmed : Excellent", "Given by Ali : Very Good", "Given by Mohamed : Good", "Given by Salma : Good","Given by Ahmed : Very Good"));				
		ArrayList <String> reviews_of_second_company = new ArrayList <String>(Arrays.asList("Given by Hassan : Good", "Given by Omar : Very Good", "Given by Ali : Good", "Given by Hazem : Good","Given by Mariam : Very Good", "Given by Abdelrahman : Bad"));
		ArrayList <String> reviews_of_third_company = new ArrayList <String>(Arrays.asList("Given by Mark : Very Good", "Given by Hazem : Very Good", "Given by Ali : Good", "Given by Ahmed : Bad ","Given by Omar : Very Good", "Given by Abdelrahman : Excellent "));
						
		max_company_jobposters = new ArrayList <JobPoster>(Arrays.asList(maged, mariam));
		Adidas_company_jobposters = new ArrayList <JobPoster>(Arrays.asList(wael, hazem));
		Siemens_company_jobposters = new ArrayList <JobPoster>(Arrays.asList(hassan , hamada));
		
		first_company = new Company("Max" , 1910 ,10 ,100, reviews_of_first_company, JobsAtFirstCompany, max_company_jobposters);
		second_company  = new Company("Adidas", 1925 ,15,100, reviews_of_second_company, JobsAtSecondCompany, Adidas_company_jobposters);
		third_company  = new Company("Siemens", 1905 ,15,100, reviews_of_third_company, JobsAtThirdCompany, Siemens_company_jobposters);

		ArrayList <Company> all_companies = new ArrayList <Company>(Arrays.asList(first_company,second_company,third_company ));
		
		// pre-defined company admins
		
		CompanyAdmin omar = new CompanyAdmin("Omar", "omar@gmail.com", "112233445566", "General Manager ", first_company);
		CompanyAdmin sami = new CompanyAdmin("Sami","sami@gmail.com", "123456789", "Head of HR", first_company);
		
		CompanyAdmins.add(omar);
		CompanyAdmins.add(sami);
	
		// pre-defined job seekers already exists in the system
		
		JobSeeker tarek = new JobSeeker("Tarek","tarek@gmail.com","123456789","software developer ","https://www.resumonk.com/resume-templates"); 
		JobSeeker anas = new JobSeeker("Anas","anas@gmail.com","0123456789","Doctor","https://resume-example.com/"); 
		
		JobSeekers.add(tarek);
		JobSeekers.add(anas);
		
		tarek.getJobList().add(Job2AtFirstCompany);
		tarek.getJobList().add(Job3AtFirstCompany);
		tarek.getJobList().add(Job1AtSecondCompany);
		tarek.getJobList().add(Job3AtThirdCompany);
		anas.getJobList().add(Job3AtSecondCompany);
		anas.getJobList().add(Job3AtFirstCompany);
		anas.getJobList().add(Job1AtThirdCompany);
		anas.getJobList().add(Job1AtSecondCompany);
		
		boolean isjobposter = false , iscompanyadmin = false , isjobseeker = false,isurlValid = false;  // boolean values which determine the job of the user
		// start of the command line 
		// introducing with the user 
		
		System.out.println("Welcome Back !");
		System.out.println();		
		System.out.println("With this application we will help you find the best jobs available");
		Thread.sleep(2000);
		System.out.println();
		System.out.println("We are going to ask you some questions to make your experience easier");
		Thread.sleep(1000);
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Are you an employer ?  Answer \"Yes\" or \"No\"  (Enter No if you are looking for a job)");
		String answer = input.nextLine();
		while((errorcheck(answer) == false)) {
				answer = input.nextLine();
			}
		
		// specifying the user job		
		
		if(answer.toLowerCase().equals("yes")) {
				System.out.println("Please State whether you are a Job Poster or a Company Admin");
				Thread.sleep(1000);
				System.out.println("Are you a company admin ? Enter \"Yes\" or \"No\"");
				String Job = input.nextLine();
					while((errorcheck(Job) == false)) {
						Job = input.nextLine();
					}
				if(Job.toLowerCase().equals("yes"))
						iscompanyadmin = true;
				else
						isjobposter = true;		
				}
			else if(answer.toLowerCase().equals("no")) {
				isjobseeker = true;
			}

			System.out.println("Do you have an account ?   Answer with \"yes\" or \"no\" ");
			String having_an_account = input.nextLine().toLowerCase();
				while((errorcheck(having_an_account) == false)) {
					having_an_account = input.nextLine().toLowerCase();
				}
						
			 if(having_an_account.toLowerCase().equals("yes")) {
				System.out.println("Please Enter your email :  ");
				email = input.nextLine();
				System.out.println();
				System.out.println("Please Enter your Password :  ");
				String password = input.nextLine();
				if(isjobseeker == true) {
					while(account_authinticator_JobSeeker(email,password, JobSeekers) == false) {
						System.out.println("Please Enter your email :  ");
						email = input.nextLine();
						System.out.println();
						System.out.println("Please Enter your Password :  ");
						password = input.nextLine();
					}
					System.out.println();
						
					}
				
				else if(isjobposter == true) {
					System.out.println();	
					while(!account_authinticator_JobPoster(email,password,all_jobposters )) {
						System.out.println("Please Enter your email :  ");
						email = input.nextLine();
						System.out.println();
						System.out.println("Please Enter your Password :  ");
						password = input.nextLine();
					}
					System.out.println();
					System.out.println("");
			
					}
				else if(iscompanyadmin == true) {
					while(!account_authinticator_Admin(email,password, CompanyAdmins)) {
						System.out.println("Please Enter your email :  ");
						email = input.nextLine();
						System.out.println();
						System.out.println("Please Enter your Password :  ");
						password = input.nextLine();
					}
					System.out.println();
					}
		
			}
			else {
				System.out.println("We will help you register for a new account , so please complete the following questions ");
				Thread.sleep(1500);
				System.out.println("Please Enter your name :  ");
				new_name = input.nextLine();
				Thread.sleep(1000);
				System.out.println("Please Enter your age :  ");
				newAge = input.nextInt();
				Thread.sleep(1000);
				System.out.println("Please Enter your email :  ");
				new_email = input.nextLine();
				new_email = input.nextLine();
				System.out.println();
				Thread.sleep(1000);
				if(iscompanyadmin) {
					new_user_title = "Admin";
				}
				if(isjobposter) {
					new_user_title = "Job Poster";
				}
				else {
				System.out.println("Please Enter your JobTitle :");
				new_user_title = input.nextLine();
				}
				Thread.sleep(1000);
				if(isjobseeker) {
					new_company_name = "employee" ;

				}
				else {
					System.out.println("Please Enter the name of the organization you work for  :  ");
					System.out.println();
					// change here to company
					new_company_name = input.nextLine();
				}
				if(isjobposter) {
				while(!wael.iscompanyexist(all_companies, new_company_name)) {
					System.out.println("No company present with this name");
					new_company_name = input.nextLine();
				}}
				Thread.sleep(1000);
				
				while(iscompanyadmin == true &&  new_user_title.toLowerCase().equals("admin") && new_company_name.toLowerCase().equals("employee")) {
					System.out.println("You cannot enter the word employee as you mentioned you are an admin so please enter the company name ");
					new_company_name = input.nextLine();
					}
				System.out.println("Please Enter a password for your account");
				System.out.println("WARNING : Make sure your password contains at least 8 characters");
				System.out.println("Enter your password here: ");
				new_password = input.nextLine();
				while((lengthofpasswordchecker(new_password) == false)) {
					new_password = input.nextLine();
				}
				System.out.println("LOADING REGISTRATION PLEASE WAIT !");
				Thread.sleep(1500);
				System.out.println("Registered Successfully !!");
				System.out.println();
				System.out.println();
				showAccountDetails(new_name , newAge , new_password , new_email , new_user_title);
					
			}
			 if(isjobposter && having_an_account.toLowerCase().equals("no")) {
				 if(wael.iscompanyexist(all_companies , new_company_name )) {
					 Company JobPostercompany = wael.companyname(all_companies , new_company_name);
					 newJobPoster = new JobPoster(new_name , new_email , new_password, new_user_title,JobPostercompany );
					 all_jobposters.add(newJobPoster);
					 System.out.println();
					 System.out.println("You have been added successfully");
				 }}
			Thread.sleep(2000);
			
			if(new_user_title.toLowerCase().equals("admin") && !new_company_name.toLowerCase().equals("employee")) {
				NewCompany = new  Company(new_company_name);
				NewAdmin = new CompanyAdmin(new_name, new_email , new_password , new_user_title , NewCompany);
				System.out.println("When was your company published ? ");
				int publish = input.nextInt();
				while(publish < 0 || publish > 2022) {
					System.out.println("Enter a valid date please");
					publish = input.nextInt();
				}
				System.out.println();
				System.out.println("How many employees work at your company ? ");
				int newEmployees = input.nextInt();
				while(newEmployees < 0) {
					System.out.println("Enter a valid number ");
					newEmployees = input.nextInt();
				}
				System.out.println();
				System.out.println("How many free vacancies there at your company ? ");
				int newVacancies = input.nextInt();
				while(newVacancies < 0) {
					System.out.println("Enter a valid number ");
					newVacancies = input.nextInt();
				}
				System.out.println();
				System.out.println("How many Job Posters do you have ? ");
				int newJobPosters = input.nextInt();
				while(newJobPosters < 0) {
					System.out.println("Enter a valid number ");
					newJobPosters = input.nextInt();
				}
				for(int i = 0 ; i < newJobPosters ; i++) {
					NewAdmin.addJobPoster();					
				}
				NewCompany = new Company(new_company_name , publish , newVacancies ,  newEmployees , null , null , NewAdmin.getCompanyName().getJobPosters());
				all_companies.add(NewCompany);
				Thread.sleep(2000);
				Thread.sleep(1500);
				System.out.println("Do you want to add any job posters ? ");
				String addjob = input.nextLine();
				addjob = input.nextLine();
				while(!errorcheck(addjob)) {
					addjob = input.nextLine();
				}
				if(addjob.toLowerCase().equals("yes")) {
					NewAdmin.addJobPoster();
				}
				NewAdmin.ListingJobPosters(NewCompany);
				System.out.println("Do you want to remove any job posters ? ");
				String removejob = input.nextLine();
				while(errorcheck(addjob) == false) {
					removejob = input.nextLine();
				}
				if(removejob.toLowerCase().equals("yes")) {
					System.out.println();
					System.out.println("Enter the name of the job poster that you want to remove");
					String removed = input.nextLine();
					NewAdmin.removeposter(NewCompany, removed);
				}
				
				System.out.println("Do you want to edit any of the companies information ? ");
				String editdetails = input.nextLine();
				while(errorcheck(editdetails) == false) {
					editdetails = input.nextLine();
				}
				if(editdetails.toLowerCase().equals("yes")) {
					
					NewAdmin.EditDetails(NewCompany);
				}
				System.out.println(all_companies.size());	
			}			
			if (iscompanyadmin == true && having_an_account.toLowerCase().equals("yes") ){
				System.out.println("");
				Thread.sleep(1500);
				Company currentuser = omar.findcompany(CompanyAdmins , email);
				
				System.out.println("Do you want to add any job posters ? ");
				String addjob = input.nextLine();
				while(!errorcheck(addjob)) {
					addjob = input.nextLine();
				}
				if(addjob.toLowerCase().equals("yes")) {
					System.out.println();
					omar.addJobPoster();
				}
				System.out.println("Do you want to remove any job posters ? ");
				String removejob = input.nextLine();
				while(errorcheck(removejob) == false) {
					removejob = input.nextLine();
				}

				if(removejob.toLowerCase().equals("yes")) {
					System.out.println();
					System.out.println("Enter the name of the job poster that you want to remove");
					String removed = input.nextLine();
					omar.removeposter(currentuser , removed);
				}
				System.out.println("Do you want to edit any of the companies information ?   Enter yes or no ");
				String editdetails = input.nextLine();
				while(errorcheck(editdetails) == false) {
					editdetails = input.nextLine();
				}
				if(editdetails.toLowerCase().equals("yes")) {
					
					omar.EditDetails(first_company);
				}}
				

				if(new_company_name != null) {
				if(new_company_name.toLowerCase().equals("employee") && isjobseeker) {
					System.out.println("Please upload your cv " );
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
				        } catch (MalformedURLException e) {
				            System.out.println("The url is invalid, please try again");
				            cv_input = input.nextLine();
				        }}
				    
										
					JobSeeker new_job_seeker = new JobSeeker(new_name,new_email, new_password, new_user_title, cv_input.toString());
					JobSeekers.add(new_job_seeker);
					System.out.println();
					System.out.println("Your CV link : " + cv_input.toString());
			}}
		
			// if user is job poster 
			
			if(isjobposter) {
				System.out.println();
				System.out.println("Do you want to review the applicants ?  Enter yes or no ");
				System.out.println();
				System.out.println("");
				String review = input.nextLine();
				while(errorcheck(review) == false) {
					review = input.nextLine();
				}
				if(review.toLowerCase().equals("yes")) {
					System.out.println();
					System.out.println("The applicants are : ");
					System.out.println();
					if(having_an_account.equals("yes")) {
						for(int j = 0 ; j < all_jobposters.size() ; j++) {
							if(email.equals(all_jobposters.get(j).getEmail())) {
								JobPoster poster = all_jobposters.get(j);
								wael.showapps(JobSeekers , poster);					
							}}}
								
					else {
						wael.showapps(JobSeekers , newJobPoster);
			}}
					
				System.out.println("If you want to open the cv of some applicants Enter \"Yes\"  other wise enter no ");
				String showcv = input.nextLine();
				while(!errorcheck(showcv)) {
					showcv = input.nextLine();
				}
				if(showcv.toLowerCase().equals("yes")) {
					System.out.println("How many Cvs do you want to open ? ");
					int x = input.nextInt();
					String findapplicant = new String();
					for(int i = 0 ; i < x ; i++) {
						System.out.println("Enter the name of the applicant that you want to see his Cv");
						 findapplicant = input.nextLine();
						if(!findapplicant.equals("skip")) {
							while(!maged.applicantexist(JobSeekers , findapplicant)) {
								findapplicant = input.nextLine();
							}
							System.out.println("Loading the CV");
							System.out.println("The Cv of " + findapplicant + " will open in a new tab");
							maged.ViewApplication(maged.findseeker(JobSeekers , findapplicant).getCv());
					}
						else {
							break;
						}}}
					
					System.out.println("Do you want to post a new job ?    Enter yes or no ");
					String postjob = input.nextLine();
					while(!errorcheck(postjob)) {
						postjob = input.nextLine();
					}
					if(postjob.toLowerCase().equals("yes")) {
						System.out.println("How many jobs do you want to post ? ");
						int numberofposts = input.nextInt();
						for(int i = 0 ; i < numberofposts ; i++) {
							JobPoster poster = new JobPoster();
							if(having_an_account.equals("yes")) {
								for(int j = 0 ; j < all_jobposters.size() ; j++) {
									if(email.equals(all_jobposters.get(j).getEmail())) {
										poster = all_jobposters.get(j);
										break;
								}}
								AllJobs.add(maged.addPoster(poster));				
							}
							else {
								AllJobs.add(maged.addPoster(newJobPoster));
							}}
							
					System.out.println("Do you want to show your job posts ??      Enter yes or no");
		    		String show = input.nextLine();
			    	while(!show.toLowerCase().equals("yes") && !show.toLowerCase().equals("no")) {
			    			System.out.println("ERROR!!");
			    			System.out.println("Enter yes or no ");
			    			show = input.nextLine();
			    		}
			    		if(show.toLowerCase().equals("yes")) {
			    			if(having_an_account.equals("yes")) {
			    				for(int j = 0 ; j < all_jobposters.size() ; j++) {
									if(email.equals(all_jobposters.get(j).getEmail())) {
										JobPoster poster = all_jobposters.get(j);
										poster.showposts(poster.getJobposts(), poster);
									}}}
										
			    			else {
			    				newJobPoster.showposts(AppliedFor, newJobPoster);
			    			}}}
			
				System.out.println("Did you want to add a review a candidate ?  If you dont want enter the word \"skip\" ");
	    		System.out.println();
	    		String reviewed = input.nextLine();
	    		if(!reviewed.toLowerCase().equals("skip")) {
		    		while(!reviewed.toLowerCase().equals("yes") && !reviewed.toLowerCase().equals("no")) {
		    			System.out.println("ERROR!!");
		    			System.out.println("Enter yes or no ");
		    			reviewed = input.nextLine();
		    		}
		    		if(reviewed.toLowerCase().equals("yes")) {
		    		System.out.println("How many candidates do you want to review ? ");
		    		int numbertobereviewed = input.nextInt();
		    		for(int i = 0 ; i < numbertobereviewed ; i++) {
			    		System.out.println("Enter the name of the candidate ");
			    		String applicant = input.nextLine();

			    		if(maged.applicantexist(JobSeekers, applicant)) {
			    				maged.reviewApp(maged.findseeker(JobSeekers , applicant ));    			
			    		}
			    		else {
			    			continue;
			    		}}}}}
			// if user is job seeker   code below from line 452 to 719
			
			if(isjobseeker == true) {		
				System.out.println();
				System.out.println();
				System.out.println("Do you want to Apply and view Jobs ? ");
				System.out.println();
				System.out.println("Enter \"Yes\" or \"No\" ");
				String lookingforajob = input.nextLine();
				while(errorcheck(lookingforajob) == false) {
					lookingforajob = input.nextLine();
				}
				if(lookingforajob.toLowerCase().equals("yes")) {
									
					System.out.println();
					Thread.sleep(2000);
					int a = 1, d = 0 , x = 0 ; // to control showing the application 309-327
					System.out.println("Available Jobs : ");
					Thread.sleep(2000);
					a = 1;
					for(int i = 0 ; i < (all_companies.size()) ; i++){
						System.out.println();
						d = 0;
						Thread.sleep(1500);			 
						System.out.println();
						for(int j = 0 ; j < (all_companies.get(i).getVacancies().size()); j++) {
								System.out.println( a + " ) " + "Offered by \"" + all_companies.get(i).getName() + "\" Company : ");
								System.out.println("    Job Title : " + all_companies.get(i).getVacancies().get(j).getJobName());
								System.out.println("    Essential Requierments : " + all_companies.get(i).getVacancies().get(j).getRequirements());
								System.out.println("    Salary : " + all_companies.get(i).getVacancies().get(j).getSalary() + " $");
								a++;
								System.out.println();
								Thread.sleep(1000);
								d++;
						}}
					System.out.println("How many jobs do you want to apply for ?   Enter 0 if you don't wont to apply ");
					System.out.println();
					System.out.println();
					System.out.println("Note : Maximum number of jobs that you can apply for is 5 ");
					int applyingfor = input.nextInt();
					if(applyingfor != 0) {
						while(applyingfor < 0 || applyingfor > 5) {
							System.out.println("Invalid Number \nPlease enter number between 1 and 5");
							System.out.println();
							applyingfor = input.nextInt();
						}
						int[] numberofjobs = new int[applyingfor];
						System.out.println("Enter the indices of the jobs you want please in seperate lines");
						System.out.println();
						System.out.println("Enter 0 if you don't want to apply for further jobs ");
						for(int z = 0; z < applyingfor;z++) {
							int memo = input.nextInt(); // storing the number in a variable to ensure that it is valid
							while(memo > AllJobs.size() ) {
								System.out.println("Invalid Index entered");
								System.out.println("Please enter a valid index between 1 and " + AllJobs.size());
								memo = input.nextInt();
							}
							if(memo == 0) {
								break;
							}
							numberofjobs[z] = memo;
						}
						
						for(int i = 0 ; i < applyingfor; i++) {
							x = numberofjobs[i]; // stores number of the choosen index in the for loop to make it easy
							if(x == 0)
								break ; 
							System.out.println();
							System.out.println( (i+1) + " ) "+ "Completing your application for the \"" + AllJobs.get(x-1).getJobName()+ "\" job" + " posted by \"" + AllJobs.get(x-1).getEmployer().GetCompanyName().getName()+"\" Company");
							Thread.sleep(1500);
							System.out.println();
							int x2 = x - 1; // to store x (the index of the chosen job)
								if(having_an_account.equals("yes")) {
									for(int j = 0 ; j < JobSeekers.size() ; j++) {
										if(email.equals(JobSeekers.get(j).getEmail())) {
											JobSeekers.get(j).getJobList().add(AllJobs.get(x2));										}
									}
								}
								else {
									AppliedFor.add(AllJobs.get(x2)) ;
								}
									Thread.sleep(2000);
									System.out.println("You application has been received successfully ");
									System.out.println();
									Thread.sleep(2000);
									System.out.println("We will contact you within 2 weeks if we see that your cv applied with our requierments");
									Thread.sleep(1000);
									System.out.println("Thank you for your application and We wish to see you soon");
									System.out.println();
									System.out.println();
						
							}}}
						
						Thread.sleep(1200);
						String view;
						System.out.println("Do you want to review your applications ?  Enter Yes or No");
						view = input.nextLine();
						if(lookingforajob.toLowerCase().equals("yes")) {
							view = input.nextLine();
						}
						while(!errorcheck(view)) {
							view = input.nextLine();
						}
						
						if(view.toLowerCase().equals("yes")) {
							if(having_an_account.equals("yes")) {
								for(int j = 0 ; j < JobSeekers.size() ; j++) {
									if(email.equals(JobSeekers.get(j).getEmail())) {
										JobSeeker.showList(JobSeekers.get(j).getJobList());

										}}}
							else {
								JobSeeker.showList(AppliedFor);
							}}
										
						Thread.sleep(1200);
						String update;
						System.out.println("Do you want to Update or to delete one of your applications ?  Enter Yes or No ");
						update = input.nextLine();
						while(errorcheck(update) == false) {
							update = input.nextLine();
						}
						if(update.toLowerCase().equals("yes")) {
							
							System.out.println("Enter the letter 'U' to update and letter 'D' to delete");
							System.out.println("Enter the letter \"s\" if you don't want to continue this process ");
							String change = input.next();
							while(!change.toLowerCase().equals("u") && !change.toLowerCase().equals("d") && !change.toLowerCase().equals("s")) {
								System.out.println("Error\nEnter a valid letter please\n'U' to update and letter 'D' to delete ");
								change = input.nextLine();
							}
							if(!change.toLowerCase().equals("s")) {
							if(change.toLowerCase().equals("d")) {
								System.out.println();
								if(having_an_account.equals("yes")) {
									for(int j = 0 ; j < JobSeekers.size() ; j++) {
										if(email.equals(JobSeekers.get(j).getEmail())) {
											JobSeeker.showList(JobSeekers.get(j).getJobList());

										}}}
								
								else {
									JobSeeker.showList(AppliedFor);
								}
								System.out.println();
								if(!JobSeeker.islistempty(AppliedFor) && having_an_account.equals("no")) {
								
									tarek.deleteApp(AppliedFor);
								}
								else if(having_an_account.equals("yes")){
									for(int j = 0 ; j < JobSeekers.size() ; j++) {
										if(email.equals(JobSeekers.get(j).getEmail())) {
										if(!tarek.islistempty(JobSeekers.get(j).getJobList())) {
													tarek.deleteApp(JobSeekers.get(j).getJobList());
									
										}}}}}
						
							if(change.toLowerCase().equals("u") && having_an_account.equals("no")) {
								if(!JobSeeker.islistempty(AppliedFor)) {
									System.out.println("How many applications do you want to update (Enter 0 if you want none to be updated) ");
									int number = input.nextInt();
							
									if(number > AppliedFor.size() || number < 0) {
										System.out.println("Error!\nPlease enter valid number of Application between 0 and " + AppliedFor.size());
										number = input.nextInt();
									}
									
									for(int i = 0 ; i < number ; i++) {
									System.out.println("Enter the index of the application you want to update from the list shown above   (If you don't want to proceed updating enter 0)");
									int updatedindex = input.nextInt();
									
									if(updatedindex != 0) {
										while(updatedindex < 0 || updatedindex > AppliedFor.size()) {
											System.out.println("Invalid Index");
											System.out.println("Please enter a valid index");
											updatedindex = input.nextInt();
										}
										tarek.updateApp(AppliedFor, updatedindex);
									}
									else {
										continue;
									}}}}
							else if(change.toLowerCase().equals("u") && having_an_account.equals("yes")) {
									JobSeeker user = new JobSeeker();
									for(int j = 0 ; j < JobSeekers.size() ; j++) {
										if(email.equals(JobSeekers.get(j).getEmail())) {
											user = JobSeekers.get(j);

											}}
									
								if(!JobSeeker.islistempty(user.getJobList())) {
									System.out.println("How many applications do you want to update (Enter 0 if you want none to be updated) ");
									int number = input.nextInt();
							
									if(number > user.getJobList().size() || number < 0) {
										System.out.println("Error!\nPlease enter valid number of Application between 0 and " + AppliedFor.size());
										number = input.nextInt();
									}
									
									for(int i = 0 ; i < number ; i++) {
									System.out.println("Enter the index of the application you want to update from the list shown above   (If you don't want to proceed updating enter 0)");
									int updatedindex = input.nextInt();
						
									if(updatedindex != 0) {
										while(updatedindex < 0 || updatedindex > user.getJobList().size()) {
											System.out.println("Invalid Index");
											System.out.println("Please enter a valid index");
											updatedindex = input.nextInt();
										}
										tarek.updateApp(user.getJobList(), updatedindex);
									}
									else {
										continue;
									}}}}}}
					System.out.println();
					
					// TO ADD OR SEE REVIEWS IF YOU ARE JOBSEEKER
					
					System.out.println("Do you want to see the Companies info and the reviews of the companies ? ");
					String result = input.nextLine();
					result = input.nextLine();
					while(errorcheck(result) == false) {
						result = input.nextLine();
					}
					if(result.toLowerCase().equals("yes")) {
						
						Thread.sleep(2000);
						System.out.println();
						int a = 1 ; 
						for(int i = 0 ; i < all_companies.size(); i++) {
							System.out.println(a + " ) " + "Company Name : " + all_companies.get(i).getName() );
							System.out.println();
							System.out.println("Company Published in : " + all_companies.get(i).getPublishDate());
							System.out.println();
							System.out.println("Number of Employees in the Company is : " + all_companies.get(i).getNo_of_employees());
							System.out.println();
							System.out.println("The reviews for the Company known as  \"" + all_companies.get(i).getName() + "\"  is : ");
							System.out.println();
							System.out.println("Note That the best review is excellent while bad is the worst");
							System.out.println();
							System.out.println();
							for(int j = 0 ; j < all_companies.get(i).getReviews().size(); j++) {
								System.out.println((j+1) + " ) " + all_companies.get(i).getReviews().get(j)+"  ");
							}
							System.out.println();
							System.out.println();
							a++;
						}}
					
					System.out.println();
					System.out.println("Do you want to add a review ? ");
					String result2 = input.nextLine();
					while(errorcheck(result2) == false) {
						result2 = input.nextLine();
					}
					if(result2.toLowerCase().equals("yes")) {
						System.out.println("Please Enter the name of the company that you want to rate ");
						Thread.sleep(1000);
						System.out.println("We will show you the names of the companies ");
						System.out.println();
						int b = 1 , found = 0; // found is a variable to ensure that the company exist
						for(int i = 0 ; i < all_companies.size(); i++) {
							System.out.println(b + " ) " + all_companies.get(i).getName());
							System.out.println();
							b++;
						}
						
						System.out.println("If you changed your mind and don't want to review enter the word \"skip\" ");
						String nameofcompany = input.nextLine();
						if(!nameofcompany.toLowerCase().equals("skip")) {
							while(!JobSeeker.companyfound(nameofcompany, all_companies)) {
								System.out.println("Company not found please enter a valid company name");
								nameofcompany = input.nextLine();
							}
							System.out.println();
							System.out.println("Enter your review please ");
							String reviewing = input.nextLine();
							while(JobSeeker.reviewchecker(reviewing) == false) {
								reviewing = input.nextLine();
									}
							JobSeeker.review(nameofcompany, reviewing, all_companies);
						}}}
			
			System.out.println();
			System.out.println("Thank you for using the application and hope to see you soon ");}
				
	
	

	
	// end of main function 
	
	
	
	// the following code is the methods body mentioned above 
	
	
	/* 1) to ensure that the input is either yes or no , whatever it is , capital or lower case 
	   2) if the input is not yes or no , an error message appears requiring the user to enter yes or no as answer
	
	*/
	public static boolean errorcheck(String answer) {
		if((answer.toLowerCase().equals("yes") == false) && (answer.toLowerCase().equals("no") == false)){
			System.out.println("ERROR !");
			System.out.println("Please Enter as mentioned above with \"YES\" or \"NO\"");
			return false;
		}
		else 
			return true;
	
	}

	// to ensure that password is longer than 8
	public static boolean lengthofpasswordchecker(String password) {
		if(password.length() < 8) {
			System.out.println("ERROR !");
			System.out.println("Please Enter a password that consists of more than 8 characters ");
			return false;
		}
		else 
			return true;
		
	}
	
	public static boolean account_authinticator_JobSeeker(String email , String Password, ArrayList<JobSeeker> list) throws InterruptedException {
		
		int found = 0 , not_found = 0 , correct = 0, wrong = 0, index = 0;
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getEmail().equals(email)) {
				index = i;
				found = 1;
				if(list.get(i).getPassword().equals(Password)) {
					correct = 1;
				}
				else {
					wrong = 1;
				}
			}
			else 
				not_found = 1;
		}
		System.out.println();
		if(found == 1 && correct == 1) {
			System.out.println("Signed In Successfully");
			System.out.println();
			System.out.println("Welcome Mr. " + list.get(index).getName());
			System.out.println("Your Job Title is :  " + list.get(index).getTitle());
			return true;
		}
		else if(found == 1 && wrong == 1) {
			System.out.println();
			System.out.println("Wrong Password");
			Thread.sleep(1500);
			System.out.println("Try Again");
			return false;
		}
		else {
			System.out.println("Account not found");
			System.out.println();
			return false;
		}
	}

public static boolean account_authinticator_JobPoster(String email , String Password, ArrayList<JobPoster> list) throws InterruptedException {
	
	int found = 0 , not_found = 0 , correct = 0, wrong = 0, index = 0;
	for(int i = 0 ; i < list.size(); i++) {
		if(list.get(i).getEmail().equals(email)) {
			index = i;
			found = 1;
			if(list.get(i).getPassword().equals(Password)) {
				correct = 1;
			}
			else {
				wrong = 1;
			}
		}
		else 
			not_found = 1;
	}
	System.out.println();
	if(found == 1 && correct == 1) {
		System.out.println("Signed In Successfully");
		System.out.println();
		System.out.println("Welcome Mr. " + list.get(index).getName());
		System.out.println();
		System.out.println("Job Title : " + list.get(index).getTitle());
		return true;
	}
	else if(found == 1 && wrong == 1) {
		System.out.println();
		System.out.println("Wrong Password");
		Thread.sleep(1500);
		System.out.println("Try Again");
		return false;
	}
	else {
		System.out.println("Account not found");
		System.out.println();
		return false;
	}
}

public static void showAccountDetails(String name , int age , String Password , String email , String JobTitle) {
	System.out.println("Your Account details is : ");
	System.out.println();
	System.out.println("Name : " + name);
	System.out.println();
	System.out.println("Age : " + age);
	System.out.println();
	System.out.println("Email : " + email );
	System.out.println();
	System.out.println("Password : " + Password);
	System.out.println();
	System.out.println("Job Title : " + JobTitle);
	System.out.println();
}
public static boolean account_authinticator_Admin(String email , String Password, ArrayList<CompanyAdmin> list) throws InterruptedException {
	
	int found = 0 , not_found = 0 , correct = 0, wrong = 0, index = 0;
	for(int i = 0 ; i < list.size(); i++) {
		if(list.get(i).getEmail().equals(email)) {
			index = i;
			found = 1;
			if(list.get(i).getPassword().equals(Password)) {
				correct = 1;
			}
			else {
				wrong = 1;
			}
		}
		else 
			not_found = 1;
	}
	System.out.println();
	if(found == 1 && correct == 1) {
		System.out.println("Signed In Successfully");
		System.out.println();
		System.out.println("Welcome Mr. " + list.get(index).getName());
		System.out.println();
		System.out.println("Job Title :" + list.get(index).getTitle());
		return true;
	}
	else if(found == 1 && wrong == 1) {
		System.out.println();
		System.out.println("Wrong Password");
		Thread.sleep(1500);
		System.out.println("Try Again");
		return false;
	}
	else {
		System.out.println("Account not found");
		System.out.println();
		return false;
	}}
}
