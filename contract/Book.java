package contract;

public class Book {
	
	private int price;
    private boolean favorite;
    private final String title;
    
    public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public String getTitle() {
		return title;
	}
	public Book (String title, int price, boolean favorite) {
		this.title = title;
		this.price = price;
		this.favorite = favorite;
	}
}
