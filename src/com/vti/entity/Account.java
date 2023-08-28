package com.vti.entity;

import java.time.LocalDate;

public class Account {
    int AccountID;
    String email;
    String userName;
    String fullName;
    Department department;

    Position position;

    LocalDate createDate;


    Group[] CreatedGroups;
    GroupAccount[] joinGroup;
    Question[] createQuestion;

    Exam[] Creator;
    public Account() {
    }

    public Account(int accountID, String email, String userName,String  FisrtName, String LastName) {
        AccountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = FisrtName+" "+ LastName;
    }
    public Account(int accountID, String email, String userName,String  FisrtName, String LastName, Position position) {
        AccountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = FisrtName+" "+ LastName;
        this.position= position;
        this.createDate=LocalDate.now();
    }
    public Account(int accountID, String email, String userName,String  FisrtName, String LastName, Position position, LocalDate createDate) {
        AccountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = FisrtName+" "+ LastName;
        this.position= position;
        this.createDate=createDate;
    }
}
