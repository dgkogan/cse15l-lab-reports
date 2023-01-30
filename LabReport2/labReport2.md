# Lab Report 2 Servers and Bugs

## 1. Servers

## 2. Bugs

Testing the reverseInPlace function from ArrayExamples

Failure inducing test:

```java
@Test
  public void testReverseInPlaceOddNotOneDifferent()
  {
    int[] input = {2, 3, 4};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{4, 3, 2}, input);
  }
```

Non-failure inducing test:
```java
@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
```

Test Outputs:
![Image][1]
![Image][2]
The symptom seems to be that the function mirrors the array onto itself, meaning that if the input array was {1, 2, 3, 4, 5}, the output array would be {5, 4, 3, 4, 5}. This problem doesn't present it self in the second, passing, test as the length of the input array was 1, and thus mirroring it makes no difference to itself. 

Original function:
```java
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```

Fixed function:
```java
static void reverseInPlace(int[] arr) {
    for (int i = 0; i < arr.length / 2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }
```
The bug was that rather an swapping the values at equal distance from the start and end of the array, the code simply set the value of one index in the array equal to the other of an equal distance from the start of the array. 

The fixed function only looped to the middle of the array, and swapped the values at equal distances from the start and end of the array.


## 3. Learned

[1]: cse15lLabReport2p1.png
[2]: cse15lLabReport2p2.png