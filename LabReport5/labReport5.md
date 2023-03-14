# Lab Report 5

I chose lab report 3 to talk about for this lab. I originally did the lab on the `less` command, so for this
lab report, I will repeat lab report 3 but with the `grep` command. 

## Grep

## -c
The -c option will print out the number of pattern matching lines. 

```
grep -c Lucayans written_2/travel_guides/berlitz2/Bahamas-History.txt
2
```
This example shows the use of -c looking for the word `Lucayans` in `Bahamas-History.txt`. We can see that the word only appears twice in this file. This can be very useful with more complex patterns looking to specific strings in files. 


```
grep -c the written_2/travel_guides/berlitz2/*.txt
written_2/travel_guides/berlitz2/Algarve-History.txt:32
written_2/travel_guides/berlitz2/Algarve-Intro.txt:21
written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:43
written_2/travel_guides/berlitz2/Algarve-WhereToGo.txt:147
...
```

This example shows the -c option looking for the word `the` in every .txt file in `berlitz2`. Here we can see that the command will output a count for each individual file rather than one total sum. This can be useful with patterns looking at large data sets in many files. 

## -v

The option -v shows every line that didn't match the pattern

```
grep -v Lucayans written_2/travel_guides/berlitz2/Bahamas-History.txt

A Brief History
English sea captains also came to know the beautiful but deserted Bahamian islands during the 17th century. England’s first formal move was on 30 October 1629, when Charles I granted the Bahamas and a chunk of the American south to his Attorney General, Sir Robert Health. But nothing came of that, nor of a rival French move in 1633 when Cardinal Richelieu, the 17th-century French statesman, tried claiming the islands for France.
Colonization and Piracy
...
```

In this example, we can see the line that has `Lucayans` missing from the output of grep. This can be a useful option with files which have lots of repeating lines, to isolate what is actually useful content. 

```
grep -vc Lucayans written_2/travel_guides/berlitz2/Bahamas-History.txt
41
```

In this example, the option -v is used with -c. Hence rather than getting all the lines that did not match the given pattern, we instead get the number of lines that did not match. Once again, this can be a useful option with files with lots of repeating content, to get amount of unique content in the file. 

## -m

The option -m takes a number to act as a maximum for the number of matches with the given pattern.

```
grep -m1 the written_2/travel_guides/berlitz2/Bahamas-History.txt

Centuries before the arrival of Columbus, a peaceful Amerindian people who called themselves the Luccucairi had settled in the Bahamas. Originally from South America, they had traveled up through the Caribbean islands, surviving by cultivating modest crops and from what they caught from sea and shore. Nothing in the experience of these gentle people could have prepared them for the arrival of the Pinta, the Niña, and the Santa Maria at San Salvador on 12 October 1492. Columbus believed that he had reached the East Indies and mistakenly called these people Indians. We know them today as the Lucayans. Columbus claimed the island and others in the Bahamas for his royal Spanish patrons, but not finding the gold and other riches he was seeking, he stayed for only two weeks before sailing towards Cuba.
```

In this example -m is used with 1 as a maximum with matches. This means that it will only output the first match of the word `the`. This is useful to isolate the first or first couple of matches. 

```
grep -cm10 Lucayans written_2/travel_guides/berlitz2/Bahamas-History.txt
2
```

In this example -m is used with -c to show the actual number of matches or until is reaches the max, the max number of matches. This is useful when just gathering information about the data in files. 

All the command options and information were found using the command `grep --help`. 