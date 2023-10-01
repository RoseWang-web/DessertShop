/*
 * File: Lab13a.java
 * Description: drawing Sun
 * Lessons Learned:
 * Combine simply shapes to create multiple objects
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       04/4/2023
 */
package Draw;

        import java.awt.*;
        import java.awt.geom.Rectangle2D;
        import java.awt.geom.RoundRectangle2D;

public class Sun extends LandscapeObject{
    //Attributes
    private int levels;						//The number of levels (branch triangles) the tree will have.
    private String SunColor; 				// The Hex color of the trunk, including the preceding '#'. Set in the constructor.
    private String EyesColor; 			// The Hex color of the branches, including the preceding '#'. Set in the constructor.
    private int SunWidth = 80;			//The trunk width in pixels.  Default of 10 for a scale of 1.  Modified by applyScale method().
    private int SunHeight = 80;			//The trunk height in pixels.  Default of 15 for a scale of 1.  Modified by applyScale method().
    private int EyesWidth = 15;			//The branch width in pixels.  Default of 30 for a scale of 1.  Modified by applyScale method().
    private int EyesHeight = 15;			//The branch height in pixels.  Default of 30 for a scale of 1.  Modified by applyScale method().
    private double branchOverlap = .45;		//Indicates how much of each triangle is overlapped by the one above it.
    private BasicStroke SunStroke = new BasicStroke(1);	//Stroke of 1 pixel use to outline each shape of the tree.

    public Sun(Graphics2D g2, int x, int y, double scale, int levels,  String s_SunColor, String s_EyesColor) {
        super(g2, x, y, scale);
        this.levels = levels;
        this.SunColor = "#" + s_SunColor;
        this.EyesColor = "#" + s_EyesColor;
    }//end of Constructor Tree


    //Methods
    /**
     * draw()
     * Calls applyScale to apply the scale multiplier to all shape dimensions for the object.
     * Calls drawTrunk to draw the trunk of the tree.
     * Calls drawBranches to draw the branches of the tree.
     *
     * @return	void.
     */
    public void draw() {
        applyScale();
        drawSun();
        drawEyes();
    }//end of method draw()

    /**
     * applyScale
     * Applies the scale multiplier to all shape dimensions for the object.
     * Called by draw()
     *
     * @return	void.
     */
    public void applyScale() {

        SunHeight=(int)(SunHeight*getScale());
        SunWidth=(int)(SunWidth*getScale());
        EyesHeight=(int)(EyesHeight*getScale());
        EyesWidth=(int)(EyesWidth*getScale());
    }//end of method applyScale()
    /**
     * drawTrunk()
     * Draws a rectangle for the trunk of the tree.
     * Called by draw()
     *
     * @return	void.
     */

    private void drawSun() {
        g2.setColor(Color.decode(SunColor));
        g2.fillOval(currentX, currentY, SunWidth, SunHeight);

        g2.setColor(Color.BLACK);
        g2.setStroke(SunStroke);
        g2.drawOval(currentX, currentY, SunWidth, SunHeight);

    }//end of method drawTrunk()
    /**
     * drawBranches()
     * Draws 'level' number of triangles above the trunk overlapped by 'branchOverlap'.
     * Called by draw()
     *
     * @return	void.
     */
    private void drawEyes() {
        currentX = (currentX + (SunWidth / 2)) - (EyesWidth);
        currentY=currentY+EyesHeight;
        int[] xPoints1 = {currentX, currentX+EyesWidth, currentX+(EyesWidth/2)};
        int[] yPoints1 = {currentY,currentY,currentY+EyesHeight};
        int[] xPoints2 = {currentX+EyesWidth+EyesWidth/3, currentX+EyesWidth+EyesWidth+EyesWidth/3, currentX+(EyesWidth/2)+EyesWidth+EyesWidth/3};
        g2.setColor(Color.decode(EyesColor));
        g2.fillPolygon(xPoints1, yPoints1, 3);
        g2.fillPolygon(xPoints2, yPoints1, 3);
        g2.setStroke(SunStroke);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(xPoints1, yPoints1, 3);
        g2.drawPolygon(xPoints2, yPoints1, 3);
        g2.drawArc(currentX, currentY+EyesHeight, SunWidth/3, SunHeight/3,180,180);

    }//end of method drawBranches()
}//end of class Tree
