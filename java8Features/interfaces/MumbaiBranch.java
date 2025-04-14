package interfaces;

public class MumbaiBranch implements IBank {
    public String createAccount(Customer customer) {
        return "Acc12345";
    }

    public double issueVehicleLoan(String vehicleType, Customer customer) {
        if (vehicleType.equals("bike")) {
            return 100000;
        } else {
            return 500000;

        }
    }

    public double issueHouseLoan(Customer customer) {
        return 200000;
    }

    public double issueGoldLoan(Customer customer) {
        return 500000;
    }

    public boolean applyforCreditCard(Customer customer) {
        return true;
    }

}
