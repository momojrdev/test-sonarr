package com.sonar.testsonar;

import com.sonar.testsonar.service.FirstTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class hellotesting {

    @Autowired
    private FirstTest firstTest;
    @Test
    void HelloTest() {
        String result = firstTest.hellowTest();
        Assertions.assertNotNull(result);
        Assertions.assertEquals("hellow tested", result);
    }
    @Test
    void somme() {
        int a =5;
        int b = 10;
        int result1 = firstTest.somme(a, b);
        Assertions.assertEquals(15, result1);
    }
    @Test
    void produit() {
        int a =5;
        int b = 10;
        int result = firstTest.produit(a, b);
        Assertions.assertEquals(50, result);
    }
    @Test
    void soustraction() {
        int a =25;
        int b = 5;
        int result = firstTest.soustraction(a, b);
        Assertions.assertEquals(20, result);
    }


}
