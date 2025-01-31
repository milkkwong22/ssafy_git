package ssafy2047;

public class UserManager {
	
	User[] userList = new User[100];
	User loginUser;
	static int memberSize = 0;
	
	// 가입하기
	void signUp() {
		while(true) {
			boolean idExist = false; //아이디 중복 확인 값
			System.out.println("----------------------------------------회원 가입");
			System.out.println("종료를 입력하면 메인 메뉴로 돌아갑니다.");
			System.out.println("가입할 아이디 입력 :");
			String inputId = BoardTest.sc.nextLine();
			if (inputId.equals("종료")) {
				break;
			}
			// 아이디 중복확인
			for (int i = 0; i < memberSize; i++) {
				if (userList[i].getUserId().equals(inputId)) {
					idExist = true;
					break;
				}
			}
			if (idExist == true) { //매치가 안되는 경우 반복문 처음으로
				System.out.println("이미 존재하는 아이디");
				continue;
			}
			System.out.println("가입할 비밀번호 입력 :");
			String inputPassword = BoardTest.sc.nextLine();
			if (inputPassword.equals("종료")) {
				break;
			}
			System.out.println("가입할 이메일 입력 :");
			String inputEmail = BoardTest.sc.nextLine();
			if (inputEmail.equals("종료")) {
				break;
			}
			System.out.println("가입할 닉네임 입력 :");
			String inputNickName = BoardTest.sc.nextLine();
			if (inputNickName.equals("종료")) {
				break;
			}
			System.out.println("가입할 이름 입력 :");
			String inputUserName = BoardTest.sc.nextLine();
			if (inputUserName.equals("종료")) {
				break;
			}
			userList[memberSize++] = new User(memberSize, inputId, inputPassword, inputUserName, inputNickName, inputEmail);
			System.out.println("가입이 완료되었습니다.");
			break;
			}	
		}
	// 로그인 하기 User로 리턴
	User login() {
		while(true) {
			boolean idExist = false; //아이디 중복 확인 값
			boolean passwordMatch = false; //패스워드 일치 여부
			int idExistInx = -1;
			System.out.println("----------------------------------------로그인");
			System.out.println("종료를 입력하면 메인 메뉴로 돌아갑니다.");
			System.out.println("아이디 입력 :");
			String inputId = BoardTest.sc.nextLine();
			if (inputId.equals("종료")) {
				break;
			}
			for (int i = 0; i < memberSize; i++) {
				if (userList[i].getUserId().equals(inputId)) {
					idExist = true;
					idExistInx = i;
					break;
				}
			}
			if (idExist == false) {
				System.out.println("아이디가 존재하지 않습니다.");
				continue;
			}
			System.out.println("비밀번호 입력 :");
			String inputPassword = BoardTest.sc.nextLine();
			if (inputPassword.equals("종료")) {
				break;
			}
			if(userList[idExistInx].getUserPassword().equals(inputPassword)) {
				passwordMatch = true;
			} else {
				System.out.println("회원정보가 일치하지 않습니다.");
				continue;
			}
			if (idExist && passwordMatch) {
				System.out.println("----------------------------------------");
				System.out.println("로그인 성공");
				return userList[idExistInx];
			}
		}
		return null;
		}
	}