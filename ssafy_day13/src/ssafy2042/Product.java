package ssafy2042;

public class Product {

    private String pCode;     // 제품 코드
    private String pName;     // 제품 이름
    private int price;        // 가격
    private int quantity;     // 수량
    private String brand;     // 브랜드
    private String desc;      // 설명

    public Product() {}

    public Product(String pCode, String pName, int price, int quantity, String brand, String desc) {
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.desc = desc;
    }

    public String getPCode() {
        return pCode;
    }

    public void setPCode(String pCode) {
        this.pCode = pCode;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price must be non-negative.");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be non-negative.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pCode='" + pCode + '\'' +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
