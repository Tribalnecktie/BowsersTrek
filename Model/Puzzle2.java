package Model;

public class Puzzle2 {

	private int plzId;
	private String plzDescription;
	private String answer;
	private boolean isCorrect;

	public Puzzle2 (int plzId, String plzDescription, String answer, boolean isCorrect){
		this.plzId = plzId;
		this.plzDescription = plzDescription;
		this.answer = answer;
		this.isCorrect = isCorrect;
	}

	public int getPlzId() {
		return plzId;
	}

	public void setPlzId(int plzId) {
		this.plzId = plzId;
	}

	public String getPlzDescription() {
		return plzDescription;
	}

	public void setPlzDescription(String plzDescription) {
		this.plzDescription = plzDescription;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
}

