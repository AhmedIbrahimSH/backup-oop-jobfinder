package models;

import java.util.ArrayList;

public class JobApplication {
	
		private JobSeeker applicant;
		private ArrayList <Vacancies> List;
		
		public JobApplication(JobSeeker applicant, ArrayList<Vacancies> list) {
			this.applicant = applicant;
			List = list;
		}
		
		public JobApplication() {
			
		}

		public JobSeeker getApplicant() {
			return applicant;
		}
		public void setApplicant(JobSeeker applicant) {
			this.applicant = applicant;
		}
		public ArrayList<Vacancies> getList() {
			return List;
		}
		public void setList(ArrayList<Vacancies> list) {
			List = list;
		}
		
}
