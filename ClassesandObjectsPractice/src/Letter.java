
public class Letter {
	private String from;
	private String to;
	 
	public Letter(String f, String t) {
		to = t;
		from = f;
	}
	String oldLine = "";
	public void addLine(String Line) {
		String intro = "Dear, " + to + "/n";
		String body = Line + "/n";
		if (oldLine == "") {
		oldLine = Line;
		}
		else {
		body = intro + oldLine +(body.concat("Sincerely,").concat("\n") + from);
		}
	}
}
