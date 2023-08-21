import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Department
     Department department1 = new Department();
     department1.departmentID= 1;
     department1.departmentName= "Sale";
        Department department2 = new Department();
        department2.departmentID= 1;
        department2.departmentName= "Marketing";
        // Position
        Position position1 = new Position();
        position1.positionID=1;
        position1.name= Position.positionName.PM;
        Position position2 = new Position();
        position2.positionID=2;
        position2.name = Position.positionName.SM;
        Position position3 =  new Position();
        position3.positionID=3;
        position3.name= Position.positionName.Dev;
        Position position4 = new Position();
        position4.positionID=4;
        position4.name= Position.positionName.Test;
     // Group
        Group group1= new Group();
        group1.groupID = 1;
        group1.groupName= "Sale";
        // Tạo Acc
        Account acc1 = new Account();
        acc1.accountID = 1;
        acc1.email = "buihonghanh@gmail";
        acc1.userName = "hong hanh 1";
        acc1.fullName = "bui hong hanh";
        acc1.department = department1;
        acc1.position = position1;
        acc1.createDate = LocalDate.now();
        Group[] groupAcc1 = { group1 };
    }
}