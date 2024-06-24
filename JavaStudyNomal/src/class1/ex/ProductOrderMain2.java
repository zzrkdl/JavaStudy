package class1.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("배열 개수 입력:");
        int count = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[count];
        scanner.nextLine();

        for(int i = 0; i < orders.length; i++) {
            System.out.print("상품명: ");
            ProductOrder productOrder = new ProductOrder();
            productOrder.productName = scanner.nextLine();
            System.out.print("가격: ");
            productOrder.price = scanner.nextInt();
            System.out.print("수량: ");
            productOrder.quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = productOrder;
        }

        int totalPrice = 0;
        for(ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+", "+ "가격: " + order.price+", "+ "수량: "+order.quantity);
            totalPrice += order.price * order.quantity ;
        }
        System.out.println("총 결제 금액: "+ totalPrice);
    }
}
