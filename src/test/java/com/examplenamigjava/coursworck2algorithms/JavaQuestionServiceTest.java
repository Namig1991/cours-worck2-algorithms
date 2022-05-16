package com.examplenamigjava.coursworck2algorithms;

import com.examplenamigjava.coursworck2algorithms.Service.JavaQuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.examplenamigjava.coursworck2algorithms.ConstantsForJavaQuestionServise.*;
import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceTest {

    JavaQuestionService out = new JavaQuestionService();

    @BeforeEach
    public void fillQustionsSet() {
        out.getQuestions().add(FIRST_QUESTION);
    }

    @Test
    public void shouldReturnAddedQuestion() {
        assertEquals(SECOND_QUESTION, out.add(QUESTION_2, ANSWER_2));
        assertTrue(2==out.getQuestions().size());
    }

    @Test
    public void shouldThrowsIllegalArgumentExceptionWhenQuestionAlreadyExists() {
        assertThrows(IllegalArgumentException.class,()->out.add(QUESTION_1,ANSWER_1));
    }
    @Test
    public void shouldThrowsIllegalArgumentExceptionWhenIncorrectInput() {
        assertThrows(IllegalArgumentException.class, ()->out.add(EMPTY_STRING,STRING_IS_BLANK));
    }

    @Test
    public void shouldReturnRemovedQuestion() {
        assertEquals(FIRST_QUESTION,out.remove(QUESTION_1,ANSWER_1));
        assertTrue(0==out.getQuestions().size());
    }
    @Test
    public void shouldThrowsIllegalArgumentExceptionWhenQuestionDoesNotExists() {
        assertThrows(IllegalArgumentException.class,()->out.remove(QUESTION_2,ANSWER_2));
    }

    @Test
    public void shouldReturnCollectionOfQuestions() {
        out.add(QUESTION_2,ANSWER_2);
        assertEquals(QUESTION_SET,out.getAll());
    }

    @Test
    public void shouldReturnRandomQuestion() {
        assertTrue(QUESTION_SET.contains(out.getRandomQuestion()));
    }
}
