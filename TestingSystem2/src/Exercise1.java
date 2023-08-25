public class Exercise1 {
    public  static  void  Question1()
    {
        Account account = Main.accounts[1];
        if (account.department == null) {
            System.out.println("Nhan vien k co phong ban");
        } else {
            System.out.printf("Phong ban cua nhan vien la %s%n", account.department.departmentName);

        }
    }
    public  static  void  Question2(){
        Account account = Main.accounts[1];
        if (account.joinGroup.length==0){
            System.out.println("Nhan vien nay khong co nhom");
        } else  if (account.joinGroup.length==1 || account.joinGroup.length== 2){
            System.out.println("Nhan vien nay la Java Fresher, C# Fresher");
        }else if (account.joinGroup.length ==3){
            System.out.println("nhan vien nay quan trong");
        }else {
            System.out.println("nhan vien nay hong chuyen");
        }
    }
    public  static  void  Question5(){
        Group group= Main.groups[1];
        if (group.JoinAccounts==null){
            System.out.println("Group nay khong co nhan vien");
        }else {
            switch (group.JoinAccounts.length){
                case 1:
                    System.out.println("nhom co 1 nguoi");
                    break;
                case 2:
                    System.out.println("nhom co 2 nguoi");
                    break;
                case 3:
                    System.out.println("nhom co 3 nguoi");
                    break;
                default:
                    System.out.println("nhom co nhieu nguoi");
                    break;
            }
        }

}}
