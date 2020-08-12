package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentExam {
	
	int studno;
	String studName;
	String english;
	String maths;
	String science;

}
