package OOP.BaiDoXe;

import java.util.ArrayList;
import java.util.Scanner;

public class Area {
    String address;
    int width;
    int height;
    ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Area() {
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap address: ");
        address = scan.nextLine();
        System.out.println("Nhap width: ");
        width = Integer.parseInt(scan.nextLine());

        System.out.println("Nhap height: ");
        height = Integer.parseInt(scan.nextLine());
    }
}
