package com.test.test.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "STUDENT")
public class MyStudent implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "MOBILE")
    private Long mobileNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ZIPCODE")
    private String zipcode;

}
