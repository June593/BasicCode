package OOP.BaiDoXe;

import java.util.Scanner;

public class People {
    String id;
    String fullName;
    int old;


    public People() {

    }

    public People(String id, String fullName, int old) {
        this.id = id;
        this.fullName = fullName;
        this.old = old;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        id = scan.nextLine();

        System.out.println("Nhap name: ");
        fullName = scan.nextLine();

        System.out.println("Nhap Old: ");
        old = Integer.parseInt(scan.nextLine());
    }

    @Override
    public String toString() {
        return "People{" + "id=" + id + ", fullname = " + fullName + ", old =" + old;
    }


    public void showInfo() {
        System.out.println(toString());
    }
}

