public class AddressBook
{
	private String ownerName;
	private String info;
	private ContactInfo[] listOfContact;
	
	public void setName(String name)
	{
		ownerName = name;
	}
	public void setInfo(String info)
	{
		this.info = info;
	}
	public void setContactListSize(int size)
	{
		listOfContact = new ContactInfo[size];
	}
	public String getName()
	{
		return ownerName;
	}
	public String getInfo()
	{
		return info;
	}
	public ContactInfo[] getContactListSize()
	{
		return listOfContact;
	}
	
	public AddressBook(){}
	public AddressBook(String name, String info, int size)
	{
		ownerName = name;
		this.info = info;
		listOfContact = new ContactInfo[size];
	}
	
	public void ShowAllContactInfo()
	{
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Info: " + info);
		for(int i= 0; i<listOfContact.length; i++)
		{
			listOfContact[i].showPersonInfo();
		}
	}
	
	public void AddContact(ContactInfo contact)
	{
		boolean flag = false;
		for(int i = 0; i<listOfContact.length; i++)
		{
			if(listOfContact[i] == null)
			{
				flag = true;
				listOfContact[i] = contact;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Contact added!");
		}
		else
		{
			System.out.println("Contact can't be added! Delete any Contact and try again");
		}
	}
	public void DeleteContact(ContactInfo contact)
	{
		boolean flag = false;
		for(int i = 0; i<listOfContact.length; i++)
		{
			if(listOfContact[i] == contact)
			{
				listOfContact[i] = null;
			    flag = true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Contact deleted!");
		}
		else
		{
			System.out.println("Contact not found!");
		}
	}
    public void DeleteContactByName(String name)
	{
		boolean flag = false;
		for(int i = 0; i<listOfContact.length; i++)
		{
			if((listOfContact[i].getPersonName()) == name)
			{
				listOfContact[i] = null;
			    flag = true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Contact deleted!");
		}
		else
		{
			System.out.println("Contact not found!");
		}
	}
	public static void main(String []arg)
	{
		ContactInfo c1, c2, c3;
		AddressBook book1 = new AddressBook("Rasel", "AIUB", 2);
		
		c1 = new ContactInfo("Asif", "202020", 23, "02030330303", 'M');
		c2 = new ContactInfo("Anik", "454020", 20, "98760330303", 'M');
		c3 = new ContactInfo("Java", "675420", 21, "43560330303", 'F');
		
		book1.listOfContact[0] = c1;
		book1.listOfContact[1] = c2;
		
		book1.DeleteContact(c2);
		book1.AddContact(c3);
		book1.ShowAllContactInfo();
		book1.DeleteContactByName("Asif");
		book1.AddContact(c2);
		book1.ShowAllContactInfo();
	}
}