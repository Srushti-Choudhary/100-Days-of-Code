import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> row = new ArrayList<>();
		
		for(int i=0; i<= rowIndex; i++) {
			//Add 1 to the beginning of the row
			row.add(0, 1);
			
			//Update the elements in the row (excluding the added 1)
			for(int j = 1; j< row.size() -1; j++) {
				row.set(j, row.get(j) + row.get(j+1));
			}
		}
		
		return row;
	}
	public static void main(String[] args) {
		PascalsTriangleII pt = new PascalsTriangleII();
		
		int rowIndex = 5;
		List<Integer> result = pt.getRow(rowIndex);
		System.out.println(result);

	}

}
