import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  
  //reverse in place
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlaceOriginal(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

@Test
  public void testReverseInPlaceOddNotOneDifferent()
  {
    int[] input = {2, 3, 4};
    ArrayExamples.reverseInPlaceOriginal(input);
    assertArrayEquals(new int[]{4, 3, 2}, input);
  }

  @Test
  public void testReverseInPlaceEvenDifferent()
  {
    int[] input = {2, 3};
    ArrayExamples.reverseInPlaceOriginal(input);
    assertArrayEquals(new int[]{3, 2}, input);
  }

  @Test
  public void testReverseInPlaceOddNotOneSame()
  {
    int[] input = {3, 1, 3};
    ArrayExamples.reverseInPlaceOriginal(input);
    assertArrayEquals(new int[]{3, 1, 3}, input);
  }

  @Test
  public void testReverseInPlaceEvenSame()
  {
    int[] input = {2, 2};
    ArrayExamples.reverseInPlaceOriginal(input);
    assertArrayEquals(new int[]{2, 2}, input);
  }

  @Test
  public void testReverseInPlaceEmpty()
  {
    int[] input = { };
    ArrayExamples.reverseInPlaceOriginal(input);
    assertArrayEquals(new int[]{}, input);
  }
 }