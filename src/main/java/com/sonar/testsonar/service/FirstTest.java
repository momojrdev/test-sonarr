package com.sonar.testsonar.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FirstTest {
    public String hellowTest() {
        return "hellow tested";
    }
    public int somme(int a, int b){
        return a+b;
    }

    public int produit(int a, int b){
        return a * b;
    }

    public int soustraction(int a, int b){
        return a - b;
    }
}
