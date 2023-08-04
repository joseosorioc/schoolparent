package co.com.school.students.controllers;

import co.com.school.students.models.responses.StudentResponse;
import co.com.school.students.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController


@RequestMapping(value = "api/v1/students", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor

public class StudentsController {

    private final StudentService studentService;

    @GetMapping(path = "")
    public Mono<ResponseEntity<StudentResponse>> getAllStudents(){
       return studentService.getAllStudents().flatMap(res -> {
           return Mono.just(ResponseEntity.ok().body(res));
       });
    }


}
