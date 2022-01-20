package ryancharuk.LabSix.Laba;

public interface Standart {

	default int man(int... val) {
		return add(val);
	}

	private  int add(int... values) {
		int result = 0;
		for (int n : values) {
			result += n;
		}
		return result;
	}
}
