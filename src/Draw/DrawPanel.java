/*
* File: Lab13a.java
* Description:  a panel to drawing stuff
* Lessons Learned:
* Combine simply shapes to create multiple objects
* Instructor's Name: Barbara Chamberlin
*
* @author     Rose Wang
* @since       04/4/2023
 */
package Draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;
import java.awt.geom.*;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programmer (via code).
 *
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawPanel extends JPanel {
	//Attributes
	private static final long serialVersionUID = 6311020027600344213L;

	//Landscape Colors
	private final String LIGHT_SKY_BLUE = "87CEFA";
	private final String MIDNIGHT_BLUE = "191970";
	private final String SNOW3 = "CDC9C8";
	private final String WHITE = "FFFFFF";
	private final String MY_WHITE_SMOKE = "F5F5F5";
	private final String LAWN_GREEN = "7CFC00";
	private final String MEDIUM_SPRING_GREEN = "00FA9A";
	private final String SPRING_GREEN = "00FF7F";

	//Tree Colors
	private final String BROWN = "A52A2A";
	private final String DARK_GREEN = "006400";
	private final String FOREST_GREEN = "228B22";
	private final String GRAY = "808080";
	private final String GREEN = "008000";
	private final String DarkTurquoise="00CED1";
	private final String DarkCyan="008B8B";
	private final String LightSeaGreen="#20B2AA";
	private final String DarkGreen = "006400";
	private final String LimeGreen = "32CD32";
	private final String ForestGreen = "228B22";
	private final String OliveGreen = "808000";
	private final String SeaGreen = "2E8B57";

	//House Colors
	private final String DARK_SLATE_GRAY = "2F4F4F";
	private final String FIREBRICK = "B22222";
	private final String INDIAN_RED = "CD5C5C";
	private final String MAROON = "800000";
	private final String MOCCASIN = "FFE4B5";
	private final String RED = "FF0000";
	private final String SADDLE_BROWN = "8B4513";
	private final String SIENNA = "A0522D";
	private final String SLATE_GRAY = "708090";
	private final String PERU = "CD853F";
	private final String WHITE_SMOKE = "F5F5F5";
	private final String BURLYWOOD = "DEB887";




	public DrawPanel() {
		this.setPreferredSize(new Dimension(1400, 800));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12b
	 * Draw all your objects here.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 *
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer

		//DrawTree landscape
		g2.setColor(Color.decode("#" + LIGHT_SKY_BLUE));
		g2.fillRect(0,0,this.getWidth(),this.getHeight());

		g2.setColor(Color.decode("#" + LAWN_GREEN));
		g2.fillOval((-600), 350, this.getWidth() + 1200, 700);

		//DrawTree Trees
		Tree t1 = new Tree(g2, 50, 400, 1, 3, BROWN , DARK_GREEN);
		t1.draw();

		Tree t2 = new Tree(g2, 200, 375, 1, 5, BROWN , GRAY);
		t2.draw();

		Tree t3 = new Tree(g2, 300, 450, 0.5, 4, BROWN , DarkCyan);
		t3.draw();
		Tree t4 = new Tree(g2, 500, 550, 2, 2, BROWN ,GREEN);
		t4.draw();
		Tree t5 = new Tree(g2, 300, 650, .5, 3, BROWN , FOREST_GREEN);
		t5.draw();
		Tree t6 = new Tree(g2, 700, 450, 2, 5, BROWN ,FOREST_GREEN);
		t6.draw();
		Tree t7 = new Tree(g2, 800, 350, 1, 5, BROWN , FOREST_GREEN);
		t7.draw();
		Tree t8 = new Tree(g2, 900, 850, 3, 4, BROWN , GREEN);
		t8.draw();
		Tree t9 = new Tree(g2, 450, 800, 1, 3, BROWN ,GREEN);
		t9.draw();
		Tree t10 = new Tree(g2, 350, 850, 1, 2, BROWN , DarkGreen);
		t10.draw();
		Sun s1= new Sun(g2,50,50,1,1,BROWN,GREEN);
		s1.draw();
		Sun s2= new Sun(g2,250,50,0.5,1,SNOW3,DARK_SLATE_GRAY);
		s2.draw();
		//House(Graphics2D g2, int x, int y, double scale, String s_houseColor, String s_roofColor)
		House h1= new House(g2,800,450,3,WHITE_SMOKE,FIREBRICK);
		h1.draw();
		House h2= new House(g2,250,550,1.5,GRAY,GREEN);
		h2.draw();
		Snowman sn1=new Snowman(g2,550,350,1,WHITE_SMOKE,WHITE_SMOKE,PERU);
		sn1.draw();
		Snowman sn2=new Snowman(g2,200,450,0.5,WHITE_SMOKE,WHITE_SMOKE,SeaGreen);
		sn2.draw();
		//Populate the scene with your own trees here!

	}//end of method paintComponent(Graphics)

}//end of class DrawPanel