package com.example.service;

import com.example.module.People;
import com.example.module.vo.PeopleVo;
import com.example.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Xiexingxie
 * @date 2023/4/13 下午 06:41
 */


@Service
public class PeopleService {

    private final PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<PeopleVo> getPeopleRepository() {

        List<People> all = peopleRepository.findAll();
        return all.stream().filter(people -> people.getUserId() <= 50)
                .distinct()
                .map(people -> new PeopleVo())
                .collect(Collectors.toList());

    }
}
