package sec1;

public class Board {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String resdate;
	private int visited;
	

	public Board() {} 
	
	// 객체를 만들어주는 함수 = 생성자 함수 - 메소드랑 다른점 반환 함수가 없음.
	public Board(int bno) {
		this.bno = bno;
	}
	
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	
	public Board(int bno, String title, String uname) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
	}
	
	public Board(int bno, String title, String uname, String content) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
	}
	
	public Board(int bno, String title, String uname, String content, String resdate) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
	}
	public Board(int bno, String title, String uname, String content, String resdate, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	}
	
	
	public int getBno() {
		return bno;		
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", resdate="
				+ resdate+ ", visited=" + visited + "]";
	}
	
	
}
