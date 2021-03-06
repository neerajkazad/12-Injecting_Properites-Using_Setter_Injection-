package com.ip.beans;

import java.util.Properties;

public class Course {
	private Properties facultySubjects;

	public void setFacultySubjects(Properties facultySubjects) {
		this.facultySubjects = facultySubjects;
	}
	
	public void showFacultySubjects() {
		System.out.println("Faculty --> Subjects");
		for(Object o: facultySubjects.keySet()) {
			System.out.print(o+" --> ");
			System.out.println(facultySubjects.get(o));
		}
	}
}
