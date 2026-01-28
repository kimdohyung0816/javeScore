import javax.swing.JOptionPane;

class inputwhat{
	
}

class total{
	private int win , draw, lose ,total;
	private double win_p;
	private String wh = "y";
	
	void init_total() {
		total = win + draw + lose;
		win_p = (double)this.win/(total);
	}
	
	void play() {
		while(wh.equals("y")) {
			String input = JOptionPane.showInputDialog("게임을 시작함");
			while(!(input.equals("1"))&&!(input.equals("2"))&&!(input.equals("3"))&&!(input.equals("가위"))&&!(input.equals("바위"))&&!(input.equals("보"))) {
				input = JOptionPane.showInputDialog("1~3만 입력하세요");
			}
			
			if(input.equals("가위")) {
				input = "1";
			}
			else if(input.equals("바위")) {
				input = "2";
			}
			else if(input.equals("보")) {
				input = "3";
			}
			
			
			
			int com = (int)(Math.random()*3+1);
			String coms ="",inputs ="";
			
			if(com==1) {
				coms += "가위";
			}
			else if(com==2) {
				coms += "바위";
			}
			else if(com==3) {
				coms += "보";
			}
			
			if(input.equals("1")) {
				inputs += "가위";
			}
			else if(input.equals("2")) {
				inputs += "바위";
			}
			else if(input.equals("3")) {
				inputs += "보";
			}
			
			// 1 가위 2 주먹 3 보
			
			System.out.println("컴 : " + coms + ", 당신 : "+inputs);
			
			int user = Integer.parseInt(input);
			
			if(user == com) {
				System.out.println("무승부 입니다");
				this.draw++;
			}
			else if(user==3 && com==1) {
				System.out.println("컴 승리!");
				this.lose++;
			}
			else if((user==1 && com==3) || (user > com)) {
				System.out.println("사용자 승리!");
				this.win++;
			}
			else {
				System.out.println("컴 승리!");
				this.lose++;
			}
			
			this.wh = JOptionPane.showInputDialog("게임을 계속 할래요?");
		}
		
	}
	
	void game_print() {
		System.out.println("총 : " +(this.total) + ", 승 : " +this.win+", 무 : " +this.draw+", 패 : " +this.lose);
		System.out.printf("승률 %.2f\n", this.win_p);
	}
}

class all {
	void play_all(total t){
		t.play();
	    t.init_total();
		t.game_print();
	}
}

public class Gawibawbo2 {

	public static void main(String[] args) {
		total to = new total();
		all a = new all();
		a.play_all(to);
	}
}

