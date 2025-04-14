package abstractClassTest;

abstract class BankTest {

	  private String bankName;

      BankTest(String bankName) {
		this.bankName = bankName;
	  }

	public String getBankName() {
		return bankName;
	}
}


