package org.exercise7;

import java.math.BigDecimal;

public record SalesLine(Product product, int quantity) {

    public BigDecimal getLineTotal(){
        return (product.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }

}
