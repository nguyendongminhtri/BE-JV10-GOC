package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(unique = true)
    private String name;
    private String avatar;
    @ManyToOne
    User user;

//    public Category() {
//    }
}
