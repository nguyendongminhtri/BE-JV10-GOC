package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "songs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String avatar;
    @NotNull
    private String lyrics;
    @NotNull
    private String mp3Url;
    @ManyToOne
    Category category;
    @ManyToOne
    User user;

    public Song(String name, String avatar, String lyrics, String mp3Url, Category category) {
        this.name = name;
        this.avatar = avatar;
        this.lyrics = lyrics;
        this.mp3Url = mp3Url;
        this.category = category;
    }
}
