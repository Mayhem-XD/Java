package ch11.sec1;

public class Member2 {
	String id;
	String name;
	public Member2(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member2) {
			Member2 member2 = (Member2) obj;
			if(this.id.equals(member2.id)&&this.name.equals(member2.name)) return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
}
