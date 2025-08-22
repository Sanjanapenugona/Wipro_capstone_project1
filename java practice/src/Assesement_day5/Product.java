package Assesement_day5;

public class Product {
	  private final String name;
	    private final double price;

	    private Product(Builder builder) {
	        this.name = builder.name;
	        this.price = builder.price;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public static class Builder {
	        private String name;
	        private double price;

	        public Builder withName(String name) {
	            this.name = name;
	            return this;
	        }

	        public Builder withPrice(double price) {
	            if (price < 0) {
	                throw new IllegalArgumentException("Price cannot be negative");
	            }
	            this.price = price;
	            return this;
	        }

	        public Product build() {
	            return new Product(this);
	        }
	    }

	public static void main(String[] args) {
		   Product product = new Product.Builder()
	                .withName("Apple")
	                .withPrice(1.99)
	                .build();

	        System.out.println("Product: " + product.getName());
	        System.out.println("Price: " + product.getPrice());

	}

}
