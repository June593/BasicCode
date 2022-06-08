package OOP.BaiDoXe;

import java.util.Scanner;

public class Vehicle {
    String manufacturer;
    String no;
    String year;
    String owner;
    int width;
    int height;

    public Vehicle() {
    }

    public Vehicle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Vehicle(String manufacturer, String no, String year, String owner, int width, int height) {
        this.manufacturer = manufacturer;
        this.no = no;
        this.year = year;
        this.owner = owner;
        this.width = width;
        this.height = height;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

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

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", no='" + no + '\'' +
                ", year='" + year + '\'' +
                ", owner='" + owner + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public void showInfo() {
        System.out.println(toString());
    }
}
