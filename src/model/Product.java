package model;

public class Product {
    private int ProductId;
    private String ProductName;
    private double ProductPrice;
    private int ProductQty;
    private String ProductCategory;

    public Product(int productId, String productName, double productPrice, int productQty, String productCategory) {
        this.ProductId = productId;
        this.ProductName = productName;
        this.ProductPrice = productPrice;
        this.ProductQty = productQty;
        this.ProductCategory = productCategory;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public int getProductQty() {
        return ProductQty;
    }

    public void setProductQty(int productQty) {
        ProductQty = productQty;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", ProductName='" + ProductName + '\'' +
                ", ProductPrice=" + ProductPrice +
                ", ProductQty=" + ProductQty +
                ", ProductCategory='" + ProductCategory + '\'' +
                '}';
    }
}
