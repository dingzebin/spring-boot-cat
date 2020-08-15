package com.cat.springboot;

import com.cat.springboot.autoconfigure.CatClientAutoConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {CatClientAutoConfiguration.class})
public class AutoConfigureTest {

    @Test
    public void testCatInit() {

    }
}
