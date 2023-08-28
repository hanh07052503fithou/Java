package com.vti;

public class Students {
    private int    id;
    private String name;
    private String hometown;
    private float  diem;

    public Students() {
    }

    public Students(int id, String name, String hometown) {
        this.id = id;
        this.name = name;
        this.hometown = hometown;


    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void addDiem(float diem) {
        this.diem = this.diem + diem;
    }

    public String showinfo() {
        String rank = null;
        if(this.diem<0||this.diem>10){
            return "diem khong hop le" ;
        }
        if (this.diem <= 4) {
            rank = "yếu";
        } else if (this.diem <= 6) {
            rank = "trung bình";
        } else if (this.diem <= 8) {
            rank = "khá";
        } else {
            rank = "giỏi";
        } ;

        return "id: "+this.id+" name: "+this.name+" hometown: "+this.hometown +" rank: "+rank;
    }
}
