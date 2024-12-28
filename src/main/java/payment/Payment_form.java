package payment;

public class Payment_form {
    public boolean processPayment(String cardNumber, double amount) {
        if (isValidCard(cardNumber) && amount > 0) {
            System.out.println("Payment of $" + amount + " processed successfully.");
            return true; // Успешная оплата
        } else {
            System.out.println("Payment failed. Check card details or amount.");
            return false; // Ошибка оплаты
        }
    }

    // Метод для проверки валидности карты (упрощённый пример)
    private boolean isValidCard(String cardNumber) {
        return cardNumber != null && cardNumber.length() == 16; // Простая проверка длины
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        Payment_form processor = new Payment_form();
        boolean success = processor.processPayment("1234567812345678", 100.0);
        System.out.println("Transaction status: " + (success ? "Success" : "Failed"));
    }
}
