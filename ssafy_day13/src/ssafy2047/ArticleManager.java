package ssafy2047;

public class ArticleManager {
	
	Article[] userList = new Article[100];
	int ArticleSize = 0;
	
	void writeAticle() {
		while(true) {
			System.out.println("----------------------------------------");
			System.out.println("제목을 작성하세요 :");
			String inputTitle = BoardTest.sc.nextLine();
			System.out.println("내용을 작성하세요 (enter로 작성완료 :");
			String inputContext = BoardTest.sc.nextLine();
			System.out.println("----------------------------------------\n 다음 내용으로 등록하시겠습니까?\n");
			BoardTest.printWithLineBreak(inputContext, 20);
			System.out.println("----------------------------------------\n1.등록 \n2.작성 취소");
			int numChoose = Integer.parseInt(BoardTest.sc.nextLine());
			if (numChoose == 1) {
				userList[ArticleSize++] = new Article(ArticleSize, inputTitle, inputContext, BoardTest.currentUser.getUserCode(), BoardTest.currentUser.getNickName());
				break;
			}
			
		}
		
	}
	
	int viewArticle(Article article) {
		article.setViewCount(article.getViewCount()+1);
		System.out.println("----------------------------------------");
		System.out.println("제목 : "+article.getTitle());
		System.out.println("작성자 : "+article.getNickName());
		System.out.println("조회수 : "+article.getViewCount());
		System.out.println("작성일 : "+article.getRegDate());
		
	}

}
