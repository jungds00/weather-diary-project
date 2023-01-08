
import java.util.Calendar;
import java.util.Scanner;

public class JavaStudy05 {
    public static void main(String[] args) {
        int startday = 0;
        int endday = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,1);
        startday = cal.get(Calendar.DAY_OF_WEEK);
        endday = cal.getActualMaximum(Calendar.DATE);
        System.out.println();
        System.out.println();
        System.out.printf("[%d년 %02d월]\n",year,month);
        System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
        for (int i = 1; i < startday; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= endday; i++) {
            System.out.printf("%02d\t",i);
            if(startday % 7 == 0) {
                System.out.println();
            }
            startday++;
        }
    }
}
