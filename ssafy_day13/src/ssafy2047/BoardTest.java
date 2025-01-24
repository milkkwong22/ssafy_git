package ssafy2047;

import java.util.Scanner;

public class BoardTest {

	static Scanner sc = new Scanner(System.in);
	static UserManager um = new UserManager();
	static CommentManager cm = new CommentManager();
	static ArticleManager am = new ArticleManager();
	static User currentUser = null;
	static boolean exitProgram = false;

	
	public static void main(String[] args) {
		
		
		System.out.println("----------------------------------------\n게시판 접속");
				
		while (true) {
			if (exitProgram) {
				System.out.println("----------------------------------------\n접속 종료");
				break;
			}
			if (currentUser == null) {
				while(true) {
					int numChoose = menuLogout();
					if (numChoose == 0) {
						break;
					}
				}
				
			} else {
				while(true) {
					int numChoose = menuLogin();
					if (numChoose == 0) {
						break;
					}
				}
			}
			
		}
	}
	
	
	//로그인 전 메인메뉴
	static int menuLogout() { // 0. 종료,  1. task 미완료
		System.out.println("---------------------------------------- 메인메뉴");
		System.out.println("작업을 선택하세요 \n1. 로그인 \n2. 회원가입 \n0. 종료");
		while(true) {
			int numChoose = Integer.parseInt(sc.nextLine());
			switch (numChoose) {
			case 1: {
				currentUser = um.login();
				if (currentUser == null) {
					return 1;
				} else {
					System.out.println(currentUser.getUserName()+"님 환영합니다.");
					return 0;
				}
			}
			case 2: {
				um.signUp();
				return 1;
			}
			case 0: {
				exitProgram = true;
				return 0;
			}
			default:
				continue;
			}
		}

	}
	
	//로그인 후 메인메뉴
	static int menuLogin() { // 0. 종료,  1. task 미완료
		System.out.println("----------------------------------------\n"+currentUser.getUserName() +"  접속 중");
		System.out.println("작업을 선택하세요 \n1. 게시글 작성 \n2. 게시글 보기 \n3. 로그아웃 \n0. 종료");
		while(true) {
			int numChoose = Integer.parseInt(sc.nextLine());
			switch (numChoose) {
			case 1: {
				am.writeAticle();
				return 1;
			}
			case 2: {
				while(true) {
					if (am.viewArticleList() == 0) {
						break;
					}
				}
				return 1;
			}
			case 3: {
				currentUser = null;
				return 0;
			}
			case 0: {
				exitProgram = true;
				return 0;
			}
			default:
				continue;
			}
			
		}

	}
	

	
	static void printWithLineBreak(String input, int lineLength) {
	    int length = input.length();
	    for (int i = 0; i < length; i += lineLength) {
	        if (i + lineLength < length) {
	            System.out.println(input.substring(i, i + lineLength));
	        } else {
	            System.out.println(input.substring(i));
	        }
	    }
	}
	
}
