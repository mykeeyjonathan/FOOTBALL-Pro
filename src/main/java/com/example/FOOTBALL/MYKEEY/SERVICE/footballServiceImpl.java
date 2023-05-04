package com.example.FOOTBALL.MYKEEY.SERVICE;

import com.example.FOOTBALL.MYKEEY.ENTITY.Football;
import com.example.FOOTBALL.MYKEEY.REPOSITORY.footballRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class footballServiceImpl implements FootballService {
    private footballRepository footballRepository;
    @Override
    public Football createFootball(Football football) {
        return null;
    }

    @Override
    public Football getFootballById(Long footballId) {
        return null;
    }

    @Override
    public List<Football> getAllFootballs() {
        return null;
    }

    @Override
    public Football updateFootball(Football football) {
        return null;
    }

    @Override
    public void deleteFootball(Long footballId) {

    }
}
