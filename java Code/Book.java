public class Book 
{
	private String isbn;
    private String bookTitle;
    private String authorName; 
    private double price;
    private int availableQuantity;
	public Book()
	{
		System.out.println("Empty Book");
	}
		public Book (String isbn,String bookTitle,String authorName,double price,int availableQuantity)
		{    
		   System.out.println("Para Book");
			this.isbn=isbn;
			this.bookTitle=bookTitle;
			this.authorName=authorName;
			this.price=price;
			this.availableQuantity=availableQuantity;
			
		}
     public void setIsbn(String isbn)
	 {
		 this.isbn=isbn;
	 }
	 
     public void setBookTitle(String bookTitle)
	 {
		 this.bookTitle=bookTitle;
	 }
     public void setAuthorName(String authorName)
	 {
		 this.authorName=authorName;
		 
	 }
     public void setPrice(double price)
	 {
		 this.price=price;
	 }
	 
     public void setAvaiableQuantity(int availableQuantity)
	 {
		 this.availableQuantity=availableQuantity;
	 }	 
     public String getIsbn()
	 {
		 return isbn;
		
	 }
	 public String getBookTitle()
	 {
		 return bookTitle;
	 }
     public String getAuthorName()
	 {
		 return authorName;
	 }
     public double getPrice()
	 {
		 return price;
		
	 }
      public int getAvailableQuantity()
	  {
		  return availableQuantity;
	  }
	 
	 public void addQuantity(int amount)
	 {
	  ///availableQuantit  = (availableQuantit+amount);	 
	 }		
	 public void sellQuantity(int amount)
	 {
	/// availableQuantit=(amount-sellQuantity);
	 }
	 
	
	 
	 public void showDetails()
	 {
		System.out.println();
		System.out.println();
		
		
		System.out.println("ISBN                    : "+isbn);
		System.out.println("Book Title              : "+bookTitle);
		System.out.println("Author Name             : "+authorName);
	 	System.out.println("Price                   : "+price);
		System.out.println("Available Quantatity    : "+availableQuantity);
			
	 }
	 public static void main(String args[]) 
	{
		Book b1 = new Book();
		b1.setIsbn("5asdf");
		b1.setBookTitle("AgniBina");
		b1.setAuthorName("KaziNazrulIslam");
		b1.setPrice(220);
		b1.setAvaiableQuantity(5000);
		
		System.out.println();
		System.out.println();
		System.out.println("ISBN                   : "+b1.getIsbn());
		System.out.println("Book Title             : "+b1.getBookTitle());
		System.out.println("Author Name            : "+b1.getAuthorName());
		System.out.println("Price                  : "+b1.getPrice());
		System.out.println("Available Quantatity   : "+b1.getAvailableQuantity());
		
		Book b2 = new Book("5asdf", "AgniBina","KaziNazrulIslam",220,5000);
		b2.showDetails();
	 }
}