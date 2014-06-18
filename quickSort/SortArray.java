public class SortArray implements Array{

	private int[] array;
	
	public SortArray(int[] array){
		this.array = array;
	}
	
	@Override
	public boolean lessOrEqualThan(int left, int right) {
		return array[left] <= array[right];
	}

	@Override
	public void swap(int left, int right) {
		if(left < 0 || right < 0 || left >= array.length || right >= array.length){
			throw new IndexOutOfBoundsException("Integer Array : array");
		}
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	@Override
	public void print() {
		if(array == null){
			throw new NullPointerException();
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}