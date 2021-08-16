package shop.dto;

public class productDTO {

	String id;
	String name;
	String content;
	String price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "productDTO [id=" + id + ", name=" + name + ", content=" + content + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
