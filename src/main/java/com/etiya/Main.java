package com.etiya;

public class Main {
    public static void main(String[] args) {
        String message = "Vade Oranı";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setImageUrl("test.jpg");
        product1.setUnitsInStock(50);

        Product product2 = new Product();
        product2.setName("Kitchen Aid Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setImageUrl("test.jpg");
        product2.setUnitsInStock(50);


        Product product3 = new Product();
        product1.setName("Smg Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setImageUrl("test.jpg");
        product1.setUnitsInStock(50);

        Product[] products = {product1,product2,product3};

//        for(Product product : products){
//            System.out.println(product.name);
//        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setFistName("Alpcan");
        individualCustomer.setLastName("Yüksel");
        individualCustomer.setPhoneNumber("052255655");
        individualCustomer.setCustomerNumber("1234325");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(1);
        corporateCustomer.setCompanyName("Kumsal Market");
        corporateCustomer.setTaxNumber("123456789");
        corporateCustomer.setCustomerNumber("456123");


        Customer[] customers = {individualCustomer,corporateCustomer};




    }
}