package Package1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 
	@Column(length = 20)
	private String name;
	@Column
	private int price;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
  
 
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	
}
