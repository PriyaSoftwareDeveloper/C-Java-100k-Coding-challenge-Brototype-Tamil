
public class SampleMain extends Hello {
	
	void ontext (String text) {
		
		System.out.println(text);
	}
	
	public SampleMain() {
		
		TextScanner ts = new TextScanner(this);
		ts.scan();
		
	}
	public static void main(String[] args) {
		
		SampleMain s = new SampleMain();
	}
}
