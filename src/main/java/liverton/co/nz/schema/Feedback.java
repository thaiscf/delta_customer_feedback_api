package liverton.co.nz.schema;

import io.swagger.annotations.ApiModel;

@ApiModel
public class Feedback {

    private String description;
    private Customer customer;
    private Product product;
    private String sentTo;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description= description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSentTo() { return sentTo; }

    public void setSentTo(String sentTo) { this.sentTo = sentTo; }
}
