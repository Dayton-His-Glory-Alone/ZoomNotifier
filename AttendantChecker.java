import java.io.File;
import java.util.concurrent.TimeUnit;

public class AttendantChecker {

	public int required = 0;
	public int numberJoined = 1;

	public AttendantChecker() {

	}

	public void check() {

		for (;;) {
			try {
				TimeUnit.SECONDS.sleep(1);
				update();
			} catch (InterruptedException e) {
				System.out.println("System wait error");
				e.printStackTrace();
			}
		}

	}
	private void send() {
		
	}
	private void update() {

		File directory = new File("/Users/gregg/Documents/Zoom/notify");
		int temp = 0;
		// if(directory.exists())System.out.println("exists");
		if (directory.isDirectory()) {
			String[] files = directory.list();
			// if the same amount of particpants have joined since last update, don't
			// display
			if (numberJoined != files.length) {
				System.out.println(files.length+" people total");
				if (files.length > 0) {
					System.out.println("Someone joined the meeting");
					numberJoined++;
				}
//				if (files.length == required) {
//					System.out.println("The minimum amount of participants have joined");
//				} 
				else {
					System.out.println("No one else has joined the meeting");
				}
			}

		}
	}

	public int getReqNum() {
		return required;
	}

	public void setReqNum(int required) {
		this.required = required;
	}
}