package inheretance;

class Customer{
	int customerId;
	String customerName;
	
	Customer(){
		
	}
	
	Customer(int customerId, String customerName){
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize called");
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	
}

public class DemoFinalize {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1 = null;
		Customer customer2 = new Customer();
		customer2 = null;
		Customer customer3 = new Customer(1,"Alex");
		System.out.println(customer3);
		System.gc();
	}
	
}
