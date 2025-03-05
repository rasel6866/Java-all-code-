 public class Book1
 {
	 private String bookName;
	 private String bookAuther;
	 private String bookId;
	 private String bookType;
	 private int bookCopy;
	 ///private int x;
	 public Book1()
	 {
		System.out.println("Empty");
	 }
	 public Book1(String bookName,String bookAuther, String bookId,String bookType,int bookCopy)
	 {
		 this.bookName=bookName;
		 this.bookAuther=bookAuther;
		 this.bookId=bookId;
		 this.bookType=bookType;
		 this.bookCopy=bookCopy;
		 

		 }
  public void showInfo()
  {
        System.out.println("Book Name                 : "+bookName);
		System.out.println("Book Auther               : "+bookAuther);
	 	System.out.println("Book Type                 : "+bookType);
		System.out.println("Book Id                   : "+bookId);
		System.out.println("Book Copy                 : "+bookCopy);
			
	}
  public void setAddBookCopy(int x)
  {
	  addBookCopy=x;
  }
 public void getAddBookCopy()
 {
	 return addBookCopy;
 } 
 }