package part1;

public class Lesson {
	
	private String lessonId;
	private String lessonName;
	
	public Lesson(String lessonId, String lessonName) {
		this.lessonId = lessonId;
		this.lessonName = lessonName;
	}
	
	public int ryokin() {
		return 1000;
	}

	public String getLessonId() {
		return lessonId;
	}

	public String getLessonName() {
		return lessonName;
	}
	
}
