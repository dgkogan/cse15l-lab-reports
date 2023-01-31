# Lab Report 2 Servers and Bugs

## 1. Servers

StringServer code:
```java
import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {

    String message = ""; 
    
    @Override
    public String handleRequest(URI url) {
        
        if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    message += parameters[1];
                    message += "\n";
                    return message;
                }
        }
        return "404 Not Found!";
    }
}

public class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
```

![Image][3]
In this image, handleRequest is called with the url of `localhost:4000/add-message?s=Hello`. The relevant parts of the URI class that are used are the path and query, where the path is `/add-message` and the query is `s=Hello`. Then, based on the query, the variable `message` is added to with the second part of the query, `Hello`, and `\n`. The only value that is changed in this function is `message`.


![Image][4]
In this image, again handleRequest is called but with the url of `localhost:4000/add-message?s=Wow so cool`. Once again, the relevant parts of the URI class that are used are the path and query, where the path is the same as the previous picture, but the query is `s=Wow so cool`. Then, message is changed in a similar way, where `Wow so cool` is added to it along with `\n`. Once again, the only changed value is message.

## 2. Bugs

Testing the reverseInPlace function from ArrayExamples

Failure inducing test:

```java
@Test
  public void testReverseInPlaceOddNotOneDifferent(){
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

I learned about web servers and URIs in these labs. I dint know how url requests were handled before and the different formats of statements in urls were queries. Also, I didn't know was some different symbols meant like that `%20` represented a " "(space).

[1]: cse15lLabReport2p1.png
[2]: cse15lLabReport2p2.png
[3]: cse15lLabReport2p3.png
[4]: cse15lLabReport2p4.png