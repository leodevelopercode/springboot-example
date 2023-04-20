package com.xxx.list;

import com.xxx.list.dto.People;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author Xiexingxie
 * @date 2023/3/4 下午 08:26
 */


public class LinkedListTest {

    @Test
    public void linkedList() {
        LinkedList<Object> linkedList = new LinkedList<>();
        List<People> people = addPeople();
        linkedList.add(people);
        System.out.println(linkedList);
    }
    
    public List<People> addPeople(){
        List<People> list = new ArrayList<>();
        for (int i = 0; i <= 20 ; i++) {
            People people = new People();
            people.setName("john" + i);
            people.setGender("男");
            people.setAge(18);
            list.add(people);
        }
        return list;
    }

    @Test
    public void setTest() {
        // 无顺序的添加
        Set<People> set1 = addPeople2();
        System.out.println("set1 = " + set1);
    }


    public Set<People> addPeople2(){
        Set<People> set = new HashSet<>();
        for (int i = 0; i <= 20 ; i++) {
            People people = new People();
            people.setName("john" + i);
            people.setGender("男");
            people.setAge(18);
            set.add(people);
        }
        return set;
    }
    
}
