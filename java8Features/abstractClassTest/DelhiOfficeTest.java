package abstractClassTest;

class DelhiOfficeTest extends BankTest {

	DelhiOfficeTest() {
		super("Axis Bank");
	}

	public static void main(String[] args) {
		BankTest bank = new DelhiOfficeTest();
		System.out.println(bank.getBankName());
	}

}