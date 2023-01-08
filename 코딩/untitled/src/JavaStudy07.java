import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaStudy07 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int lotto[] = new int[6];
        int correct[] = new int[6];
        int save[] = new int [61];
        int startcnt = 0;
        int endcnt = 6;
        int comparecnt = 0;
        System.out.println("[로또 당첨 프로그램]");
        System.out.println();
        System.out.print("로또 개수를 입력해 주세요.(숫자 1~10):");
        int ltnum = sc.nextInt();
        for (int i = 'A'; i < 'A'+ltnum; i++) {
            System.out.print((char)i+"     ");
            for (int j = 0; j < lotto.length; j++) {
                lotto[j] = random.nextInt(45) + 1;
                for (int k = 0; k < j; k++) {
                    if(lotto[j] == lotto[k]) {
                        j--;
                        break;
                    }

                }
            }
            Arrays.sort(lotto);
            for (int j = 0; j < lotto.length; j++) {
                save[startcnt] = lotto[j];
                startcnt++;
                System.out.printf("%02d ",lotto[j]);
            }

            System.out.println();

        }
        startcnt = 0;
        System.out.println("[로또 발표]");
        for (int i = 0; i < correct.length; i++) {
            correct[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if(correct[i] == correct[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(correct);
        System.out.print("      ");
        for (int i = 0; i < correct.length; i++) {
            System.out.printf("%02d ",correct[i]);
        }
        System.out.println();
        System.out.println("[내 로또 결과]");
        for (int i = 'A'; i < 'A'+ltnum; i++) {
            System.out.print((char)i+"     ");
            for (int j = startcnt; j < endcnt; j++) {
                System.out.printf("%02d ",save[j]);
                for (int k = 0; k < correct.length; k++) {
                    if(save[startcnt] == correct[k])
                    {
                        comparecnt++;
                    }
                }
                startcnt++;
            }
            System.out.println("=> "+comparecnt+"개 일치");
            comparecnt = 0;
            endcnt += 6;

        }
    }
}
