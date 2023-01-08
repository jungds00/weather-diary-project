import java.util.Random;
import java.util.Scanner;

public class JavaStudy06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("투표인원을 입력해주세요 (최대 10000):");
        int vote = sc.nextInt();
        double maxvote = 10000;
        int leevote = 0;
        int yunvote = 0;
        int simvote = 0;
        int anvote = 0;
        int cnt = 0 ;
        int maxCompare = 0;
        int compareCount = 0;
        boolean overlap = true;
        String lastvote ="";
        String president ="";
        while (overlap){                               //중복방지
            while (cnt < vote) {
                int rancnt = random.nextInt(4);
                switch (rancnt % 4) {
                    case 0 -> {
                        leevote++;
                        lastvote = "이재명";
                    }
                    case 1 -> {
                        yunvote++;
                        lastvote = "윤석열";
                    }
                    case 2 -> {
                        simvote++;
                        lastvote = "심상정";
                    }
                    case 3 -> {
                        anvote++;
                        lastvote = "안철수";
                    }
                }
                cnt++;
            }
            maxCompare = Math.max(Math.max(Math.max(leevote,yunvote),simvote),anvote);
            overlap = false;
            if(vote == maxvote) {
                if (leevote == maxCompare) {
                    compareCount++;
                }
                if (yunvote == maxCompare) {
                    compareCount++;
                }
                if (simvote == maxCompare) {
                    compareCount++;
                }
                if (anvote == maxCompare) {
                    compareCount++;
                }
                if (compareCount > 1) {
                    overlap = true;
                }
                compareCount = 0;
            }



        }

        System.out.printf("[투표진행율]: %05.2f %%, %d명 투표 ==> %s\n",(vote/maxvote)*100,cnt,lastvote);
        System.out.printf("[기호:1] 이재명: %05.2f %%, (투표수: %d)\n",(leevote/maxvote)*100,leevote);
        System.out.printf("[기호:2] 윤석열: %05.2f %%, (투표수: %d)\n",(yunvote/maxvote)*100,yunvote);
        System.out.printf("[기호:3] 심상정: %05.2f %%, (투표수: %d)\n",(simvote/maxvote)*100,simvote);
        System.out.printf("[기호:4] 안철수: %05.2f %%, (투표수: %d)\n",(anvote/maxvote)*100,anvote);
        if(vote == maxvote){
            if(leevote == maxCompare) {
                president="이재명";
            }
            else if (yunvote == maxCompare) {
                president="윤석열";
            }
            else if (simvote == maxCompare) {
                president="심상정";
            }
            else if (anvote == maxCompare) {
                president="안철수";
            }
            System.out.printf("[투표결과] 당선인: %s\n", president);
        }

        }
    }

