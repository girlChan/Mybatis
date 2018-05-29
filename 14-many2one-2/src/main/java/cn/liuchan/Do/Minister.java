package cn.liuchan.Do;


public class Minister {
	private int mid;
	private String mname;
	//关联属性
	private Country country;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Minister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Minister(int mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Minister [mid=" + mid + ", mname=" + mname + ", country=" + country + "]";
	}
	
}
