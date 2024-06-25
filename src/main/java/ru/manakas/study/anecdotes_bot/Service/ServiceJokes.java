package ru.manakas.study.anecdotes_bot.Service;

import ru.manakas.study.anecdotes_bot.Model.ModelJokes;

import java.util.List;
import java.util.Optional;

public interface ServiceJokes{
    Optional<ModelJokes> createJoke(ModelJokes text);

    List<ModelJokes> getAllJokes();//

    Optional<ModelJokes> getJokeById(Long id);//

    void deleteJokeById(Long id);//

    Optional<ModelJokes> changeJokeById(Long id, ModelJokes text);///
}
