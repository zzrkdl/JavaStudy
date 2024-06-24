package ref.ex;


import java.util.Scanner;

public class ProductOrderMain4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요.");
        int choice = scanner.nextInt();


        ProductOrder[] orders = new ProductOrder[choice];

        for(int i = 0; i<orders.length; i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            scanner.nextLine();
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int productPrice = scanner.nextInt();
            System.out.print("수량: ");
            int productQuantity = scanner.nextInt();

            orders[i] = createOrder(productName, productPrice, productQuantity);
        }


        printOrders(orders);

        System.out.println("총 금액: "+ getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for(ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
