package com.example;
import java.util.Collections;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Student implements Comparable<Student>{
		private String firstName;
		private String lastName;
		int  studentId;
		double gPA = 0;
		
		public Student(String firstName, String lastName, int studentId, double gPA) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.studentId = studentId;
			this.gPA = gPA;
		}
		
		@Override
		public int compareTo(Student student) {
			
			/*if(gPA== student.gPA)  
				return 0;  
				else if(gPA<student.gPA)  
				return 1;  
				else  
				return -1;  */
			return this.getFirstName().compareTo(student.firstName);
			
		}

		
		
	
}
