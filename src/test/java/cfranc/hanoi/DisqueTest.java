package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	
	Disque dSmall = new Disque(1);
	Disque dMedium = new Disque(2);
	Disque dTall = new Disque(3);

	@Test
	public void testCompareTo() {
		Disque D1 = new Disque(1);
		Disque D2 = new Disque(2);
                Disque Dbug = new Disque(1);
                assertEquals(-1,D1.compareTo(D2));
                assertEquals(1,D2.compareTo(D1));
                assertEquals(0,D1.compareTo(Dbug));		                
	}

	@Test
	public void compareTo_Small_to_Medium_False(){
		int expected = -1;
		int actual = dSmall.compareTo(dMedium);
		assertEquals(expected, actual);
	}
        
        public void compareTo_Medium_to_Small_True(){
		int expected = 1;
		int actual = dMedium.compareTo(dSmall);
		assertEquals(expected, actual);
	}
        
        public void compareTo_TailleIdentique_True(){
		int expected = 0;
		int actual = dSmall.compareTo(dSmall);
		assertEquals(expected, actual);
	}
}
