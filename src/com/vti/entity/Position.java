package com.vti.entity;

public class Position {
    int posistionID;
    positionEnum positionName;

    public Position(int posistionID, positionEnum positionName) {
        this.posistionID = posistionID;
        this.positionName = positionName;
    }

    public int getPosistionID() {
        return posistionID;
    }

    public void setPosistionID(int posistionID) {
        this.posistionID = posistionID;
    }

    public positionEnum getPositionName() {
        return positionName;
    }

    public void setPositionName(positionEnum positionName) {
        this.positionName = positionName;
    }
}
