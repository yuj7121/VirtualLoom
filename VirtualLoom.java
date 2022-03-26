/*
Namae: Yujin Bae
Dtae: October 8, 2020
Teacher: Mr. Guglielmi
Describtion: This program will display a native american style bead loom in 400 by 400 window
*/

// The "VirtualLoom" class.
import java.awt.*;
import hsa.Console;

public class VirtualLoom
{
    static Console c;           // The output console

    //declaration section
    Color turquoise = new Color (0, 150, 150);

    //constuctor
    public VirtualLoom ()
    {
	c = new Console (20, 48);
    }


    //the title method
    //it will display the title screen
    public void title ()
    {
	c.print (' ', 16);
	c.println ("Virtual Bead Loom");
	c.println ();
	c.println ("Native Americans used beads made of shells, stones, quills, or bones to make breastplates, wampum belts, and other beautiful beadworks. They also used four-fold symmetry in their designs to represent organization and valance. ");
	c.println ();
	c.println ("The following bead loom design was inspired by Native American artwork, although non of its colours or shapes hold any Native American symbolism. ");
	c.println ();
	c.println ("Press any key to see the bead loom");
    }


    //this function creates beads of a colour in a coloumn
    //int x = the column of the bead
    //int y = the row the beads will appear
    //int z = number of beads that will apear
    //color colour = the colour of the beads
    public void bead (int x, int y, int z, Color colour)
    {
	c.setColor (colour);
	for (int i = 0 ; i < z ; i++)
	{
	    c.fillOval ((x-1) * 10, (y + i -1) * 10, 9, 9);
	    /*
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	    */
	}
    }


