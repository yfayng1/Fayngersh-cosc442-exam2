package megamek.common.actions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TorsoTwistActionTest</code> contains tests for the class <code>{@link TorsoTwistAction}</code>.
 *
 * @generatedBy CodePro at 5/16/16 4:34 PM
 * @author Fima
 * @version $Revision: 1.0 $
 */
public class TorsoTwistActionTest {
	/**
	 * Run the TorsoTwistAction(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 4:34 PM
	 */
	@Test
	public void testTorsoTwistAction_1()
		throws Exception {
		int entityId = 1;
		int facing = 1;

		TorsoTwistAction result = new TorsoTwistAction(entityId, facing);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getFacing());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the int getFacing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 4:34 PM
	 */
	@Test
	public void testGetFacing_1()
		throws Exception {
		TorsoTwistAction fixture = new TorsoTwistAction(1, 1);

		int result = fixture.getFacing();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setFacing(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 4:34 PM
	 */
	@Test
	public void testSetFacing_1()
		throws Exception {
		TorsoTwistAction fixture = new TorsoTwistAction(1, 1);
		int facing = 1;

		fixture.setFacing(facing);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/16/16 4:34 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/16/16 4:34 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/16/16 4:34 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TorsoTwistActionTest.class);
	}
}