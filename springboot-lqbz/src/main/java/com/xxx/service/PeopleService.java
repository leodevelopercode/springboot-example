package com.xxx.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xxx.entities.PeopleInfo;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public  class PeopleService {

    private ObjectMapper objectMapper;

    public PeopleService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<PeopleInfo> getPeople() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("static/format.json");
        List<PeopleInfo> people = objectMapper.readValue(inputStream, new TypeReference<List<PeopleInfo>>(){});
        return people;
    }

}

