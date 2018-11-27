package rooms;

// class of puzzle
public class PuzzleRoom extends Room {
	
	// data fields for puzzle class
	private String question;
	private String answer;
	
	//constructor for puzzle class
	public PuzzleRoom(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}
	
	public String getAnswer() {
		return answer;
	}
	
}
