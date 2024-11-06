package com.nowshad.crud.enity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EmployeeLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "employeeId")
    private String employeeId;

    @Column(name = "tokenId")
    private String tokenId;

    @Column(name = "SessionId")
    private String sessionId;

    @Column(name = "isActive")
    private boolean isActive;
}
