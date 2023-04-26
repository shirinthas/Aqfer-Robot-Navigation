# Aqfer-Robot-Navigation(Coding Assignment)
This Java program takes input from the user in the form of a string containing two sets of three numbers and a character. Each set represents a point on a 2D plane and the character represents the direction in which an object is facing. The program then calculates the shortest path to move the object from the first point to the second point while facing the correct direction.

**How did i build and ran the program**
This program is written in Java and takes input from the user in the form of two coordinates (x, y) and a direction (N, S, E, or W) for both the source and destination locations. It then calculates the steps required to move from the source location to the destination location and outputs the steps taken in the form of "Move Forward" and "Turn Left" commands.To run the program, you would need to save the code in a file with a .java extension and compile it using a Java compiler. Once the code is compiled, you can run the program from the command line or an IDE. To run the program from the command line, navigate to the directory where the compiled .class file is located and type "java Main" (assuming the name of the Java file is "Main.java"). This will execute the program and prompt you to enter the source and destination locations. Once you enter the locations, the program will calculate the steps required and output them to the console.

**Sample input and output tested**

**_Sample Input 1_**
 3,3,E 7,3,E
 
 
**_Sample Output 1_**
Source: 3 3 E, Destination: 7 3 E
Steps:
Move Forward: 4 3 E
Move Forward: 5 3 E
Move Forward: 6 3 E
Move Forward: 7 3 E


Summary:
Total Steps:   4
Move Forward:  4
Turn Left:     0

**_Sample Input 2_**
4,2,E 8,2,E

**_Sample Output 2_**
Source: 4 2 E, Destination: 8 2 E
Steps:
Move Forward: 5 2 E
Move Forward: 6 2 E
Move Forward: 7 2 E


Summary:
Total Steps:   3
Move Forward:  3
Turn Left:     0

