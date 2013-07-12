import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn pawn = new Pawn();
		String pawnColor = "white";
		assertEquals(pawnColor, pawn.askColor());
		
		Pawn pawn2 = new Pawn("black");
		assertEquals(pawnColor, pawn2.askColor());
		
	}
}
