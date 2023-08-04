package co.com.school.students.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "age")
    private Integer age;






}
