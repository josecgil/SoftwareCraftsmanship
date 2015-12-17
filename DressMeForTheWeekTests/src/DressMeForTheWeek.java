import java.util.ArrayList;

public class DressMeForTheWeek {

	private ProductRepository productRepository;
	public DressMeForTheWeek(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}

	public ArrayList<String> findProducts(int numberOfProducts) {
		ArrayList<Product> allProducts=productRepository.findAll();
		int maxProducts=numberOfProducts;
		if (maxProducts>allProducts.size()) {
			maxProducts=allProducts.size();
		}
		ArrayList<String> productIds=new ArrayList<String>();
		for(int i=0; i<maxProducts; i++) {
			Product product = allProducts.get(i);
			productIds.add(product.getId());
		}
		return productIds;
	}	
	
}
