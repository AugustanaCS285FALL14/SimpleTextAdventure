package aceconsulting.adventure;

public abstract class Choice {
	
	private String description;

	public Choice(String description)
	{
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

}