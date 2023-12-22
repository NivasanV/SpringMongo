package in.co.vwits.smdb.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.co.vwits.smdb.model.Student;
import in.co.vwits.smdb.repository.StudentRepo;

@RestController()
@RequestMapping("/api/student")
public class StudentRestController {
	
	@Autowired
	private StudentRepo repo;

	@GetMapping
	public List<Student> findAllStudents() {
		return repo.findAll();
	}
	
	@GetMapping("/{rollNo}")
	public Student findOneStudent(@PathVariable int rollNo) {
		return repo.findById(rollNo).get();
	}
	
	@PostMapping
	public void addStudent(@RequestBody Student student) {
		repo.save(student);
	}
	
	@DeleteMapping("/{rollNo}")
	public void deleteStudent(@PathVariable int rollNo) {
		repo.deleteById(rollNo);
	}
	
	@PutMapping
	public Student updateStudent(@RequestBody Student student) {
		return repo.save(student);
	}
}
