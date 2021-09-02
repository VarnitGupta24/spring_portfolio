package com.example.sping_portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

            public static void main(String[] args){
                int grade1;
                grade1 = 1;
                int grade2;
                grade2 = 2;
                int grade3;
                grade3 = 3;
                int grade4;
                grade4 = 4;
                int grade5;
                grade5 = 5;
                float avg12 = (grade1 + grade2) / 2;
                float avg34 = (grade3 + grade4) / 2;
                float finalAvg = (avg12 / 5 + avg34 / 5 + 3 * grade5/ 5) / 3;
                System.out.println(avg12);
                System.out.println(avg34);
                System.out.println(finalAvg);
            }
        }

    
