# Multidimensional-Arrays-Java-course-Software-University
Courses from my education Java fundamental  in @SoftUni
1. Armory
You have forged many swords, so now you start selling them. There are lots of customers who want to buy your blades, but you do not want to bargain for every single sword and decide to sell them to the king. The king sends an army officer to pick swords for his army. Your armory is huge, so you need to guide the army officer though.
You will be given an integer n for the size of the armory with a square shape. On the next n lines, you will receive the rows of the armory. The army officer will be placed in a random position, marked with the letter 'A'. On random positions, there will be swords, marked with a single digit (the price of the sword). There may also be mirrors, the count will be either 0 or 2 and they are marked with the letter - 'M'. All of the empty positions will be marked with '-'.
Each turn, you will tell the army officer which direction he should move. Move commands will be: "up", "down", "left", "right". If the army officer moves to a sword, he buys the sword for a price equal to the digit there and the sword disappears. If the army officer moves to a mirror, he teleports on the position of the other mirror, and then both mirrors disappear. If you guide the army officer out of the armory, he leaves with the swords that he has bought. In advance, you negotiate with the king, that he'll buy at least 65 gold coins worth of blades.
The program ends when the army officer buys blades for at least 65 gold coins, or you guide him out of the armory.
Input
•	On the first line, you are given the integer n – the size of the matrix (armory).
•	The next n lines hold the values for every row.
•	On each of the next lines, you will get a move command.
Output
•	On the first line:
o	If the army officer leaves the armory, print: "I do not need more swords!"
o	If the army officer fulfills the initial deal, print: "Very nice swords, I will come back for more!"
•	On the second line print the profit you’ve made: "The king paid {amount} gold coins."
•	At the end print the final state of the matrix (armory).
Constraints
•	The size of the square matrix (armory) will be between [2…10].
•	There will always be 0 or 2 mirrors, marked with the letter - 'M'.
•	The army officer’s position will be marked as 'A'.
•	There will be always two output scenarios: the army officer leaves or bays swords worth at least 65 gold coins.
2.Bee
You will be given an integer n for the size of the bee territory with a square shape. On the next n lines, you will receive the rows of the territory. The bee will be placed in a random position, marked with the letter 'B'. On random positions, there will be flowers, marked with 'f'. There may also be a bonus on the territory. There will always be only one bonus. It will be marked with the letter - 'O'. All of the empty positions will be marked with '.'.
Each turn, you will be given a command for the bee’s movement.
The commands will be: "up", "down", "left", "right", "End".
If the bee moves to a flower, it pollinates the flower and increases pollinated flowers with one.
If it goes to a bonus, the bee gets a bonus one moves forward and then the bonus disappears. If the bee goes out she can't return back and the program ends. If the bee receives the "End" command the program ends. The bee needs at least 5 pollinated flowers.
Input
•	On the first line, you are given the integer n – the size of the square matrix.
•	The next n lines hold the values for every row.
•	On each of the next lines, until you receive the "End" command,  you will receive a move command.
Output
•	On the first line:
o	If the bee goes out of its territory print: "The bee got lost!"
•	On the second line:
o	 If the bee couldn’t pollinate enough flowers print: "The bee couldn't pollinate the flowers, she needed {needed} flowers more"
o	If the bee successfully pollinated enough flowers print: "Great job, the bee manage to pollinate {polinationed flowers} flowers!"
•	At the end print the matrix.
Constraints
•	The size of the square matrix will be between [2…10].
•	There will always be 0 or 1 bonus, marked with - 'O'.
•	The bee position will be marked with 'B'.
•	There won't be a case where a bonus moves the bee out of its territory.

3.Pawn Wars
Before start solving this problem get familiar with a chessboard:
A chessboard has 8 rows and 8 columns. Rows also called ranks, are marked from number 1 to 8, and columns are marked from a to h. We have a total of 64 squares, each square is represented by a combination of letters and a number (a1, b1, c1, etc.). In this problem colors of the board will be ignored.
We will play the game with two pawns white (w) and black (b), where they can:
•	Only move forward:
	White (w) moves from the 1st rank to the 8th rank direction.
	Black (b) moves from 8th rank to the 1st rank direction.
