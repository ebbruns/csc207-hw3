package taojava.assignment03;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringUtilsTest
{

  @Test
  public void testSplitAt()
  {
    assertArrayEquals("test 1", new String[] { "a", "b", "c" },
                      StringUtils.splitAt("a:b:c", ':'));
    assertArrayEquals("test2", new String[] { "a", "b", "c" },
                      StringUtils.splitAt("a b c", ' '));
    assertArrayEquals("test3", new String[] { "a:b:c" },
                      StringUtils.splitAt("a:b:c", ' '));
    assertArrayEquals("one field", new String[] { "a" },
                      StringUtils.splitAt("a", ':'));
    assertArrayEquals("empty inner field", new String[] { "a", "", "c" },
                      StringUtils.splitAt("a::c", ':'));
    assertArrayEquals("leading empty field", new String[] { "", "a" },
                      StringUtils.splitAt(":a", ':'));
    assertArrayEquals("trailing empty field", new String[] { "a", "" },
                      StringUtils.splitAt("a:", ':'));
  }

  @Test
  public void testSplitCSV()
  {
    assertArrayEquals("case1",new String[] { "a", "b", "c" },
                      StringUtils.splitCSV("a,b,c"));
    assertArrayEquals("case2",new String[] { "a,b", "c" },
                      StringUtils.splitCSV("\"a,b\",c"));
    assertArrayEquals("case3",new String[] { "a", "b,b\"", "c" },
                      StringUtils.splitCSV("a,\"b,b\"\"\",c"));
  }

  @Test
  public void testDeLeet()
  {
    assertEquals("e", StringUtils.deLeet("3"));
    assertEquals("leet", StringUtils.deLeet("1337"));
    assertEquals("eat banana", StringUtils.deLeet("3@+ |3@|\\|@|\\|@"));
    assertEquals("swag", StringUtils.deLeet("5w4g"));
    assertEquals("boredom", StringUtils.deLeet("|30r3d0m"));
  }


}
