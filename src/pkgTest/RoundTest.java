package pkgTest;

import static org.junit.Assert.*;


import org.junit.Test;

import pkgCore.eGameResult;
import pkgCore.Round; 
public class RoundTest {

@Test 
	public void TestRound() {
	Round r = new Round();

	if (Round.getComeOutScore() == 7) {
		assertEquals(r.getResult(),eGameResult.NATURAL);}}
		
@Test 
	public void TestCRAPS() {
	Round r = new Round();
	if (Round.getComeOutScore()==2) {
		assertEquals(r.getResult(),eGameResult.CRAPS);
		
	}
}
}
	/*@Test
	public void TestRound() {
		for (int a = 0; a< 20; a++ ) {
			Round r = new Round();	
			}
	}
}*/
