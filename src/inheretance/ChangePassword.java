package inheretance;

public final class ChangePassword {
	final String passCode;
	
	public ChangePassword() {
		passCode="abc@123";
	}
	
	public final void ecryptPassword() {
		passCode="xyz@123";
	}
}
