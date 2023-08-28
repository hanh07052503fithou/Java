package com.vti.entity;

import java.time.LocalDate;

public class Group {
    int groupID;
    String groupName;
    Account creator;

    LocalDate createDate;

    GroupAccount[] JoinAccounts;

    public Group() {
    }

    public Group( String groupName, Account creator, LocalDate createDate, GroupAccount[] joinAccounts) {

        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        JoinAccounts = joinAccounts;
    }
    public Group(String groupName, Account creator, LocalDate createDate,  String[] userName) {

        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        //JoinAccounts = joinAccounts;
        Account[] accounts = new Account[userName.length];

    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public GroupAccount[] getJoinAccounts() {
        return JoinAccounts;
    }

    public void setJoinAccounts(GroupAccount[] joinAccounts) {
        JoinAccounts = joinAccounts;
    }
}
