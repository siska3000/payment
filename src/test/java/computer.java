

public class computer {

    private String type;
    private Double price;
    private String brand;


    public computer(String brand, String type, Double price) {
        this.type = type;
        this.price = price;
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }    
    
    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        computer other = (computer) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "computer [type=" + type + ", price=" + price + ", brand=" + brand + "]";
    }
    

}
