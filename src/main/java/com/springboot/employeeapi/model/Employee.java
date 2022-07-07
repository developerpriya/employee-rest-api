package com.springboot.employeeapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
