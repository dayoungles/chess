import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		final String white = "white";
		final String black = "black";
		
		Pawn pawn = new Pawn();
		assertEquals(white, pawn.askColor());
		
		Pawn pawn2 = new Pawn(black);
		assertEquals(black, pawn2.askColor());
		
	}
}
