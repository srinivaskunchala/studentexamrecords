package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentExamRecorsdRestController {

 
	@GetMapping(value="/stud/examrec", produces=MediaType.APPLICATION_JSON_VALUE  )
	@ResponseBody
	public ResponseEntity<StudentExam> getExamRecords() {
		StudentExam stud =new StudentExam();
		stud.studno=1;
		stud.studName="srirama";;
		stud.maths="100";
		stud.science="100";
		stud.english="100";
		return ResponseEntity.ok(stud);

	}
}
