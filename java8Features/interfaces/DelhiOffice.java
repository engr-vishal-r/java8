package interfaces;

public class DelhiOffice extends Office  {
        public void deposit() {
            System.out.println("Amount deposit");
        }

        public static void main(String[] args) {
            IBankTest bank = new DelhiOffice();
            bank.deposit();
        }
    }
