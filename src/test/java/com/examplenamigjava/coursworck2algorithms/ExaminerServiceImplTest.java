package com.examplenamigjava.coursworck2algorithms;

import com.examplenamigjava.coursworck2algorithms.Exception.QuestionBadRequestException;
import com.examplenamigjava.coursworck2algorithms.Service.ExaminerServiceImpl;
import com.examplenamigjava.coursworck2algorithms.Service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.examplenamigjava.coursworck2algorithms.ConstantsForJavaQuestionServise.FIRST_QUESTION;
import static com.examplenamigjava.coursworck2algorithms.ConstantsForJavaQuestionServise.QUESTION_SET_CONTAINS_ONE_ELEMENT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
    @Mock
    QuestionService questionServiceMock;
    @InjectMocks
    ExaminerServiceImpl out;

    @Test
    public void shouldReturnCollectionOfQuestions() {
        when(questionServiceMock.getAll()).thenReturn(QUESTION_SET_CONTAINS_ONE_ELEMENT);
        when(questionServiceMock.getRandomQuestion()).thenReturn(FIRST_QUESTION);
        assertEquals(QUESTION_SET_CONTAINS_ONE_ELEMENT, out.getQuestions(1));
    }

    @Test
    public void shooldTHrowsQuestionBadRequestExceptionWhenAmountMoreThenSize() {
        assertThrows(QuestionBadRequestException.class,()->out.getQuestions(2));
    }
}