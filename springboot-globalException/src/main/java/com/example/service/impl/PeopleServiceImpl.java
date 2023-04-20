package com.example.service.impl;

import com.example.mapper.PeopleMapper;
import com.example.model.entity.People;
import com.example.service.IPeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/3/11 下午 09:52
 */


@Service
public class PeopleServiceImpl implements IPeopleService
{
    
    private final static Logger log = LoggerFactory.getLogger(PeopleServiceImpl.class);

    private final PeopleMapper peopleMapper;

    public PeopleServiceImpl(PeopleMapper peopleMapper) {
        this.peopleMapper = peopleMapper;
    }

    @Cacheable(value = "cacheSpace",key = "#userid")
    @Override
    public List<People> selpeopleAll(Integer userid) {
        log.info("selpeopleAll调用了一次");
        return peopleMapper.selpeopleAll(userid);
    }
}
