package com.shankara.bill;
//https://gist.github.com/anagri/cfe78516a69358325230

public class Bill {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4};
        int[] quantities = {10, 5, 10, 5};
        String[] names = new String[]{"Quaker", "Kellogs", "Chocos", "Milk"};
        System.out.println("Name\t\tPrice\tQty\t\tTotal");
        int grandTotal = 0;
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int total = prices[i] * quantities[i];
            System.out.println(String.format("%s\t\t%d\t\t%d\t\t%d", name, prices[i], quantities[i], total));
            grandTotal += total;
        }
        System.out.println(String.format("Grand Total\t\t\t\t\t%d", grandTotal));
    }
}
