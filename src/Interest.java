import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tiềm muốn gửi: ");
        double money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        int month = scanner.nextInt();
        System.out.println("Nhập lãi năm: ");
        double rate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * ((rate / 100) / 12);
        }
        System.out.println("Tổng tiền lãi: " + totalInterest);
    }
}
