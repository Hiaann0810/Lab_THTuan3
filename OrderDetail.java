/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th3.bai1;

/**
 *
 * @author vietthanh
 */
public class OrderDetail {
    private int quatity;
    private Product product;

    public OrderDetail(Product product, int quatity) {
        this.product = product;
        this.quatity = quatity;
    }

    public double calcTotalPrice() {
        return this.quatity * this.product.getPrice();
    }

    public Product getProduct() {
        return this.product;
    }

    public void setQuantity(int quatity) {
        this.quatity = quatity;
    }

    public int getQuatity() {
        return this.quatity;
    }
}
