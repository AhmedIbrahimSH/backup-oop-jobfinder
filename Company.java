package models;

import java.util.ArrayList;

public class Company {
	 private String name;
	 private int No_Job_vacancies;
	 private int No_of_employees ;
	 private int publishDate;
	 private ArrayList<String> reviews ;
	 private ArrayList <Vacancies> Vacancies = new ArrayList <Vacancies>();
	 private ArrayList<JobPoster> JobPosters = new ArrayList<JobPoster>();
	 
	public Company(String name) {
		this.name = name;
	}

	public Company(String name, int publishDate , int no_Job_vacancies, int No_of_employees, ArrayList<String> reviews_of_first_company,ArrayList<Vacancies> jobsAtFirstCompany, ArrayList<JobPoster> jobPosters) {
		this.name = name;
		this.publishDate = publishDate;
		No_Job_vacancies = no_Job_vacancies;
		this.No_of_employees = No_of_employees;
		this.reviews =reviews_of_first_company;
		Vacancies = jobsAtFirstCompany;
		JobPosters = jobPosters;
	}

	public void showdetails(Company x) {
		System.out.println();
		System.out.println("Name of company : " + x.getName());
		System.out.println();
		System.out.println("Published in : " + x.getPublishDate());
		System.out.println();
		System.out.println("Number of employees " + x.getNo_of_employees());
		System.out.println();
		System.out.println();
	}

	
	public ArrayList<Vacancies> getVacancies() {
			return Vacancies;
		}
	public int getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(int publishDate) {
		this.publishDate = publishDate;
	}
	public ArrayList<JobPoster> getJobPosters() {
		return JobPosters;
	}
	public void setJobPosters(ArrayList<JobPoster> jobPosters) {
		JobPosters = jobPosters;
	}
	public void setVacancies(ArrayList<Vacancies> vacancies) {
			Vacancies = vacancies;
		}
	public ArrayList<String> getReviews() {
		return reviews;
	}
	public void setReviews(ArrayList<String> reviews) {
		this.reviews = reviews;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getNo_Job_vacancies() {
		return No_Job_vacancies;
	}
	public void setNo_Job_vacancies(int no_Job_vacancies) {
		No_Job_vacancies = no_Job_vacancies;
	}
	
	public int getNo_of_employees() {
		return No_of_employees;
	}
	public void setNo_of_employees(int no_of_employees) {
		No_of_employees = no_of_employees;
	}
	
	 
}
