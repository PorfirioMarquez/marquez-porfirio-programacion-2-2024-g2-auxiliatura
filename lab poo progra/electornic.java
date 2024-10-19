public class electornic implements product {
    private String name;
    private Double price;

    public electornic(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public Double getPrice() {
        return price;
    }
}