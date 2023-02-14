package org.springframework.context.testfixture.debug;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author charles tao
 * @date 2023/2/9 - 11:41
 */

public class debug {


    @Test
    public void  debugSpring(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("debug/start.xml");
    }


}
