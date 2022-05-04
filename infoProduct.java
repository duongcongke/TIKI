public class infoProduct extends Product {
    private double height;

    public infoProduct(int ID, String Name, double price, double height) {
        super(ID, Name, price);
        this.height = height;}
    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "infoProduct{" +
                "height=" + height +
                super.toString()+
                '}';
    }
}


