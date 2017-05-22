package delta.co.nz.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@ApiModel
public class Feedback {

    @JsonProperty(value = "description", required = true)
    @NotNull
    @ApiModelProperty(required = true)
    private String description;

    @JsonProperty(value = "customer", required = true)
    @NotNull
    @ApiModelProperty(required = true)
    private Customer customer;

    @JsonProperty(value = "product", required = true)
    @NotNull
    @ApiModelProperty(required = true)
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
