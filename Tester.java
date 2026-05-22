// _____ Sale Class (SuperClass)
class Sale {
    private String name;
    private double price;

    public Sale() {
        name = "No Name Yet";
        price = 0.0;
    }

    // ____ Parameterized
    public Sale(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // ____ Copy
    public Sale(Sale s) {
        this.name = s.name;
        this.price = s.price;
    }

    // _____ Getters
    public String getName() {         return name;          }
    public double getPrice(){        return price;         }

    // _____ Setters
    public void setName(String name) {          this.name = name;      }
    public void setPrice(double price) {        this.price = price;    }

    // ___ BilL
    public double bill() {        return price;      }

    public boolean equalDeals(Sale otherSale) {
        return (this.bill() == otherSale.bill());
    }

    public boolean lessThan(Sale otherSale) {
        return (this.bill() < otherSale.bill());
    }

    public static void announcement() {
        System.out.println("This is the Sale class.");
    }

    public String toString() {
        return ("Item: " + name + "\nPrice: " + price);
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (!(obj instanceof Sale))
            return false;

        Sale otherSale = (Sale) obj;

        return name.equals(otherSale.name) && price == otherSale.price;
    }
}

// _____ DiscountSale Class (SubClass)
class DiscountSale extends Sale {
    private double discount;

    public DiscountSale() {
        super();
        discount = 0.0;
    }

    public DiscountSale(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    public DiscountSale(DiscountSale otherSale) {
        super(otherSale);
        this.discount = otherSale.discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double bill() {
        double discountedAmount = getPrice() * discount / 100;
        return getPrice() - discountedAmount;
    }

    public static void announcement() {
        System.out.println("This is the DiscountSale class.");
    }

    public String toString() {
        return super.toString() + "\nDiscount: " + discount + "%\nBill: " + bill();
    }
}

public class Tester {
    public static void main(String[] args) {
        Sale simpleSale = new Sale("Book", 1000);
        DiscountSale discountSale = new DiscountSale("Shirt", 1000, 10);

        System.out.println("Simple Sale:");
        System.out.println(simpleSale);

        System.out.println();

        System.out.println("Discount Sale:");
        System.out.println(discountSale);

        System.out.println();

        System.out.println("Bill of simple sale: " + simpleSale.bill());
        System.out.println("Bill of discount sale: " + discountSale.bill());

        System.out.println();

        if (simpleSale.equalDeals(discountSale)) {
            System.out.println("Both deals are equal.");
        } else {
            System.out.println("Both deals are not equal.");
        }

        if (discountSale.lessThan(simpleSale)) {
            System.out.println("Discount sale is cheaper.");
        } else {
            System.out.println("Simple sale is cheaper or equal.");
        }

        System.out.println();

        // --> Late binding example
        Sale saleReference = new DiscountSale("Laptop Bag", 2000, 25);

        System.out.println("Late Binding Example:");
        System.out.println(saleReference.bill());
    }
}