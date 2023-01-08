import java.util.Random;
import java.util.Scanner;

public class JavaStudy04 {
    public static void main(String[] args) {
        Random random = new Random();
        int first = 0;
        int year2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        year2 = year % 100;
        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String mf = sc.next();
        if(mf.equals("m")){
            first = 3;
        }else {
            first = 4;
        }
        System.out.printf("%02d%02d%02d-%d%06d",year2,month,day,first,random.nextInt(1000000));
    }

}
