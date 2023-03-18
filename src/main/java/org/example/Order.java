package org.example;


public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    public Order(boolean filled, double cost, String shippingMethod, String coupon) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        couponCode = coupon;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

//    public double calculateShipping() {
//        if (shipping.equals("Regular")) {
//            return 0;
//        } else if (shipping.equals("Express")) {
//            // Add your code here
//            if (couponCode == "ship50"){
//                return 0.85;
//            }return 1.75;
//
//        } else {
//            return .50;
//        }
//    }

    public double calculateShipping() {
        double shippingCost;
        // declare switch statement here
        switch (shipping){
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = 0.50;
        }
        return shippingCost;
    }

    public static void main(String[] args) {
        // do not alter the main method!
        Order book = new Order(true, 9.99, "Express", "ship50");
        Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");

        book.ship();
        chemistrySet.ship();
    }
}