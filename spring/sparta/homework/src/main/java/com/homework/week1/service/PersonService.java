package com.homework.week1.service;

import com.homework.week1.domain.PersonRepository;
import com.homework.week1.domain.PersonRequestDto;
import com.homework.week1.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public Long update(Long id, PersonRequestDto requestDto) {
        Person person = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );

        person.update(requestDto);
        return person.getId();
    }
}
