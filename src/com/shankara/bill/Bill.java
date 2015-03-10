package com.shankara.bill;
//https://gist.github.com/anagri/cfe78516a69358325230

import java.util.ArrayList;

public class Bill {


    private final ArrayList<BillItem> billItems;

    public Bill() {
        billItems = new ArrayList<>();
    }

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.add(new BillItem("Quaker", 1, 10));
        bill.add(new BillItem("Kellogs", 2, 5));
        bill.add(new BillItem("Milk", 4, 5));
        bill.add(new BillItem("Cashew", 5, 10));

        bill.printBill();
    }

    private void printBill() {
        int grandTotal = 0;
        for (BillItem billItem : billItems) {
            grandTotal += billItem.total();
            billItem.printBillItem();
        }
        System.out.println(String.format("Grand Total\t\t\t\t\t%d", grandTotal));
    }

    private void add(BillItem billItem) {
        billItems.add(billItem);
    }

    private static class BillItem {
        private final String name;
        private final int price;
        private final int quantity;

        public BillItem(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public void printBillItem() {
            System.out.println(String.format("%s\t\t%d\t\t%d\t\t%d", name, price, quantity, total()));
        }

        public int total() {
            return price * quantity;
        }
    }
}
