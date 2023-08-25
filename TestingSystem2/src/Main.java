

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static  Department[] departments = new  Department[3];
    public  static  Position[] positions = new  Position[3];
    public  static  Account[] accounts= new Account[3];
    public  static Group[] groups =new Group[3];
    public  static  GroupAccount[] groupAccounts = new  GroupAccount[3];
    public static void main(String[] args) {


        TaoDepartment();
        TaoPosistion();
        TaoAccount();
        createGroup();
        createGroupAccount();

        //Exercise1.Question1();
        //Exercise1.Question2();
        Exercise1.Question5();

    }


    public static void TaoDepartment(){

        departments[0] =new Department();
        departments[0].departmentID=1;
        departments[0].departmentName="Sale";


        departments[1] =new Department();
        departments[1].departmentID=1;
        departments[1].departmentName="Sale";

        departments[2] =new Department();
        departments[2].departmentID=1;
        departments[2].departmentName="Sale";
    }

    public  static  void  TaoPosistion(){
        positions[0]= new Position();
        positions[0].posistionID=1;
        positions[0].positionName= positionEnum.valueOf("Dev");

        positions[1]= new Position();
        positions[1].posistionID=1;
        positions[1].positionName= positionEnum.valueOf("Dev");

        positions[2]= new Position();
        positions[2].posistionID=1;
        positions[2].positionName= positionEnum.valueOf("Dev");
    }
    public static  void  TaoAccount(){
        accounts[1] = new Account();
        accounts[1].AccountID=2;
        accounts[1].email ="thanhcong202002@gmail.com";
        accounts[1].userName="thanhcongne2";
        accounts[1].fullName="Nguyễn Thành Công02";
        accounts[1].department=departments[2];
        accounts[1].position=positions[1];
        accounts[1].createDate= accounts.now();


        accounts[1].joinGroup= new  GroupAccount[]{groupAccounts[0],groupAccounts[1]};


        accounts[2] = new Account();
        accounts[2].AccountID=2;
        accounts[2].email ="thanhcong202002@gmail.com";
        accounts[2].userName="thanhcongne2";
        accounts[2].fullName="Nguyễn Thành Công02";
        accounts[2].department=departments[2];
        accounts[2].position=positions[1];
        accounts[2].createDate= accounts.now();


        accounts[0] = new Account();
        accounts[0].AccountID=2;
        accounts[0].email ="thanhcong202002@gmail.com";
        accounts[0].userName="honghanh2";
        accounts[0].fullName="Bui thị hồng Hạnh";
        accounts[0].department=departments[2];
        accounts[0].position=positions[1];
        accounts[0].createDate= accounts.now();


    }
    public  static  void  createGroupAccount(){
        groupAccounts[0]= new GroupAccount();
        groupAccounts[0].account=accounts[0];
        groupAccounts[0].group=groups[0];


        groupAccounts[1]= new GroupAccount();
        groupAccounts[1].account=accounts[1];
        groupAccounts[1].group=groups[1];

        groupAccounts[2]= new GroupAccount();
        groupAccounts[2].account=accounts[2];
        groupAccounts[2].group=groups[2];

    }
    public  static  void  createGroup(){
        groups[0]   = new Group();
        groups[0].groupID=1;
        groups[0].groupName="group1";
        groups[0].creator=accounts[0];
        groups[0].createDate=LocalDate.now();



        groups[1]   = new Group();
        groups[1].groupID=1;
        groups[1].groupName="group1";
        groups[1].creator=accounts[1];
        groups[1].createDate=LocalDate.now();
        groups[1].JoinAccounts= new GroupAccount[]{groupAccounts[0],groupAccounts[1],groupAccounts[2],};

        groups[2]   = new Group();
        groups[2].groupID=1;
        groups[2].groupName="group1";
        groups[2].creator=accounts[2];
        groups[2].createDate=LocalDate.now();

    }
}