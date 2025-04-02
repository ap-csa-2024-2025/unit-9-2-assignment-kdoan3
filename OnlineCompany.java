public class OnlineCompany extends Company
{
	private String webAddress;

	// An online company's address is its webaddress
	public OnlineCompany(String name, String webAddress)
	{
		super(name, webAddress);
	}

	// Return the website address, since the address is
	// reinterpreted as the web address here.
	public String address()
	{
		return this.webAddress;
	}

	/** Return a String of the form
 	* [name]
	* [webaddress]
  *
	* Remember To get name from superclass, use super.getName()
	* 
	* Example Output:
	* CodeHS
	* www.codehs.com
	*/

	public String toString()
	{
		return super.getName() + this.wedAddress;
	}
}
