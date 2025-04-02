public class Company {

	private String name;
	private String streetAddress;
	private String city;
	private String state;

	// Set missing values to null
	public Company(String name)
	{
		this.name = name;
		this.streetAddress = null;
		this.city = null;
		this.state = null;
	}


	public Company(String name, String streetAddress, String city, String state)
	{
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
	}

	public String getName()
	{
		return name;
	}

	/** Should return a String of the form
 	* [streetAddress]
  	* [city], [state]
   	* 
	* Example output:
	* 123 Main St
	* Springfield, OH
	*/
	public String address()
	{
		return streetAddress + city + ", " state;
	}

	/** Should return a String of the form
 	* [name]
  	* [streetAddress]
   	* [city], [state]
    	*
	* Example output:
	* Widget Company
	* 123 Main St
	* Springfield, OH
	*/
	public String toString()
	{
		return name + streetAddress + city + ", " + state;
	}
}
