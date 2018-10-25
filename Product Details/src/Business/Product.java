/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author owner
 */
public class Product {

    private String name;
    private int price;
    private int availNum;
    private Supplier supplier;

    public Product() {
        Supplier supplier = new Supplier();
    }

//    public Product(Supplier supplier) {
//        this.supplier = supplier;
//    }
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void Create(Product p) {

        // Product p = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:-");
        String name = scanner.nextLine();
        p.setName(name);
        System.out.println("Enter product price:-");
        int price = scanner.nextInt();
        p.setPrice(price);
        scanner.nextLine();
        System.out.println("Enter Product Availability Number:-");
        int availNum = scanner.nextInt();
        p.setAvailNum(availNum);
        scanner.nextLine();
        System.out.println("Enter Product description:-");
        String description = scanner.nextLine();
        p.setDescription(description);
        Supplier supp = new Supplier();
        System.out.println("Enter supplier name:-");
        String supplierName = scanner.nextLine();
        //scanner.nextLine();
        supp.setSupplierName(supplierName);

        System.out.println("Enter supplier address:-");
        String supplierAddress = scanner.nextLine();
        supp.setSupplierAddress(supplierAddress);
        p.setSupplier(supp);

    }

    public void Display(Product p) {

        System.out.println("Product Name:-" + p.getName());
        System.out.println("Product Price:-" + p.getPrice());
        System.out.println("Product Availability Number:-" + p.getAvailNum());
        System.out.println("Product description:-" + p.getDescription());
        System.out.println("Supplier Name:-" + p.getSupplier().getSupplierName());
        System.out.println("Supplier Address:-" + p.getSupplier().getSupplierAddress());

    }

    public void Update(Product p) {

        System.out.println("What data do you want to update?");
        System.out.println("1.Product Name\n 2.Product Price\n 3.Product Availability Number\n 4.Product Description\n 5.Supplier Name\n 6.Supplier Address \n Please select a number from above options");
        // System.out.println("What data do you want to update?");
        String a;
        Scanner input = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        //BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        //int num;
        //int value = Integer.parseInt(s.readLine());
        int value = s.nextInt();
        switch (value) {
            case 1:
                System.out.println("Enter product name:-");
                //p.name = s.readLine();
                String name = s.next();
                p.setName(name);
                s.nextLine();
                //Code to call update function.
                //System.out.println("Do you want to make any further changes (yes/no) ?");
                Display(p);
                //Scanner input = new Scanner(System.in);
                System.out.println("Do you want to make any further changes (yes/no) ?");
                a = input.next();
                if (a.equals("yes")) {
                    Update(p);
                } else if (a.equals("no")) {
                    System.out.println(" No changes made");
                    Display(p);
                } else {
                    System.out.println("Enter a valid input " + a);
                }
                break;
            case 2:
                System.out.println("Enter product price:-");
                //p.price = Integer.parseInt(s.readLine());
                int price = s.nextInt();
                p.setPrice(price);
                s.nextLine();
                //System.out.println("Do you want to make any further changes ?");
                Display(p);
                //Scanner input = new Scanner(System.in);
                System.out.println("Do you want to make any further changes ?");
                a = input.next();
                if (a.equals("yes")) {
                    Update(p);
                } else if (a.equals("no")) {
                    System.out.println(" No changes made");
                    Display(p);
                } else {
                    System.out.println("Enter a valid input " + a);

                }
                //Display(p);
                break;
            case 3:
                System.out.println("Enter product Availability number:-");
                int availNum = s.nextInt();
                p.setAvailNum(availNum);
                s.nextLine();
                // p.availNum = Integer.parseInt(s.readLine());
                Display(p);
                System.out.println("Do you want to make any further changes ?");
                a = input.next();
                if (a.equals("yes")) {
                    Update(p);
                } else if (a.equals("no")) {
                    System.out.println(" No changes made");
                    Display(p);
                } else {
                    System.out.println("Enter a valid input " + a);

                }
                break;
            case 4:
                System.out.println("Enter product description:-");
                //p.description = s.readLine();
                String description = s.next();
                p.setDescription(description);
                s.nextLine();
                Display(p);
                System.out.println("Do you want to make any further changes ?");
                a = input.next();
                if (a.equals("yes")) {
                    Update(p);
                } else if (a.equals("no")) {
                    System.out.println(" No changes made");
                    Display(p);
                } else {
                    System.out.println("Enter a valid input " + a);

                }
                break;
            case 5:
                System.out.println("Enter supplier name:-");
                String supplierName = s.next();
                p.getSupplier().setSupplierName(supplierName);
                s.nextLine();
                Display(p);
                System.out.println("Do you want to make any further changes ?");
                a = input.next();
                if (a.equals("yes")) {
                    Update(p);
                } else if (a.equals("no")) {
                    System.out.println(" No changes made");
                    Display(p);
                } else {
                    System.out.println("Enter a valid input " + a);

                }
                break;
            case 6:
                System.out.println("Enter supplier address:-");
                String supplierAddress = s.next();
                p.getSupplier().setSupplierAddress(supplierAddress);
                s.nextLine();
                Display(p);
                System.out.println("Do you want to make any further changes ?");
                a = input.next();
                if (a.equals("yes")) {
                    Update(p);
                } else if (a.equals("no")) {
                    System.out.println(" No changes made");
                    Display(p);
                } else {
                    System.out.println("Enter a valid input " + a);

                }

                break;
        }

    }
}
