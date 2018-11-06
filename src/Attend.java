

public abstract interface Attend {
	public static final int ABSENCE = -1;
	public static final int ATTENDANCE = 1;
	public static final int LATENESS = 0;
	
	public abstract int getAttend();
	public abstract int setAttend(int num);
}
