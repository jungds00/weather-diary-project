import java.util.Scanner;

public class JavaStudy08 {
    public static void stax(int m) {
        int tax = 0 ;
        int sum = 0;
        int taxarr[] ={12000000,34000000,42000000,62000000,150000000,200000000,500000000};
        int perarr[] ={6,15,24,35,38,40,42,45};
        for (int i = 0; i < taxarr.length; i++) {
                if( m > 0) {
                    tax = Math.min(taxarr[i],m) /100 * perarr[i];
                    System.out.printf("%10d * %2d = %10d\n", Math.min(taxarr[i], m), perarr[i], tax);
                    m = m - taxarr[i];
                    sum += tax;
                }
        }
        System.out.printf("[세율에 의한 세금]:%20d\n",sum);
    }
    public static void mtax(int m) {
        int tax = 0;
        if(m <=12000000){
            tax += m/100*6;
        }else if (m <= 46000000) {
            tax += m/100*15 - 1080000;
        }else if (m <= 88000000) {
            tax += m/100*24 - 5220000;
        }else if (m <= 150000000) {
            tax += m/100*35 - 14900000;
        }else if (m <= 300000000) {
            tax += m/100*38 - 19400000;
        }
        else if (m <= 500000000) {
            tax += m/100*40 - 25400000;
        }
        else if (m <= 1000000000) {
            tax += m/100*42 - 35400000;
        }else{
            tax += m/100*45 - 65400000;
        }

        System.out.printf("[누진공제 계산에 의한 세금]: %12d\n",tax);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int money = sc.nextInt();
        stax(money);
        mtax(money);



    }
}
