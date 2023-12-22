package in.co.vwits.smdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.co.vwits.smdb.model.Student;

public interface StudentRepo extends MongoRepository<Student, Integer> {

}
