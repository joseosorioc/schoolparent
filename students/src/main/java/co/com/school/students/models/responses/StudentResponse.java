package co.com.school.students.models.responses;

import co.com.school.students.models.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class StudentResponse {


    private List<Student> students;

    private Integer totalResults;




}
