package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.entity.positionEnum;

import java.time.LocalDate;

public class Excersice1 {
    public  void Question1(){
        Department department =  new Department();
        Department department1 = new Department("thanh cong");
        System.out.println(department.getDepartmentID()+"-"+department.getDepartmentName());
        System.out.println(department1.getDepartmentID() +"-"+department1.getDepartmentName());
    }
    public    void Question2(){
        Position position1 = new Position(1, positionEnum.Test);
        Position position2 = new Position(2, positionEnum.Dev);

        Account account1 = new Account(1,"thanhcong@gmail.com","thanh cong","cong","ne");
        Account account2 = new Account(1,"thanhcong@gmail.com","thanh cong","cong","ne",position1);
        Account account3 = new Account(1,"thanhcong@gmail.com","thanh cong","cong","ne",position2,LocalDate.now());

    }
}
