package com.example.demo.controller;

import com.example.demo.dto.request.SongDTO;
import com.example.demo.dto.response.ResponMessage;
import com.example.demo.model.Song;
import com.example.demo.service.song.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/song")
@CrossOrigin(origins = "*")
@RestController
public class SongController {
@Autowired
private ISongService songService;
    @PostMapping
    public ResponseEntity<?> createSong(@Valid @RequestBody SongDTO songDTO){
        Song song = new Song(songDTO.getName(), songDTO.getAvatar(), songDTO.getLyrics(), songDTO.getMp3Url(),songDTO.getCategory());
        songService.save(song);
        return new ResponseEntity<>(new ResponMessage("yes"), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?> listSong(){
        return new ResponseEntity<>(songService.findAll(), HttpStatus.OK);
    }
}
