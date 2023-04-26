import java.util.*;
public class Main {
    static int x;
    static int y;
    static char c;
    static int moveforward = 0;
    static int turnleft = 0;
    
    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    
	        // Reading user input as string
	        String str = sc.nextLine();
	    
	        // Spliting the string in to two parts
                String str1[] = str.split(" ");
                String[] firstPart = str1[0].split(",");
                String[] secondPart = str1[1].split(",");   
	     
	        //Getting x1,y1,c1 values from the first part of the string and initializing it to x,y,z variables
	        int x1 = Integer.parseInt(firstPart[0]);
	        int y1 = Integer.parseInt(firstPart[1]);
	        char c1 =firstPart[2].charAt(0);
                x = x1;
		y = y1;
		c = Character.toUpperCase(c1);
	
	        //Getting x1,y1,c1 values from the second part of the string
		int x2 = Integer.parseInt(secondPart[0]);
		int y2 = Integer.parseInt(secondPart[1]);
		char c2 = secondPart[2].charAt(0);
		c2 = Character.toUpperCase(c2); 
                System.out.println("Source: "+x+" "+y+" "+c+", Destination: "+x2+" "+y2+" "+c2);
                System.out.println("Steps:");
	    
	        //Checking if coordinates are valid
		if((x1 < 0) || (y1 < 0) || (x2 < 0) || (y2 < 0)) {
		    System.out.println("The given Inputs should be greater than 0");
		    System.exit(0);
		}
	        
	        //Looping untill the destination is reached
		while(true) {
			
		    // If destination reached , Exit the loop
		    if((x == x2) && (y == y2) && ((int)c == (int)c2)) {
		        break;
		    }
		    
		    //If current y coordinate is lesser than destination y coordinate move forwards towards north
		    if(y < y2) {
		        changeDirection('N');
		        forwardmove(x2, y2, 'N');
		        continue;
		    }
			
		    //If current y coordinate is greater than destination y coordinate move forwards towards south
		    else if(y > y2) {
		        changeDirection('S');
		        forwardmove(x2, y2, 'S');
		        continue;
		    }
		   
		    //If current x coordinate is lesser than destination x coordinate move forwards towards west
		    else if(x > x2) {
		        changeDirection('W');
		        forwardmove(x2, y2, 'W');
		        continue;
		    }
			
		    //If current y coordinate is lesser than destination coordinate move forwards towards east
		    else if(x < x2) {
		        changeDirection('E');
		        forwardmove(x2, y2, 'E');
		        continue;
		    }
			
		    //If orientation is not same as the destination orientation change orientation
		    else if((int)c != (int)c2) {
		        changeDirection(c2);
		        continue;
		    }
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Summary:");
		System.out.println("Total Steps:   " + (moveforward + turnleft));
		System.out.println("Move Forward:   " + moveforward);
		System.out.println("Turn Left:      " + turnleft);
		
	}
	
	static void forwardmove(int x2, int y2, char c2) {
	    if(c2 == 'N') {
	        while(y != y2) {
	            moveforward += 1;
                y += 1;
                System.out.println("Move Forward: " + x + " " + y + " " + c);
	            
	        }
	        
	    
	    }
	    else if(c2 == 'S') {
	        while(y != y2) {
	            moveforward += 1;
	            y -= 1;
	            System.out.println("Move Forward: " + x + " " + y + " " + c);
	            
	        }
	        
	       

	    }
	    else if(c2 == 'E') {
	        while(x != x2) {
	            moveforward += 1;
	            x += 1;
	            System.out.println("Move Forward: " + x + " " + y + " " + c);
	            
	        }
	        
	        
	        
	    }
	    else if(c2 == 'W') {
	        while(x != x2) {
	            moveforward += 1;
	            x -= 1;
	            System.out.println("Move Forward: " + x + " " + y + " " + c);
	            
	        }
	    }
	    return;
	}
	
	static void changeDirection(char c2) {
	    if((int)c == (int)c2) {
	        return;
	    }
	    else if(c == 'N') {
	        c = 'W';
	        System.out.println("Turn Left:    " + x + " " + y + " " + c);
	        changeDirection(c2);
	    }
	    else if(c == 'W') {
	        c = 'S';
	        System.out.println("Turn Left:    " + x + " " + y + " " + c);
	        changeDirection(c2);
	    }
	    else if(c == 'S') {
	        c = 'E';
	        System.out.println("Turn Left:    " + x + " " + y + " " + c);
	        changeDirection(c2);
	    }
	    else if(c == 'E') {
	        c = 'N';
	        System.out.println("Turn Left:    " + x + " " + y + " " + c);
	        changeDirection(c2);
	    }
	    turnleft += 1;
	}
}
