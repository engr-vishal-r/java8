package interfaces;

public interface IBank extends IBankNew {

    int CAUTION_MONEY = 2000;

    String createAccount(Customer customer);

    double issueVehicleLoan(String vehicleType, Customer customer);

    double issueHouseLoan(Customer customer);

    double issueGoldLoan(Customer customer);
}
