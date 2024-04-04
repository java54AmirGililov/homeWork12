package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exceptions.BallBrokenFloor;

class BallBrokenFloorTest {

	private static final int N_FLOORS = 100;

	@Test
	void test() {
		BallBrokenFloor bbf = new BallBrokenFloor(N_FLOORS);
		System.out.println(bbf.getBrokenFloor());
		assertEquals(bbf.getBrokenFloor(), getMinBrokenFloor(bbf));
	}
	private int getMinBrokenFloor(BallBrokenFloor bbf) {
//		TODO
//		Using binary search algorithm and only method checkFloor
//		of the class BallBrokenFloor
//		you should find minimal floor, form which a ball will be broken
		int low = 1;
	    int high = N_FLOORS;
	    int iterCounter = 0;
	    while (low <= high) {
//	    	System.out.println("Iteration " + iterCounter);
	    	System.out.println(low <= high);
	    	System.out.println(low);
	        int middle = (low + high) / 2;
	        try {
	            bbf.checkFloor(middle);
	            low = middle + 1;
	        } catch (Exception ex) {
	            high = middle - 1;
	        }
	        iterCounter++;
	    }
        System.out.println("Binary Search iterCounter=" + iterCounter);
        return low;
	}
}
