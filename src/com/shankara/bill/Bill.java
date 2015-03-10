package com.shankara.bill;
//https://gist.github.com/anagri/cfe78516a69358325230
//https://gist.github.com/anagri/64888976de0b3bf8e29f

import java.util.ArrayList;

public class Bill {
    public static void main(String[] args) {
        Store store = new Store();
        store.add("Quaker", 1);
        store.add("Kellogs", 2);
        store.add("Milk", 4);
        store.add("Cashew", 5);
        Bill bill = new Bill(store);
        bill.add("Quaker", 10);
        bill.add("Kellogs", 5);
        bill.add("Milk", 5);
        bill.add("Cashew", 10);

        bill.printBill();
    }

    private final ArrayList<BillItem> billItems;

    public Bill(Store store) {
        billItems = new ArrayList<>();
    }

    private void printBill() {
        int grandTotal = 0;
        for (BillItem billItem : billItems) {
            grandTotal += billItem.total();
            billItem.printBillItem();
        }
        System.out.println(String.format("Grand Total\t\t\t\t\t%d", grandTotal));
    }

    private void add(String name, int quantity) {
        billItems.add(); //TODO
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

    private static class Store {
        public void add(String quaker, int price) {
            // TODO
        }
    }
}
