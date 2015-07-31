public class Ticket
{
  private String section;
  private String display;
  private String gender;
  private int number;


  public Ticket(String ticket)
  {
    section = ticket.substring(0,1);
	 display = ticket.substring(1,2);
	 gender = ticket.substring(2,3);
	 number = Integer.parseInt(ticket.substring(3,4));

  }
	 
 public boolean isValid()
 {
    boolean valid = true; 
	 
	 if (("ABCD".indexOf(display.charAt(0))< 0) ||(!(section.equals("A")) && (!(section.equals("R")))||("MmFf".indexOf(gender.charAt(0))< 0 )))
             valid = false;
   return valid;
 }
 
 public int getPointvalue()
 {
   if (gender.equals("M") || gender.equals("F") )
      return 12;
	else
	   return 5;	
 }
 
 public String getSection()
 {
   return section;
 }
	
public String getDisplay()
 {
   return display;
 }
	
public String getGender()
 {
   return gender;
 }
	
public int getNumber()
 {
   return number;
 }


	
 }
