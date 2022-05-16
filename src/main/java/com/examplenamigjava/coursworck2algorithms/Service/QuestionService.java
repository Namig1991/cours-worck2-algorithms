package com.examplenamigjava.coursworck2algorithms.Service;

import com.examplenamigjava.coursworck2algorithms.data.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();
}