    public void display ()
    {
	//the background
	c.setColor (Color.gray);
	c.fillRect(0, 0, 400, 400);

	//the first column
	bead (1, 1, 40, turquoise);

	//the second column
	bead (2, 1, 10, turquoise);
	bead (2, 11, 2, Color.black);
	bead (2, 13, 7, turquoise);
	bead (2, 20, 2, Color.yellow);
	bead (2, 22, 7, turquoise);
	bead (2, 29, 2, Color.black);
	bead (2, 31, 10, turquoise);

	//the third line
	bead (3, 1, 10, turquoise);
	bead (3, 11, 1, Color.black);
	bead (3, 12, 1, Color.red);
	bead (3, 13, 1, Color.black);
	bead (3, 14, 5, turquoise);
	bead (3, 19, 4, Color.yellow);
	bead (3, 23, 5, turquoise);
	bead (3, 28, 1, Color.black);
	bead (3, 29, 1, Color.red);
	bead (3, 30, 1, Color.black);
	bead (3, 31, 10, turquoise);

	//the fourth line
	bead (4, 1, 10, turquoise);
	bead (4, 11, 1, Color.black);
	bead (4, 12, 2, Color.red);
	bead (4, 14, 1, Color.black);
	bead (4, 15, 3, turquoise);
	bead (4, 18, 2, Color.yellow);
	bead (4, 20, 2, turquoise);
	bead (4, 22, 2, Color.yellow);
	bead (4, 24, 3, turquoise);
	bead (4, 27, 1, Color.black);
	bead (4, 28, 2, Color.red);
	bead (4, 30, 1, Color.black);
	bead (4, 31, 10, turquoise);

	//the fifth line
	bead (5, 1, 10, turquoise);
	bead (5, 11, 1, Color.black);
	bead (5, 12, 3, Color.red);
	bead (5, 15, 1, Color.black);
	bead (5, 16, 2, turquoise);
	bead (5, 18, 2, Color.yellow);
	bead (5, 20, 2, turquoise);
	bead (5, 22, 2, Color.yellow);
	bead (5, 24, 2, turquoise);
	bead (5, 26, 1, Color.black);
	bead (5, 27, 3, Color.red);
	bead (5, 30, 1, Color.black);
	bead (5, 31, 10, turquoise);

	//the sixth line
	bead (6, 1, 10, turquoise);
	bead (6, 11, 1, Color.black);
	bead (6, 12, 3, Color.red);
	bead (6, 15, 1, Color.yellow);
	bead (6, 16, 1, Color.black);
	bead (6, 17, 2, turquoise);
	bead (6, 19, 4, Color.yellow);
	bead (6, 23, 2, turquoise);
	bead (6, 25, 1, Color.black);
	bead (6, 26, 1, Color.yellow);
	bead (6, 27, 3, Color.red);
	bead (6, 30, 1, Color.black);
	bead (6, 31, 10, turquoise);

	//the seventh line
	bead (7, 1, 10, turquoise);
	bead (7, 11, 1, Color.black);
	bead (7, 12, 3, Color.red);
	bead (7, 15, 2, Color.yellow);
	bead (7, 17, 1, Color.black);
	bead (7, 18, 2, turquoise);
	bead (7, 20, 2, Color.yellow);
	bead (7, 22, 2, turquoise);
	bead (7, 24, 1, Color.black);
	bead (7, 25, 2, Color.yellow);
	bead (7, 27, 3, Color.red);
	bead (7, 30, 1, Color.black);
	bead (7, 31, 10, turquoise);

	//the eighth line
	bead (8, 1, 10, turquoise);
	bead (8, 11, 1, Color.black);
	bead (8, 12, 3, Color.red);
	bead (8, 15, 3, Color.yellow);
	bead (8, 18, 1, Color.black);
	bead (8, 19, 4, turquoise);
	bead (8, 23, 1, Color.black);
	bead (8, 24, 3, Color.yellow);
	bead (8, 27, 3, Color.red);
	bead (8, 30, 1, Color.black);
	bead (8, 31, 10, turquoise);

	//the ninth line
	bead (9, 1, 10, turquoise);
	bead (9, 11, 1, Color.black);
	bead (9, 12, 3, Color.red);
	bead (9, 15, 3, Color.yellow);
	bead (9, 18, 1, Color.white);
	bead (9, 19, 1, Color.black);
	bead (9, 20, 2, turquoise);
	bead (9, 22, 1, Color.black);
	bead (9, 23, 1, Color.white);
	bead (9, 24, 3, Color.yellow);
	bead (9, 27, 3, Color.red);
	bead (9, 30, 1, Color.black);
	bead (9, 31, 10, turquoise);

	//the tenth line
	bead (10, 1, 10, turquoise);
	bead (10, 11, 1, Color.black);
	bead (10, 12, 3, Color.red);
	bead (10, 15, 3, Color.yellow);
	bead (10, 19, 2, Color.white);
	bead (10, 20, 2, Color.black);
	bead (10, 22, 2, Color.white);
	bead (10, 24, 3, Color.yellow);
	bead (10, 27, 3, Color.red);
	bead (10, 30, 1, Color.black);
	bead (10, 31, 10, turquoise);

	//the eleventh line
	bead (11, 1, 1, turquoise);
	bead (11, 2, 10, Color.black);
	bead (11, 12, 3, Color.red);
	bead (11, 15, 3, Color.yellow);
	bead (11, 19, 2, Color.white);
	bead (11, 20, 2, Color.black);
	bead (11, 22, 2, Color.white);
	bead (11, 24, 3, Color.yellow);
	bead (11, 27, 3, Color.red);
	bead (11, 30, 10, Color.black);
	bead (11, 40, 1, turquoise);

	//the twelveth line
	bead (12, 1, 1, turquoise);
	bead (12, 2, 1, Color.black);
	bead (12, 3, 9, Color.red);
	bead (12, 12, 1, Color.black);
	bead (12, 13, 2, Color.red);
	bead (12, 15, 3, Color.yellow);
	bead (12, 19, 2, Color.white);
	bead (12, 20, 2, Color.black);
	bead (12, 22, 2, Color.white);
	bead (12, 24, 3, Color.yellow);
	bead (12, 27, 2, Color.red);
	bead (12, 29, 1, Color.black);
	bead (12, 30, 9, Color.red);
	bead (12, 39, 1, Color.black);
	bead (12, 40, 1, turquoise);

	//the thirteenth line
	bead (13, 1, 2, turquoise);
	bead (13, 3, 1, Color.black);
	bead (13, 4, 9, Color.red);
	bead (13, 13, 1, Color.black);
	bead (13, 14, 1, Color.red);
	bead (13, 15, 3, Color.yellow);
	bead (13, 19, 2, Color.white);
	bead (13, 20, 2, Color.black);
	bead (13, 22, 2, Color.white);
	bead (13, 24, 3, Color.yellow);
	bead (13, 27, 1, Color.red);
	bead (13, 28, 1, Color.black);
	bead (13, 29, 9, Color.red);
	bead (13, 38, 1, Color.black);
	bead (13, 39, 2, turquoise);

	//the fourteenth line
	bead (14, 1, 3, turquoise);
	bead (14, 4, 1, Color.black);
	bead (14, 5, 9, Color.red);
	bead (14, 14, 1, Color.black);
	bead (14, 15, 3, Color.yellow);
	bead (14, 19, 2, Color.white);
	bead (14, 20, 2, Color.black);
	bead (14, 22, 2, Color.white);
	bead (14, 24, 3, Color.yellow);
	bead (14, 27, 2, Color.red);
	bead (14, 27, 1, Color.black);
	bead (14, 28, 9, Color.red);
	bead (14, 37, 1, Color.black);
	bead (14, 38, 3, turquoise);

	//the fifhteenth line
	bead (15, 1, 4, turquoise);
	bead (15, 5, 1, Color.black);
	bead (15, 6, 9, Color.yellow);
	bead (15, 15, 1, Color.black);
	bead (15, 16, 2, Color.yellow);
	bead (15, 19, 2, Color.white);
	bead (15, 20, 2, Color.black);
	bead (15, 22, 2, Color.white);
	bead (15, 24, 2, Color.yellow);
	bead (15, 26, 1, Color.black);
	bead (15, 27, 9, Color.yellow);
	bead (15, 36, 1, Color.black);
	bead (15, 37, 4, turquoise);

	//the sixteenth line
	bead (16, 1, 5, turquoise);
	bead (16, 6, 1, Color.black);
	bead (16, 7, 9, Color.yellow);
	bead (16, 16, 1, Color.black);
	bead (16, 17, 1, Color.yellow);
	bead (16, 19, 2, Color.white);
	bead (16, 20, 2, Color.black);
	bead (16, 22, 2, Color.white);
	bead (16, 24, 1, Color.yellow);
	bead (16, 25, 1, Color.black);
	bead (16, 26, 9, Color.yellow);
	bead (16, 35, 1, Color.black);
	bead (16, 36, 5, turquoise);

	//the seventeenth line
	bead (17, 1, 6, turquoise);
	bead (17, 7, 1, Color.black);
	bead (17, 8, 9, Color.yellow);
	bead (17, 17, 1, Color.black);
	bead (17, 19, 2, Color.white);
	bead (17, 20, 2, Color.black);
	bead (17, 22, 2, Color.white);
	bead (17, 24, 1, Color.black);
	bead (17, 25, 9, Color.yellow);
	bead (17, 34, 1, Color.black);
	bead (17, 35, 6, turquoise);

	//the eighteenth line
	bead (18, 1, 3, turquoise);
	bead (18, 4, 2, Color.white);
	bead (18, 6, 2, turquoise);
	bead (18, 8, 1, Color.black);
	bead (18, 9, 9, Color.white);
	bead (18, 18, 1, Color.black);
	bead (18, 20, 1, Color.white);
	bead (18, 20, 2, Color.black);
	bead (18, 22, 1, Color.white);
	bead (18, 22, 1, Color.black);
	bead (18, 24, 9, Color.white);
	bead (18, 33, 1, Color.black);
	bead (18, 34, 2, turquoise);
	bead (18, 36, 2, Color.red);
	bead (18, 38, 3, turquoise);
	
	//the nineteenth line
	bead (19, 1, 2, turquoise);
	bead (19, 3, 4, Color.white);
	bead (19, 7, 2, turquoise);
	bead (19, 9, 1, Color.black);
	bead (19, 10, 9, Color.white);
	bead (19, 20, 2, Color.black);
	bead (19, 23, 9, Color.white);
	bead (19, 32, 1, Color.black);
	bead (19, 33, 2, turquoise);
	bead (19, 35, 4, Color.red);
	bead (19, 39, 2, turquoise);
	


    }


    public static void main (String[] args)
    {
	VirtualLoom v = new VirtualLoom ();
	//v.title ();
	//c.getChar ();
	//c.clear ();
	v.display ();

    } // main method
} // VirtualLoom class
