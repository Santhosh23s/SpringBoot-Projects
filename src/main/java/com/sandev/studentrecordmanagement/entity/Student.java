package com.sandev.studentrecordmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    private Integer id;
    @Column(
            name = "first_name",
            nullable = false,
            length = 50
    )
    private String firstName;
    @Column(
            name = "last_name",
            nullable = false,
            length = 50
    )
    private String lastName;
    @Column(
            nullable = false,
            unique = true,
            length = 100
    )
    private String email;

    @Column(
            nullable = false
    )
    private Integer age;
}
