package com.example.FOOTBALL.MYKEEY.CONTROLLER;

import com.example.FOOTBALL.MYKEEY.ENTITY.Football;
import com.example.FOOTBALL.MYKEEY.SERVICE.FootballService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/footballer")
public class footballerController {
    private FootballService footballService;

    @PostMapping
    public ResponseEntity<Football> createFootball(@RequestBody Football football){
        Football savedFootball = footballService.createFootball(football);
        return new ResponseEntity<>(savedFootball, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Football>> getAllFootball(){
        List<Football> footballs = footballService.getAllFootballs();
        return new ResponseEntity<>(footballs, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Football> getFootballById(@PathVariable("id") Long footballId){
        Football football = footballService.getFootballById(footballId);
        return  new ResponseEntity<>(football,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Football>> getAllFootballs(){
        List<Football> footballs = footballService.getAllFootballs();
        return new ResponseEntity<>(footballs,HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Football> updateFootball(@PathVariable("id") Long footballId, @RequestBody Football football){
        football.setId(footballId);
        Football updatedFootball = footballService.updateFootball(football);
        return new ResponseEntity<>(updatedFootball, HttpStatus.OK);
    }

    @DeleteMapping("{Id}")
    public ResponseEntity<String> deleteFootball(@PathVariable ("id") Long footballId){
        footballService.deleteFootball(footballId);
        return new ResponseEntity<>("Football successfully deleted!",HttpStatus.OK);
    }


}
