import java.util.Scanner;

public class JavaStudy02 {
    public static void main(String[] args) {
        int back = 0;
        System.out.println("[캐시백 계산]");
        Scanner sc = new Scanner(System.in);
        System.out.print("결제 금액을 입력해 주세요. (금액):");
        int cash = sc.nextInt();
        back = (cash / 1000) * 100 ;
        back = Math.min(300,back);
        System.out.println("결제금액은 " + cash + "원이고, 캐시백은 " + back + "원 입니다.");

    }
}
