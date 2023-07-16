package day06.practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

public class TaskTest {

	List<Task> tasksList;

	@BeforeEach // .@BeforeEach சிறுகுறிப்பு ஒரு சோதனை வகுப்பில் ஒவ்வொரு சோதனை
				// முறைக்கும் முன் ஒரு முறை செயல்படுத்தப்பட வேண்டும் என்பதைக் குறிக்கப்
				// பயன்படுத்தப்படுகிறது.
	public void setup() {
		
		tasksList = new ArrayList<>();
		
		tasksList.add(new Task("walk", 5533));
		tasksList.add(new Task("swim", 5533));
		tasksList.add(new Task("write", 5533));
		tasksList.add(new Task("read", 5533));
	}
}
