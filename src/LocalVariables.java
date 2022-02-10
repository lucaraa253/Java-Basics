
public class LocalVariables {
	
	
//	Instance Variables
	int marks = 100;
	
	int score = 0;
	
	public void takeExam() {
//		Local variables
		int marksScored = 0;
		if(marks>50) {
			marksScored = 20;
		}else {
			marksScored = 0;
		}
		System.out.println(marksScored);
	}

	public static void main(String[] args) {
		LocalVariables l = new LocalVariables();
		l.takeExam();

	}

}
