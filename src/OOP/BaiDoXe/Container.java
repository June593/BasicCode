package OOP.BaiDoXe;

import java.util.Scanner;

public class Container extends Vehicle {
    public Container() {
        super(3, 5);
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap manufacturer: ");
        manufacturer = scan.nextLine();

        System.out.println("Nhap no: ");
        no = scan.nextLine();

        System.out.println("Nhap year: ");
        year = scan.nextLine();


        System.out.println("Nhap owner: ");
        owner = scan.nextLine();

        System.out.println("Nhap width: ");
        width = Integer.parseInt(scan.nextLine());

        System.out.println("Nhap height: ");
        height = Integer.parseInt(scan.nextLine());

    }
}
