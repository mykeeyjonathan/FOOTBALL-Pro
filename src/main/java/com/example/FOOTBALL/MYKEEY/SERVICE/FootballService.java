package com.example.FOOTBALL.MYKEEY.SERVICE;

import com.example.FOOTBALL.MYKEEY.ENTITY.Football;

import java.awt.*;
import java.util.List;

public interface FootballService {
    Football createFootball(Football football);
    Football getFootballById(Long footballId);

    List<Football> getAllFootballs();

    Football updateFootball(Football football);

    void deleteFootball(Long footballId);
}
