package co.com.school.students.repositories;

import co.com.school.students.models.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

    Mono<Student> findById(int id);
    Mono<String> deleteById(int id);


}
