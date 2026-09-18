package org.exercise7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Product product = new Product("Jabon en barra", new BigDecimal("1000"));
        Product product1 = new Product("Hilo dental", new BigDecimal("950.50"));
        Product product2 = new Product("Botella de agua", new BigDecimal("1000"));

        SalesLine salesLine = new SalesLine(product, 4);
        SalesLine salesLine1 = new SalesLine(product1, 3);
        SalesLine salesLine2 = new SalesLine(product2, 10);

        List<SalesLine> salesLineList = new ArrayList<>(List.of(salesLine, salesLine1, salesLine2));

        SalesAnalytic analytic = new SalesAnalytic();

        var total = analytic.getTotal(salesLineList);
        var bestSellers = analytic.getBestSellers(salesLineList);

        System.out.println("total = " + total);

        for (var sellers : bestSellers){
            System.out.println("Best seller: " +  sellers.getName());
        }
    }
}
