package com.xl.serivceorder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SerivceOrderApplicationTests {

    @Test
    public void contextLoads() {

        System.out.println( FunctionInterfaceUtility.UUID.generate());
        System.out.println( FunctionInterfaceUtility.UUID.generate());

        System.out.println( FunctionInterfaceUtility.AGE.generate());

    }

}
