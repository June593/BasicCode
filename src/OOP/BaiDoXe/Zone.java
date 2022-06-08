package OOP.BaiDoXe;

import java.util.ArrayList;
import java.util.Scanner;

public class Zone {
    ArrayList<Area> areaList = new ArrayList<>();

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so khu vuc cho zone: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            Area area = new Area();
            area.input();
            areaList.add(area);
        }
    }

    public void inputVehicle() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so xe can them : ");
        int n = input.nextInt();
        int choose;

        for (int i = 0; i < n; i++) ;
        {
            showOptions();
            choose = input.nextInt();
            Vehicle vehicle;
            if (choose == 1) {
                vehicle = new Car();

            } else vehicle = new Container();

            vehicle.input();
        }
    }

    private void showOptions() {
        System.out.println("1. Nhap car");
        System.out.println("2. Nhap container");
        System.out.println("lua chon");
    }
}
