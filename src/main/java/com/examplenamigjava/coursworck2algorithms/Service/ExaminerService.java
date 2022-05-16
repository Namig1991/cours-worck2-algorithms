package com.examplenamigjava.coursworck2algorithms.Service;

import com.examplenamigjava.coursworck2algorithms.data.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
