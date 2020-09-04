package ru.rest.app.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.rest.app.forms.QuestionForm;
import ru.rest.app.models.Question;

public interface QuestionService {

    Page<Question> findAll(Long idI, Pageable pageable);

    Question addQuestion(Long idI, QuestionForm questionForm);

    Question get(Long idI, Integer displayOrder);

    Question update(Long idI, Integer displayOrder, QuestionForm questionForm);

    void delete(Long idI, Integer displayOrder);
}
