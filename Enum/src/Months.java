// enum for months and corresponding number of days
// we cannot create an enum in constructor but we can create a constructor inside an enum.
public enum Months {
	jan(31),feb(28),mar(31),apr(30),may(31),jun(30),jul(31),aug(31),
	sep(30),oct(31),nov(30),dec(31);
	
	int i;
	
	Months(int i){
		this.i = i;
	}

	public int getI() {
		return i;
	}
}
