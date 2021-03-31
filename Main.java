
public class Main {

	public static void main(String[] args) {
		
		Bag adidas = new Bag();
		adidas.brand = "adidas";
		adidas.colour = "white";
		System.out.println("brand : " + adidas.brand);
		System.out.println("colour : " + adidas.colour);
		adidas.waterresistance();
		
		System.out.println();
		
		Bag nike = new Bag();
		nike.brand = "nike";
		nike.colour = "black";
		System.out.println("brand : " + nike.brand);
		System.out.println("colour : " + nike.colour);
		nike.waterresistance();
		
		System.out.println();
		

	}

}
