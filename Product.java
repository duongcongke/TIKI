public class Product {
    private String Name;
    private int ID;
    private double price;
    public Product ( int ID, String Name, double price){
        this.Name= Name;
        this.ID= ID;
        this.price= price;
    }
    public String getName() {
        return Name;
    }
    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
