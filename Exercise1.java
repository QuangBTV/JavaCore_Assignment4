package com.vti.backend;

import Database.Account;
import Database.Department;
import Database.Position;

import java.time.LocalDate;

public class Exercise1 {
    public void ques1(){
        Department department = new Department();
        Department department1 = new Department("Dev");

        System.out.println(department);
        System.out.println(department1);
    }
    public void ques2(){
        Position position = new Position();
        Position position2 = new Position();


        Account account = new Account();
        Account account1 = new Account(1,"Mail1@gmail.com","UserName1","Nguyễn A");
        Account account2 = new Account(2,"Mail2@gmail.com","UserName2","Nguyễn B",position);

        Account account3 = new Account(3,"Mail3@gmail.com","UserName3","Nguyễn C",position2, LocalDate.of(2022,07,20));

        System.out.println(account1);
        System.out.println(account2);
        System.out.println("Creator account 2: "+ account2.createDate);
        System.out.println(account3);
    }
}
