public class Ex4 {
    public static void main(String[] args) {
        int floor =6;
        switch(floor){
            case 1:
                System.out.println("약국");
            case 2:
                System.out.println("2층 정형외과");
            case 3:
                System.out.println("3층 피부과");
            case 4:
                System.out.println("4층 치과");
                break;
            case 5:
                System.out.println("5층 헬스클럽");
                break;
            default:
                System.out.println("없는층입니다.");
        }
    }
}
