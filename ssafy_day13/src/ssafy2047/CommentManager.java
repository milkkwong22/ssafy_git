package ssafy2047;

import java.util.ArrayList;
import java.util.List;

public class CommentManager {
	
	static Comment[] commentList = new Comment[1000];
	static int commentSize = 0;
	
	
	void writeComment(int articleId) {
		while (true) {
			System.out.println("----------------------------------------댓글 작성\n내용을 작성하세요 (enter로 작성완료) :");
			String inputContext = BoardTest.sc.nextLine();
			System.out.println("----------------------------------------\n다음 내용으로 등록하시겠습니까?\n");
			BoardTest.printWithLineBreak(inputContext, 30);
			System.out.println("----------------------------------------\n1.등록 \n2.작성 취소");
			int numChoose = Integer.parseInt(BoardTest.sc.nextLine());
			if (numChoose == 1) {
				commentList[commentSize++] = new Comment(articleId, commentSize, BoardTest.currentUser.getUserCode(), BoardTest.currentUser.getNickName(), inputContext);
				break;
			}
			System.out.println("작성이 취소되었습니다.");
		}
	}
	
	void showComment(int articleId) {
		int commentNum = 1;
		for (int i = 0; i < commentSize; i++) {
			if (commentList[i].getArticleId() == articleId) {
				System.out.print(commentNum+". ");
				commentNum++;
				BoardTest.printWithLineBreak(commentList[i].getComment(), 30);
			}
		}
		
	}
	
	void removeComment(int articleId, int commentOrder) {
		for (int i = 0; i < commentSize; i++) {
			if (commentList[i].getArticleId() == articleId) {
				commentOrder--;
				if (commentOrder == 0) {
					if (BoardTest.currentUser.getUserCode()==commentList[i].getUserCode()) {
						commentList[i] = null;
						fillCommentList();
						System.out.println("본인 확인 완료! 댓글이 삭제되었습니다.");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					} else {
						System.out.println("댓글 작성자가 아닙니다.");
						break;
					}
				}
			}
		}
	}
	
	void removeCommentAll(int articleId) {
		for (int i = 0; i < commentSize; i++) {
			if (commentList[i].getArticleId() == articleId) {
				commentList[i] = null;
			}
		fillCommentList();
		}
	}
	
	void fillCommentList() {
		List<Integer> tempLocate = new ArrayList<>();
		int tempCount = 0;
		Comment[] tempArray = new Comment[1000];
		for (int i = 0; i < commentSize; i++) {
			tempArray[i] = commentList[i];
			if (commentList[i] != null) {
				tempCount++;
				tempLocate.add(i);
			}
		}
		
		for (int i = tempCount; i < commentSize; i++) {
			commentList[i] = null;
		}
		
		commentSize = tempCount;
		for (int j = 0; j < commentSize;j++) {
			commentList[j] = tempArray[tempLocate.get(j)];
		}
	}
}
