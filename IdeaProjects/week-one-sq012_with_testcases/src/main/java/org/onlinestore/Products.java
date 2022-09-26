package org.onlinestore;

public class Products {
   private Integer productId;
    private String productName;
    private Double productPrice;
    private String manufacturingDate;
    private String expirationDate;

    public Products(Integer productId, String productName, Double productPrice, String manufacturingDate, String expirationDate) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.manufacturingDate = manufacturingDate;
        this.expirationDate = expirationDate;
    }

    //Setters for Main.Products


    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    //Getters


    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
