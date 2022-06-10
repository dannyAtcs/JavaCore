import java.util.*;

public class setClass {

	private String st1, st2;
	private int i;

	public setClass(String st1, String st2, int i) {

		this.st1 = st1;
		this.st2 = st2;
		this.i = i;

	}

	@Override
	public String toString() {
		return "setClass [" + (st1 != null ? "st1=" + st1 + ", " : "")
				+ (st2 != null ? "st2=" + st2 + ", " : "") + "i=" + i + "]";
	}

	public static void main(String[] args) {

		setClass ob = new setClass("abc", "rahul", 1);
		setClass ob1 = new setClass("abc", "rahul", 2);
		setClass ob2 = new setClass("abc", "Ravi", 3);
		setClass ob3 = new setClass("abc", "rahul", 1);

		Set<setClass> set = new LinkedHashSet<>();

		set.add(ob);
		set.add(ob1);
		set.add(ob2);
		set.add(ob3);

		Iterator<setClass> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
