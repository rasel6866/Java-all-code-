public class book2{
	
	private String bookName = "";
    private String bookAuthor = "";	
    private String bookId = "" ;
    private String bookType = "";
    private int bookCopy = 0;
	
	public static int bookCopyCount;
	
	static{
		bookCopyCount = 0;
	}
	
	public String getId(){
		return this.bookId;
	}
	
	public void setbookId(String id)
	{
		this.bookId = id;
	}
	
	public String getbookType(){
		return this.bookType;
	}
	
	public void setbookType(String type)
	{
		this.bookType = type;
	}
	
	public String getbookName(){
		return bookName;
	}
	
	public void setbookName(String name)
	{
		this.bookName = name;
	}
	
	public String getbookAuthor(){
		return bookAuthor;
	}
	
	public void setbookAuthor(String author)
	{
		this.bookAuthor = author;
	}
	
	public int getbookCopy(){
		return this.bookCopy;
	}
	public void setbookCopy(int bookCopy)
	{
		this.bookCopy = bookCopy;
	}
	
	public book2(){
		bookCopyCount++;	
	}
	
	public book2(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;
		bookCopyCount++;
	}
	
	public static void showTotalBookInfo()
	{
		System.out.println("Book Count :" + book2.bookCopyCount);
	}
		
	
	

public void showBookInfo()
{
	System.out.println("Book Name " + this.getbookName());
	System.out.println("Book Author: " + this.getbookAuthor());
	System.out.println("Book id " + this.getId());
	System.out.println("Book type: " + this.getbookType());
	System.out.println("Book count: " + this.getbookCopy());
}

public void addBookCopy(int x) {
	int n = this.getbookCopy();
	n = n + x;
	this.setbookCopy(n);
	System.out.println("new Book count: " + this.getbookCopy());	
}
}