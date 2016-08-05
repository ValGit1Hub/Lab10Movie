

public class Movies {
	private String title;
	private String category;
	
	
	//constructor
	public Movies (String title,String cat){
		setTitle(title);
		setCategory(cat);
		
	}
	
	//getter and setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	

}
