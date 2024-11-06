package com.nowshad.crud.enity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "RoleId")
    private Long roleId;

    @Column(name = "Role")
    private String role;
}
