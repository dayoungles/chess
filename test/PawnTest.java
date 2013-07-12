import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn pawn = new Pawn();
		String pawnColor = "white";
		assertEquals(pawnColor, pawn.askColor());
	}
}
