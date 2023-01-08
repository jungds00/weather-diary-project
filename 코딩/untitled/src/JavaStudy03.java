import java.util.Scanner;

public class JavaStudy03 {
    public static void main(String[] args) {
        int cash = 10000 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String person = sc.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String card = sc.next();
        if( person.equals("y") || card.equals("y")){
            cash = 8000;
        }
        if( age < 13 || time > 17){
            cash = 4000;
        }
        if( age < 3 ){
            cash = 0 ;
        }

        System.out.print("입장료: " + cash);
    }
}
