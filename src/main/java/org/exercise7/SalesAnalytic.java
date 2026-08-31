package org.exercise7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalesAnalytic {
    public List<Product> getBestSellers(List<SalesLine> salesLine) {
        int amount = -1;
        List<Product> bestSellersList = new ArrayList<>();
        for (SalesLine sales : salesLine) {
            int currentSales = sales.quantity();
            if (currentSales > amount) {
                amount = currentSales;
                bestSellersList.clear();
                bestSellersList.add(sales.product());
            } else if (currentSales == amount) {
                bestSellersList.add(sales.product());
            }
        }
        return bestSellersList;
    }

    public BigDecimal getTotal(List<SalesLine> salesLine) {
        BigDecimal total = BigDecimal.ZERO;
        for (SalesLine sales : salesLine) {
            total = total.add(sales.getLineTotal());
        }
        return total;
    }

}
