package co.com.school.students.services;

import co.com.school.students.models.responses.StudentResponse;
import co.com.school.students.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    public Mono<StudentResponse> getAllStudents(){
       return studentRepository.findAll().collectList().flatMap(students ->{
           return Mono.just(StudentResponse.builder()
                           .students(students)
                   .totalResults(students.size())
                   .build()) ;
    });



}

}
