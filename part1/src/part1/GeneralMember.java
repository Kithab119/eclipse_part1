package part1;

public class GeneralMember extends Member {
	
	private long id;
	private String name;
	private Lesson lesson;
	
	public GeneralMember(long id, String name, Lesson lesson) {
		super(id, name);
		this.lesson = lesson;
	}
	
	@Override
	public int kai_hi() {
		return 1000;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int ryokin() {
		return lesson.ryokin();
	}

	public String getLessonId() {
		return lesson.getLessonId();
	}

	public String getLessonName() {
		return lesson.getLessonName();
	}
	
}