•	Can move only 1 square at a time.
•	Can capture another pawn only diagonally:
When a pawn reaches the last rank, for white this is the 8th rank, and for black, this is the 1st rank, can be promoted to a queen.
Two pawns (w and b) will be placed on two random squares of the bord. The first move is always made by the white pawn (w), then black moves (b), then white (w) again, and so on. When a pawn marches forward, the previous position is marked by "-" (dash).
Some rules will be applied when moving paws:
•	If the two pawns interact diagonally, the player, in turn, must capture the opponent’s pawn. When a pawn capture another pawn the game is over and "Game over! {White/Black} capture on {coordinates}." is printed to the console.
Example:
White pawn is on the move and captures black in "e5". We print "Game over! White capture on e5."
•	If no capture is possible, the pawns keep on moving until one of them reaches the last rank. When one of the pawns reaches the last rank we print: "Game over! {White/Black} pawn is promoted to a queen at {coordinates}."
Example:
It is black's turn and the pawn reaches the d1 square, we print "Game over! Black pawn is promoted to a queen at d1."
Constraints
•	The input will be always valid.
•	The matrix will always be 8x8.
•	There will be no case where two pawns are placed on the same square.
•	There will be no case where two pawns are placed on the same column.
•	There will be no case where black/white will be placed on the last rank.

