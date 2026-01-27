import javax.swing.JOptionPane;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		//Score.java 파일을 생성해서 아래와 같은 결과를 도출하는 로직을 작성하세요.
		/*
		 * 학생의 성적을 국,영,수 로 입력 받아서, 총점, 평균, 학점(A,B,C,F)를 출력하도록 하는 프로그램입니다.
		 * 프로그램이 시작되면 각 과목을 입력 받도록 하는데, 입력된 점수는 반드시 0~100 점 사이여야 합니다.
		 * 만약 이 범위를 벗어나면 해당 과목을 다시 입력 받도록 합니다.
		 * 
		 * 만약 올바른 값이 모두 입력되면, 위 결과를 출력시키세요
		 * 
		 * 모든 점수는 배열로 관리되어야 합니다. 총점도.
		 * 학점은 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 나머지 F 처리하는데, switch case 로 작성하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		int memo[] = new int[4];
		double avg = 0.0;
		String rhk[] = {"국어", "영어", "수학", "총점","평균"};
		char rank[] = {0,0,0};
		for(int i=0;i<memo.length-1;i++) {
			System.out.print(rhk[i] + " 과목 점수를 입력하세요 : ");
			memo[i] = sc.nextInt();
			while(memo[i]<0||memo[i]>100) {
				System.out.print(rhk[i] + " 과목 점수를 다시 입력하세요 : ");
				memo[i] = sc.nextInt();
			}
			memo[3] += memo[i];
		}
		avg = (double)memo[3]/3;
		
		for(int i=0;i<memo.length-1;i++) {
			switch (memo[i]/10) {
				case 10:
		        case 9: 
		           rank[i] = 'A';  
		           break;
		        case 8:
		           rank[i] = 'B';
		           break;
		        case 7:
		           rank[i] = 'C';
		           break;   
		        default :
		           rank[i] = 'F';
		           break;
		    }
		}
	
		
		
		for(int i=0;i<rhk.length;i++) {
			if(i<4) {
				System.out.println(rhk[i] +" : "+memo[i]);
			}
			else {
				System.out.printf("%s : %.2f",rhk[i] ,avg);
			}
			if(i<3) {
				System.out.println("학점 : "+rank[i]);
			}
		}

		
		
		
		sc.close();

	}

}
