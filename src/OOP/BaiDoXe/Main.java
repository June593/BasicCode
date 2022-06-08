package OOP.BaiDoXe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PeopleMgr peopleMgr = new PeopleMgr();
        Zone zone = new Zone();
        int choose;
        Scanner input = new Scanner(System.in);

        do {
            showMenu();
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    peopleMgr.input();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

                default:
                    System.out.println("input fail");


            }


        } while (choose != 6);

    }
    static void showMenu() {
        System.out.println("1. Nhập thông tin N people.");
        System.out.println("2. Nhập thông tin N Area -> Lưu vào Zone");
        System.out.println("3. Nhập thông tin N vehicle và tự động tìm kiếm khu vự phù hợp để lưu chữ.");
        System.out.println("4. Hiển thị thông tin các xe được sở hữu bởi 1 người theo Tên");
        System.out.println("5. Dùng giải thuật Quick Sort để sắp xếp theo thứ tự giảm dần theo diện tích của xe trong từng khu vực.");
        System.out.println("6. Sử dụng kết quả 5 hiển thị thông tin xe cộ trong Zone đó.");
        System.out.println("Choose : ");
    }
}
