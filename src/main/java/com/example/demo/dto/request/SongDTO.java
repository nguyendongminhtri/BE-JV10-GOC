package com.example.demo.dto.request;

import com.example.demo.model.Category;
import com.example.demo.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SongDTO {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String avatar;
    @NotNull
    @NotBlank
    private String lyrics;
    @NotNull
    @NotBlank
    private String mp3Url;
    @NotNull
    private Category category;
}