4.Treasure hunt
You are a treasure hunter. You have found a long-lost secret map, showing the way to a hidden treasure. But is the map real or fake…
You will be given N and M – integers, indicating the field's dimensions, shown on the secret map. On the next N lines, you will receive the rows of the field. You will be placed in a random position, marked with the letter 'Y'. On random positions, there will be trees marked with the letter 'T'. The treasure is marked with the letter 'X'. All of the empty positions will be marked with '-'.
You will receive a few lines with commands representing which direction you need to move. The possible directions are up, down, right, and left.
If you go out of the field, you need to stay in the last possible position inside the field.
If you step on a tree (position marked with 'T'), go one step back to the direction you came from (not make a move).
If the given command is "Finish" you need to check the position you are standing on. If it is marked with 'X' this means you have found the treasure, and you have to print the following message: "I've found the treasure!". Then print the correct directions you went to in order to find the treasure.
Otherwise, print: "The map is fake!".
Input
•	On the first line, you'll receive the field dimensions in the format: "N M", where N is the number of rows, and M is the number of columns. They'll be separated by a single space (" ").
•	On the next N lines, you will receive a string representing the respective row of the field. The positions in every string will be separated by a single space (" ").
•	On the next few lines, until you receive the command "Finish", you will be given directions (up, down, right, left). 
Output
•	There are two types of output:
o	If you have found the treasure (the last step is on a position marked with 'X') print the following output: "I've found the treasure!".
On the next line, print the correct directions you went to find the treasure (do not include the directions that made you go out of the field or step on a tree). The directions must be separated by a comma and space (", "). It should look like this:
"The right path is {direction1}, {direction2}, …".
o	If you have not found the treasure, print the following message: "The map is fake!".
Constraints
•	The field size will be a 32-bit integer in the range [0 … 2 147 483 647].
•	The field will always have only one 'X' and only one 'Y'.
•	If the steps are invalid, do not include them in the result.
5.Sticky Fingers
John Dillinger is one of the most famous thieves. He leads a group known as the "Dillinger Gang", which was accused of robbing 24 banks and four police stations. Now he is planning his last theft and needs your help.
We get as input the size of the field in which Dillinger moves. The field is always a square. After that, we receive the commands which represent the directions in which Dillinger should move. Dillinger starts from D-position. The commands will be left/right/up/down. If Dillinger reaches the side edge of the field (left, right, up, or down), he remains in his current position and you have to print on the console "You cannot leave the town, there is police outside!". When he successfully moves, replace his last position symbol with the regular position symbol "+". The possible characters that may appear on the screen are:
•	+ - regular position on the field.
•	$ - house 
•	D - Dillinger position
•	P – police
Each time when Dillinger finds a house, he robs it. When Dillinger robs a house replace "$" with "+", calculate how much he has stolen by multiplying row and column indexes of the found symbol "$", add the money to his pocket, and then print  "You successfully stole {calculated money}$.". 
When he steps on "P", he gets caught, print on the console "You got caught with {total stolen money}$, and you are going to jail.", and then the program ends. You have to replace stepped "P" with "#", the matrix must not contain "D".
If his movement commands, get finished print on the console "Your last theft has finished successfully with {total stolen money}$ in your pocket.". The program ends when his movement commands get finished or when he gets caught by the police.
Input
•	Field size – an integer number.
•	Commands to move the sapper – an array of strings separated by ",".
•	The field: some of the following characters (+, $, D, P), separated by whitespace (" ");
Output
•	If the program finishes without Dillinger getting caught: 
o	"Your last theft has finished successfully with {total stolen money}$ in your pocket."
•	If Dillinger gets caught:
o	"You got caught with {total stolen money}$, and you are going to jail."
•	In the end, print the matrix, and separate each symbol by " ".
Constraints
•	The size of the matrix will be between [2…40].
•	The players will always be indicated with "D".
•	Commands will be in the format of up, down, left or right.
6.Bomb
One of the missions that new agents have to complete is called BombField. Your task is to implement the mission into a simple program.
We get as input the size of the field in which our sapper moves. The field is always a square. After that, we receive the commands which represent the directions in which the sapper should move. The sapper starts from the s-position The commands will be left/right/up/down. If the sapper reaches the side edge of the field (left, right, up, or down), it remains in its current position. The possible characters that may appear on the screen are:
•	+ – regular position on the field.
•	e – end of the route. 
•	B – bomb
•	s – the place where the sapper starts
Each time when sapper finds a bomb, he deactivates it, and replace "B" with "+". Keep track of the count of the bombs. Each time you find a bomb, you have to print the following message: "You found a bomb!". If the sapper steps at the end of the route game are over (the program stops) and you have to print the output as shown in the output section. After executing all of the commands there are only 2 possible outcomes (there are not going to be more cases):
•	if you found all bombs – you win and the game ends
•	if you reach the endpoint ("e"), you have to stop
Print the corresponding output depending on the case.
Input
•	Field size – an integer number.
•	Commands to move the sapper – an array of strings separated by ",".
•	The field: some of the following characters (+, e, B, s), separated by whitespace (" ");
Output
•	There are three types of output:
o	If all of the bombs have cleared print the following output: "Congratulations! You found all bombs!"
o	If you reached the end, you have to stop moving and print the following line: "END! {bombs left} bombs left on the field"
o	If there are no more commands and none of the above cases happens, you have to print the following message: "{bombs left} bombs left on the field. Sapper position: ({row},{col})"
Constraints
•	The input numbers will be a 32-bit integer in the range [0 … 2 147 483 647].
•	Allowed working time for your program: 0.1 seconds.
Allowed memory: 16 MB.
7.Rally Racing
It's time for one of the biggest races in the world, Paris-Dakar. The organizers of the event want you to do a program that helps them track the cars through the separate stages in the event.
On the first line, you will be given an integer N, which represents the size of a square matrix. On the second line you will receive the racing number of the tracked race car.
On the next N lines you will be given the rows of  the matrix (string sequences, separated by whitespace), which will be representing the race route. The tracked race car always starts with coordinates [0, 0]. Thеre will be a tunnel somewhere across the race route. If the race car runs into the tunnel , the car goes through it and exits at the other end. There will be always two positions marked with "T"(tunnel). The finish line will be marked with "F". All other positions will be marked with ".".
Keep track of the kilometers passed. Every time the race car receives a direction and moves to the next position of the race route, it covers 10 kilometers. If the car goes through the tunnel, it covers NOT 10, but 30 kilometers.
On each line, after the matrix is given, you will be receiving the directions for the race car.
•	left
•	right
•	up
•	down
The race car starts moving across the race route:
•	If you receive "End" command, before the race car manages to reach the finish line, the car is disqualified and the following output should be printed on the Console: "Racing car {racing number} DNF."
•	If the race car comes across a position marked with ".". The car passes 10 kilometers for the current move and waits for the next direction.
•	If the race car comes across a position marked with "T" this is the tunnel. The race car goes through it and moves to the other position marked with  "T" (the other end of the tunnel). The car passes 30 kilometers for the current move. The tunnel stays behind the car, so the race route is clear, and both the positions marked with "T", should be marked with ".".
•	If the car reaches the finish line - "F" position, the race is over. The tracked race car manages to finish the stage and the following output should be printed on the Console: "Racing car {racing number} finished the stage!". Don’t forget that the car has covered another 10 km with the last move.
Input
•	On the first line you will receive N - the size of the square matrix (race route).
•	On the second line you will receive the racing number of the tracked car.
•	On the next N lines, you will receive the race route (elements will be separated by a space).
•	On the following lines, you will receive directions (left, right, up, down).
•	On the last line, you will receive the command "End".
Output
•	If the racing car has reached the finish line before the "End" command is given, print on the Console: "Racing car {racing number} finished the stage!"
•	If the "End" command is given and the racing car has not reached the finish line yet, the race ends and the following message is printed on the Console: "Racing car {racing number} DNF."
•	On the second line, print the distance that the tracked race car has covered: "Distance covered {kilometers passed} km." 
•	At the end, mark the last known position of the race car with "C" and print the final state of the matrix (race route). If the race car hasn't gone through the tunnel, the tunnel exits should be visualized in the final state of the matrix. The row elements in the output matrix should NOT be separated by whitespace.
Constraints
•	The directions will always lead to coordinates in the matrix.
•	There will always be two positions marked with "T", representing the tunnel in the race route.
•	The size of the square matrix (race route) will be between [4…10].


