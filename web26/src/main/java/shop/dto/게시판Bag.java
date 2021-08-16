package shop.dto;

public class 게시판Bag {
	private String id;
	private String title;
	private String writer;
	private String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "게시판Bag [id=" + id + ", title=" + title + ", writer=" + writer + ", content=" + content + "]";
	}
	
	
	
}
