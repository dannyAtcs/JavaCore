
class Books
{
	private String name = "GOT";
	private String Author = "Greoge RR MARTIN";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	
	
}
public class Encapsulation {
    public static void main(String[] args) {
		Books ob = new Books();
		ob.setName("HARRY POTTER");
		System.out.println("BOOK : " + ob.getName());
		ob.setAuthor("J.K. ROWLING");
		System.out.println("WRITTEN BY " + ob.getAuthor());
		
	}
}
