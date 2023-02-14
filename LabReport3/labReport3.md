# Lab Report 3 Researching Commands

## 1. Less command

## -p
 -p will highlight the all matches of a provided string in the text

<pre><code>less -pLucayans travel_guides/berlitz2/Bahamas-History.txt

...Columbus believed that he had reached the East Indies and mistakenly called these people Indians. We know them today as the <mark>Lucayans</mark>. ...</code></pre>

This example shows a snipit of the output of the command being run with a search string of "Lucayans". This command is useful to find the location of the searched string, and its context, which can be very useful with travel guides like these. 

<pre><code>less -pColumbus travel_guides/berlitz2/Bahamas-History.txt

...Centuries before the arrival of <mark>Columbus</mark>, a peaceful Amerindian ...
</code></pre>

This example show a snipit of the output of the command with "Columbus" as the search string. In this case, rather than just looking for occurrences, we are looking for references of Columbus to see his impact on the history of the Bahamas

## -N
-N will display the line number of each line in the file

<pre><code>less -N travel_guides/berlitz2/Bahamas-History.txt

1
2
3
4
5 A Brief History
6 Centuries before the arrival of Columbus, a peaceful Amerindian people who called themselves the Luccucairi had settled in the Bahamas. Or      
6 iginally from South America, they had traveled up through the Caribbean islands, surviving by cultivating modest crops and from what they       
6 caught from sea and shore. Nothing in the experience of these gentle people could have prepared them for the arrival of the Pinta, the Niñ      
6 a, and the Santa Maria at San Salvador on 12 October 1492. Columbus believed that he had reached the East Indies and mistakenly called the      
6 se people Indians. We know them today as the Lucayans. Columbus claimed the island and others in the Bahamas for his royal Spanish patrons      
6 , but not finding the gold and other riches he was seeking, he stayed for only two weeks before sailing towards Cuba.
7 The Spaniards never bothered to settle in the Bahamas, but the number of shipwrecks attest that their galleons frequently passed through t      
7 he archipelago en route to and from the Caribbean, Florida, Bermuda, and their home ports. On Eleuthera the explorers dug a fresh-water we      
7 ll — at a spot now known as “Spanish Wells” — which was used to replenish the supplies of water on their ships before they began the long       
7 journey back to Europe with their cargoes of South American gold. As for the Lucayans, within 25 years all of them, perhaps some 30,000 pe      
7 ople, were removed from the Bahamas to work — and die — in Spanish gold mines and on farms and pearl fisheries on Hispaniola (Haiti), Cuba
7 , and elsewhere in the Caribbean. ...
</code></pre>

Here, the command is showing the line number of each line in the file. We can see that one line in the file can take up multiple lines of the output.

<pre><code>less -NpLucayans travel_guides/berlitz2/Bahamas-History.txt

...6 Centuries before the arrival of Columbus, a peaceful Amerindian people who called themselves the Luccucairi had settled in the Bahamas. Or      
6 iginally from South America, they had traveled up through the Caribbean islands, surviving by cultivating modest crops and from what they       
6 caught from sea and shore. Nothing in the experience of these gentle people could have prepared them for the arrival of the Pinta, the Niñ      
6 a, and the Santa Maria at San Salvador on 12 October 1492. Columbus believed that he had reached the East Indies and mistakenly called the      
6 se people Indians. We know them today as the <mark>Lucayans</mark>. Columbus claimed the island and others in the Bahamas for his royal Spanish patrons
6 , but not finding the gold and other riches he was seeking, he stayed for only two weeks before sailing towards Cuba.
7 The Spaniards never bothered to settle in the Bahamas, but the number of shipwrecks attest that their galleons frequently passed through t      
7 he archipelago en route to and from the Caribbean, Florida, Bermuda, and their home ports. On Eleuthera the explorers dug a fresh-water we      
7 ll — at a spot now known as “Spanish Wells” — which was used to replenish the supplies of water on their ships before they began the long       
7 journey back to Europe with their cargoes of South American gold. As for the <mark>Lucayans</mark>, within 25 years all of them, perhaps some 30,000 pe      
7 ople, were removed from the Bahamas to work — and die — in Spanish gold mines and on farms and pearl fisheries on Hispaniola (Haiti), Cuba
7 , and elsewhere in the Caribbean. ...</code></pre>

