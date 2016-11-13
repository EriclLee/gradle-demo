package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by zwli on 13/11/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

    @Autowired
    private  Demo demo;

    @Test
    public void addTest() throws Exception {
        int a = 1;
        int b=2;
        int expectResult = 4;
        int actualResult = demo.Add(a,b);
        assertThat(actualResult, is(equalTo(expectResult)));

    }

}