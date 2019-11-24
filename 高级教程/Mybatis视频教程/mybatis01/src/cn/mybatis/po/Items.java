package cn.mybatis.po;

public class Items {

//	,i.`name` items_name,i.`detail` items_detail
//	,i.`price` items_price
	private Integer id;
	private String name;
	private String detail;
	private Double price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", detail=" + detail + ", price=" + price + "]";
	}

}
