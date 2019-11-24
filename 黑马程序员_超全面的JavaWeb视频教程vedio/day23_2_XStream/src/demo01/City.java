package demo01;

public class City {
	private String name; // ÊÐÃû
	private String description; // ÃèÊö

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", description=" + description + "]";
	}

}
