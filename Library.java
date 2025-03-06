public class Library
{
	private String libName;
	private String libAddress;
	private BookInfo []listOfBook;
	private int totalBook; 
	
	public Library(){}
	public Library(String name, String address, int totalBook, int size)
	{
		libName = name;
		libAddress = address;
		this.totalBook = totalBook;
		listOfBook = new BookInfo[size];
	}
	public void setName(String name)
	{
		libName = name;
	}
	public void setAddress(String address)
	{
		libAddress = address;
	}
	public void setTotalBook(int totalBook)
	{
		this.totalBook = totalBook;
	}
	public void setBookListSize(int size)
	{
		listOfBook = new BookInfo[size];
	}
	public String getName()
	{
		return libName;
	}
	public String getAddress()
	{
		return libAddress;
	}
	public int getTotalBook()
	{
		return totalBook;
	}
	public BookInfo[] getBookListSize()
	{
		return listOfBook;
	}
	
	public void ShowLibInfo()
	{
		System.out.println("Library Name: " + libName);
		System.out.println("Library Addresss: " + libAddress);
		System.out.println("Total Book: " + totalBook);
		for(int i= 0; i<listOfBook.length; i++)
		{
			listOfBook[i].showBookInfo();
		}
	}
	public void AddNewBook(BookInfo book)
	{
		boolean flag = false;
		for(int i = 0; i<listOfBook.length; i++)
		{
			if(listOfBook[i] == null)
			{
				flag = true;
				listOfBook[i] = book;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Book added!");
		}
		else
		{
			System.out.println("Book can't be added! Delete any book and try again");
		}
	}
	public void DeleteBook(BookInfo book)
	{
		boolean flag = false;
		for(int i = 0; i<listOfBook.length; i++)
		{
			if(listOfBook[i] == book)
			{
				listOfBook[i] = null;
			    flag = true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Book deleted!");
		}
		else
		{
			System.out.println("Book not found!");
		}
	}
	public void AddNewBookCopy(BookInfo book, int copy)
	{
		book.addBookCopy(copy);
	}
	public static void main(String []args)
	{
		BookInfo b1, b2, b3, b4, b5;
		b1 = new BookInfo("bangla", "NCTB", "123", "hsc", 2);
		b2 = new BookInfo("englis", "NCTB", "456", "hsc", 4);
		b3 = new BookInfo("physics", "NCTB", "789", "hsc", 7);
		b4 = new BookInfo("chemistry", "NCTB", "012", "hsc", 1);
		b5 = new BookInfo("biology", "NCTB", "392", "SSC", 9);
		
		Library lib1 = new Library("DU", "dhaka uni", 34, 4);
		
		lib1.listOfBook[0] = b1;
		lib1.listOfBook[1] = b2;
		lib1.listOfBook[2] = b3;
		lib1.listOfBook[3] = b4;

	
		lib1.DeleteBook(b2);
		lib1.AddNewBook(b5);
		lib1.ShowLibInfo();
		lib1.AddNewBookCopy(b4, 4);
		lib1.ShowLibInfo();
	}
}