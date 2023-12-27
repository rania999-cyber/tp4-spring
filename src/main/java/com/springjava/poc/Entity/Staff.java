package com.springjava.poc.Entity;

import javax.persistence.GenerationType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Staff {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private String desgn;
private String emailId;

}
