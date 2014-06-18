public class SortVector {
	private Array array;

	public SortVector(Array array) {
		this.array = array;
	}

	public void quickSort(int left, int right) {
		if (null == array) {
			throw new NullPointerException();
		}

		int startPoint = left;
		int endPoint = right;
		int point = (left + right) / 2;

		while (startPoint < endPoint) {
			while (point < endPoint && array.lessOrEqualThan(point, endPoint)) {
				endPoint--;
			}
			if (point < endPoint) {
				array.swap(point, right);
				point = endPoint;
			}
			while (startPoint < point && array.lessOrEqualThan(startPoint, point)) {
				startPoint++;
			}
			if (startPoint < point) {
				array.swap(point, startPoint);
				point = startPoint;
			}
		}
		if (point - left > 1) {
			quickSort(left, point - 1);
		}
		if (right - point > 1) {
			quickSort(point + 1, right);
		}
	}

	public void print() {
		array.print();
	}
}