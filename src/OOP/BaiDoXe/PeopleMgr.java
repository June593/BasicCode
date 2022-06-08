package OOP.BaiDoXe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PeopleMgr {
    ArrayList<People> peopleList = new ArrayList<>();

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so chu xe: ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++) {
            People people = new People();
            people.input();
            peopleList.add(people);
        }

    }
}
