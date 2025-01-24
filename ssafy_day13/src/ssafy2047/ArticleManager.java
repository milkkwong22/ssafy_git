package ssafy2047;

public class ArticleManager {
	
	static Article[] articalList = new Article[100];
	static int articleSize = 0;
	
	void writeAticle() {
		while(true) {
			System.out.println("----------------------------------------게시글 작성\n제목을 작성하세요 :");
			String inputTitle = BoardTest.sc.nextLine();
			System.out.println("내용을 작성하세요 (enter로 작성완료 :");
			String inputContext = BoardTest.sc.nextLine();
			System.out.println("----------------------------------------\n다음 내용으로 등록하시겠습니까?\n");
			BoardTest.printWithLineBreak(inputContext, 30);
			System.out.println("----------------------------------------\n1.등록 \n2.작성 취소");
			int numChoose = Integer.parseInt(BoardTest.sc.nextLine());
			if (numChoose == 1) {
				articalList[articleSize++] = new Article(articleSize, inputTitle,inputContext, numChoose, BoardTest.currentUser.getNickName());
				break;
			}
			
		}
		
	}
	
	int viewArticle(Article article) {
		article.setViewCount(article.getViewCount()+1);
		System.out.println("----------------------------------------게시글 탭");
		System.out.println("제목 : "+article.getTitle());
		System.out.println("작성자 : "+article.getNickName());
		System.out.println("조회수 : "+article.getViewCount());
		System.out.println("작성일 : "+article.getRegDate());
		System.out.println("내용 :\n" );
		BoardTest.printWithLineBreak(article.getContext(), 30);
		System.out.println("----------------------------------------댓글 탭");
		BoardTest.cm.showComment(article.getArticleId());
		System.out.println("----------------------------------------\n1. 게시글 삭제\n2. 댓글작성\n3. 댓글 삭제\n0. 종료");
		while (true) {
			int numChoose = Integer.parseInt(BoardTest.sc.nextLine());
			switch (numChoose) {
			case 1:{
				if (BoardTest.currentUser.getUserCode() == article.getUserCode()) {
					removeArticle(article.getArticleId());
					System.out.println("본인 확인 완료! 게시글이 삭제되었습니다.");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return 0;
				} else {
					System.out.println("작성자가 아닙니다.");
				}
				return 1;
			}
			case 2:{
				BoardTest.cm.writeComment(article.getArticleId());
				return 1;
			}
			case 3:{
				System.out.println("----------------------------------------\n삭제할 댓글 번호를 입력하세요 :");
				int commentChoose = Integer.parseInt(BoardTest.sc.nextLine());
				BoardTest.cm.removeComment(article.getArticleId(), commentChoose);
				return 1;
			}
			case 0:{
				return 0;
			}
			default:{
				continue;
			}		
			}
		}
	}
	
	int viewArticleList() {
		while(true) {
			System.out.println("----------------------------------------\n게시글 목록");
			for (int i = 0; i < articleSize; i++) {
				System.out.println((i+1)+". "+articalList[i].getTitle());
			}
			System.out.println("----------------------------------------\n게시글 번호를 입력하세요.\n뒤로 가려면 0을 입력하세요");
			while (true) {
				try {
					int numchoose = Integer.parseInt(BoardTest.sc.nextLine());
					if (numchoose==0) {
						return 0;
					} else {
						while(true) {
							switch (viewArticle(articalList[numchoose-1])) {
							case 0:{
								return 1;
							}
							default:{
								continue;
							}
							}
						}
						
					}
				} catch (Exception e) {
					continue;
				}													
			}
		}
	}
	
	void removeArticle(int articalId) {
		for (int i = 0; i < articleSize; i++) {
			if (articalList[i].getArticleId() == articalId) {
				articalList[i] = null;
				for (int j = i ; j < articleSize; j++) {
					articalList[j] = articalList[j+1];
				}
				articleSize--;
				BoardTest.cm.removeCommentAll(articalId);
				break;
			}
		}
	}
}
