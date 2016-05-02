

/**
 * The test class BookUnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookUnitTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class BookUnitTest
     */
    public BookUnitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

	public void test1()
	{
		Book book1 = new Book("Gone With The Wind", "Margaret Mitchell", 25.12);
		assertEquals("Margaret Mitchell", book1.getAuthor());
		assertEquals(100, book1.getId());
		assertEquals(25.12, book1.getPrice());
		book1.setPrice(24.95);
		assertEquals(24.95, book1.getPrice());
		Book book2 = new Book("The DaVinci Code", "Dan Brown", 19.99);
		assertEquals(101, book2.getId());
		Book book3 = new Book("The Cat in the Hat", "Dr. Suess", 8.50);
		assertEquals(102, book3.getId());
	}
}

