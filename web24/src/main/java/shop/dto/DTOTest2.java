package shop.dto;

public class DTOTest2 {

		//게시판Bag을 2개 만들어서, 값들을 넣어보시고,
		// 넣은 값들을 프린트 해보세요.
		// 그림 그려보세요
		
		private String num;
		private String id;
		private String content;
		private String writer;
		
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public String getNum() {
			return num;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		
		
		@Override
		public String toString() {
			return "DTOTest2 [num=" + num + ", id=" + id + ", content=" + content + ", writer=" + writer + "]";
		}
		
		
		
		
		


}
