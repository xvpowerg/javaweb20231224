package tw.com.beans;
import java.util.List;
public class Item {
	private String id;
	private String name;
	private int price;
	private int count;
	
	public Item( String id,String name,int price) {
		this.name = name;
		this.price = price;	
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
	public int getPrice() {
		return price;
	}
	
	public int total() {
		return this.getCount() * this.getPrice();
	}
	
	public String toString() {
		return this.getName()+":"+this.getPrice()+":"+this.getCount();
	}
	
	
	public static int sum(List<Item> itemList) {
		int result = 0;
		result = itemList.stream().
				mapToInt(it->it.count*it.price).sum();
		return result;
	}
}
