package hwext.sp;

public class Arrow extends Hero{
	
	public Arrow() {
		super();
	}
	
	public Arrow(String name) {
		super(name, "Arrow");
	}

	public Arrow(String name, int level, double exp) {
		super(name, "Arrow", level, exp);
	}
}
