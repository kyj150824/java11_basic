package sec1;

public class Staff extends User {
	private int level;
	// 접근 레벨
	private String part;
	// 근무 부서
	private String name;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void connect() { 
		System.out.println(part + "의" + name + " 가(이) 출근하였습니다. ");
		
	}
	
}
