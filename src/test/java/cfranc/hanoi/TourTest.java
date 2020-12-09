package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {
    Disque d1 = new Disque(1);
    Disque d2 = new Disque(2);
    Disque d3 = new Disque(3);
	@Test
	public void testEmpiler_SurTourNonVideDisquePlusPetit_Vrai() {
            
            Tour t = new Tour(2);
            t.empiler(d3);
            
            boolean expected = true;
            boolean actual = t.empiler(d1);
            
            assertEquals(expected,actual);
               
	}
        
        @Test
	public void testEmpiler_SurTourNonVideDisquePlusGrand_False() {

            Tour t = new Tour(2);
            t.empiler(d1);
            
            boolean expected = false;
            boolean actual = t.empiler(d3);
            
            assertEquals(expected,actual);
               
	}
        
        public void testEmpiler_SurTourVide_true() {
            Tour t = new Tour(2);
            
            boolean expected = true;
            boolean result = t.empiler(d1);
            
            assertEquals(expected, result);
            
        }
        
        public void testEmpiler_SurTourPleine_false() {
            Tour t = new Tour(2);
            
            boolean expected = false;
            t.empiler(d3);
            t.empiler(d2);
            boolean result = t.empiler(d1);
            assertEquals(expected, result);
            
        }
}
