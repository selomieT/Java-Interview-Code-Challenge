package interview;

public class SingltonLazy {
	private SingltonLazy() {

	}

	public static class SingltonHolder {
		private static final SingltonLazy INSTANCE = new SingltonLazy();

	}

	public SingltonLazy getSingltone() {
		return SingltonHolder.INSTANCE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
