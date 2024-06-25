package ru.manakas.study.anecdotes_bot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.manakas.study.anecdotes_bot.Model.ModelJokes;

public interface Repository extends JpaRepository<ModelJokes, Long> {

}