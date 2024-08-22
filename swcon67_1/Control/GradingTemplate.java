
/*
จงเขียนโปรแกรมสำหรับกํารตัดเกรด โดยรับ input จําก user เป็นคะแนนดิบ (จ ํานวนเต็ม 0-100) และตัดเกรดโดยใช้เกณฑ์ดังปรํากฏใน
ตํารํางด้ํานล่ําง *ทั้งนี้กํารออกเกรดจะมีข้อพิจํารณําเพิ่มเติมดังนี้
1. ขําดเรียนไม่เกิน 3 ครั้ง หากขาดเกินได้เกรด F
2. ต้องมีคะแนนสอบรวมกลํางภําคและปลํายภําคอย่ํางต่ ํา 40 คะแนน หํากคะแนนสอบรวมไม่ถึง 40 คะแนน จะได้เกรด F แม้ว่ําคะแนนรวม
ทั้งหมดจะมํากกว่ํา 49 ก็ตําม
3. สถํานะของกํารท ําโปรเจคต้องเสร็จสมบูรณ์หํากโปรเจคไม่สมบูรณ์ จะได้เกรด I
 */
import java.util.Scanner;

public class GradingTemplate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("กรอกคะแนนรวม: ");
        int score = in.nextInt();

        System.out.print("กรอกคะแนนสอบรวม: ");
        int scoreExam = in.nextInt();

        System.out.print("สถานะการทำโปรเจค (true คือสำเร็จ / false คือไม่เสร็จ): ");
        boolean projectStatus = in.nextBoolean();

        System.out.print("จำนวนครั้งการขาดเรียน: ");
        int numAbsent = in.nextInt();

        System.out.println("Your grade: " + getGrade(score, scoreExam, projectStatus, numAbsent));
    }

    public static String getGrade(int totalScore, int examScore, boolean projectStatus, int numAbsent) {
            if(examScore<40 || numAbsent>3) return "F";

            // your code (can be many lines)
            if (projectStatus == false) return "I";

            if (totalScore >= 80)
                return "A";
            else if (totalScore < 80 && totalScore >= 75)
                return "B+";
            else if (totalScore < 75 && totalScore >= 70)
                return "B";
            else if (totalScore < 70 && totalScore >= 65)
                return "C+";
            else if (totalScore < 65 && totalScore >= 60)
                return "C";
            else if (totalScore < 60 && totalScore >= 55)
                return "D+";
            else
                return "D";
    }
}
