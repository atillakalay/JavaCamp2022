public class Main {

	public static void main(String[] args) {
		String message = "Vade oranı";

		Product product1 = new Product();
		product1.setName("A Kahve Makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("imageUrl");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);

		Product product2 = new Product();
		product2.setName("B Kahve Makinesi");
		product2.setDiscount(7);
		product2.setImageUrl("imageUrl");
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);

		Product product3 = new Product();
		product3.setName("C Kahve Makinesi");
		product3.setDiscount(7);
		product3.setImageUrl("imageUrl");
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05000000000");
		individualCustomer.setCustomerNumber("1");
		individualCustomer.setFirstName("Atilla");
		individualCustomer.setLastName("Kalay");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("05000000000");
		corporateCustomer.setCustomerNumber("2");

		Customer[] customers = { individualCustomer, corporateCustomer };
	}

}
