 public class studentDemo 
{
	private int id;
    private String name;
    private double cgpa;
	 
	 public void setId(int id)
	 {
		 this.id=id;
		 
	 }
	 public int getId()
	 {
		 return id;
	 }
	  public void setName(String name)
	  {
		  this.name=name;
		  
	  }
	  public String getName()
	  {
		  return name;
		  
	  }
	   public void setCgpa(double cgpa)
	   {
		   this.cgpa=cgpa;
		   
	   }
	   public double getCgpa()
	   {
		   return cgpa;
		   
	   }
	   public static void main(String [] args)
	   {
		   studentDemo  obj= new studentDemo ();
		   obj.setId(22480392);
		   obj.setName("S.M.Rasel");
		   obj.setCgpa(3.89);
		
		   System.out.println("ID   : "+obj.getId());
		   System.out.println("Name : "+obj.getName());
		   System.out.println("CGPA : "+obj.getCgpa());
		   
}

}