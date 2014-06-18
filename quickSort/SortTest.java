public class SortTest {
	public static void main(String[] args) {
		int[] array = { 2, 1, 3, 5, 6, 7, 8 };
		SortVector sv = new SortVector(new SortArray(array));
		sv.quickSort(0, array.length - 1);
		sv.print();
	}
}