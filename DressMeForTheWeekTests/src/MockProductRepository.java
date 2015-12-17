import java.util.ArrayList;

public class MockProductRepository implements ProductRepository {

	private String id;
	public void addProduct(String id) {
		this.id=id;
	}

	@Override
	public ArrayList<Product> findAll() {
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(id));
		return products;
	}

}
