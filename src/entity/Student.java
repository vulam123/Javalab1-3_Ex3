package entity;

public class Student {
	private String name;
	private double mark;
	public String Learning() {
		if(this.mark<5) {
			return "Yếu";
		}
		else if(this.mark<=6.5) {
			return "TrungBinh";
		}
		else if(this.mark<7.5) {
			return "Kha";
		}
		else if(this.mark<9) {
			return "Giỏi";
		}
		else  {
			return "Xuat sac";
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + ", Learning =" + Learning() + "]";
	}
	
}