Here the command is being used with N to show line numbers, and p to search for a string. This can be very useful quickly see which line a word or words are on.

## -X
 -X will keep the output of less on the command line after exiting

<pre><code> $less -X Bahamas-History.txt 




A Brief History
Centuries before the arrival of Columbus, a peaceful Amerindian people who called themselves the Luccucairi had settled in the Bahamas. Originally from South America, they had traveled up through the Caribbean islands, surviving by cultivating modest crops and from what they caught from sea and shore. Nothing in the experience of these gentle people could have prepared them for the arrival of the Pinta, the Niña, and the Santa Maria at San Salvador on 12 October 1492. Columbus believed that he had reached the East Indies and mistakenly called these people Indians. We know them today as the Lucayans. Columbus claimed the island and others in the Bahamas for his royal Spanish patrons, but not finding the gold and other riches he was seeking, he stayed for only two weeks before sailing towards Cuba. ...
   
$
</code></pre>

In this example, -X is used to keep the output of less on the command line after exiting. This is a useful command to have a reference to the opened file or files in your command line

<pre><code>$ less -XNpLucayans  Bahamas-History.txt
1
2
3
4
5 A Brief History
6 Centuries before the arrival of Columbus, a peaceful Amerindian people who called themselves the Luccucairi had se      
6  by cultivating modest crops and from what they caught from sea and shore. Nothing in the experience of these gent      
6 le people could have prepared them for the arrival of the Pinta, the Niña, and the Santa Maria at San Salvador on       
6 12 October 1492. Columbus believed that he had reached the East Indies and mistakenly called these people Indians.      
6  We know them today as the <mark>Lucayans</mark>. Columbus claimed the island and others in the Bahamas for his royal Spanish p      
6 atrons, but not finding the gold and other riches he was seeking, he stayed for only two weeks before sailing towa      6 rds Cuba.</code></pre>

Here the command is being used in combination with the previous commands to show line numbers and to highlight a string. This is useful to have a persistent and specialized reference open to a file.

## -S
-S will stop line wrapping and will display one full line requiring a user to side scroll to read it. 

<pre><code>less -S Bahamas-History.txt

A Brief History
Centuries before the arrival of Columbus, a peaceful Amerindian people who called themselves the Luccucairi had settled i>
The Spaniards never bothered to settle in the Bahamas, but the number of shipwrecks attest that their galleons frequently>
English sea captains also came to know the beautiful but deserted Bahamian islands during the 17th century. England’s fir>
Colonization and Piracy ...</code></pre>

This example shows -S being used on a file. The `>` found in the output is the command showing that there is more in the line than can be displayed on the screen. The user can use their mouse or the arrow keys to side scroll to view the rest of the line. 

<pre><code>$ less -SXNpColumbus Bahamas-History.txt

...
6 Centuries before the arrival of <mark>Columbus</mark>, a peaceful Amerindian people who called themselves the Luccucairi had s>
7 The Spaniards never bothered to settle in the Bahamas, but the number of shipwrecks attest that their galleons fr>
8 English sea captains also came to know the beautiful but deserted Bahamian islands during the 17th century. Engla>
9 Colonization and Piracy ...
$</code></pre>

This examples shows -S as well as all the other options being used. Here there is text highlighting of the word `Columbus`, line numbers, no line wrapping, and the output persists in the command line. This combination can be useful to have a specialized reference to a file open that also doesn't take a lot of room on the command line.

All command options and descriptions were found in the help screen of the less command accessed by running `less --help`.