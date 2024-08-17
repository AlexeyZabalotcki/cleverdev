package com.cleverdev.cleverdev.testtask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@ToString
@Table(name = "clients")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    private String guid;
    private String firstName;
    private String lastName;
    private String status;
    private String dob;
    private String createdDateTime;
    private String agency;
}
