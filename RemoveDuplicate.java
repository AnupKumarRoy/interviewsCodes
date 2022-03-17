package weekday3;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,3,3,3,3,5,6,6,7,7,7};
		Set<Integer> treeSet = new TreeSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			treeSet.add(array[i]);
		}
		System.out.println(treeSet);

	}

}
