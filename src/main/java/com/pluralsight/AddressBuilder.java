package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder address = new StringBuilder();
        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        address.append(scanner.nextLine());
        address.append("\n\n");

        System.out.println();
        address.append("Billing Address:");
        address.append("\n");

        System.out.print("Billing Street: ");
        address.append(scanner.nextLine());
        address.append("\n");

        System.out.print("Billing City: ");
        address.append(scanner.nextLine());
        address.append(", ");
        System.out.print("Billing State: ");
        address.append(scanner.nextLine());
        address.append(" ");
        System.out.print("Billing Zip: ");
        address.append(scanner.nextLine());

        System.out.println(address);
    }
}
