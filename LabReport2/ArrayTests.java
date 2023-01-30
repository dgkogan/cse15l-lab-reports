import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  //#region Original Tests
  //reverse in place
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlaceOriginal(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversedOriginal(input1));
  }
//#endregion

//#region ReverseInPlace tests
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
  //#endregion
  
  //#region Reverse tests
  @Test
  public void testReversedOne() {
    int[] input1 = { 1 };
    assertArrayEquals(new int[]{ 1 }, ArrayExamples.reversedOriginal(input1));
  }

  @Test
  public void testReversedOddNotOneDifferent() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2 , 1 }, ArrayExamples.reversedOriginal(input1));
  }

  @Test
  public void testReversedEvenDifferent() {
    int[] input1 = { 2, 4 };
    assertArrayEquals(new int[]{ 4, 2 }, ArrayExamples.reversedOriginal(input1));
  }

  @Test
  public void testReversedOddNotOneSame() {
    int[] input1 = { 2, 3, 2 };
    assertArrayEquals(new int[]{ 2, 3, 2 }, ArrayExamples.reversedOriginal(input1));
  }

  @Test
  public void testReversedEvenSame() {
    int[] input1 = { 2, 2 };
    assertArrayEquals(new int[]{ 2, 2 }, ArrayExamples.reversedOriginal(input1));
  }
//#endregion
}