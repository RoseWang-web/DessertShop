/*
 * File: Lab13a.java
 * Description: drawing snowman
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
import java.awt.Graphics2D;

public class Snowman extends LandscapeObject {
    //Attributes
    private int bodyWidth = 80;        // The width of the bottom snowball of the snowman.
    private int bodyHeight = 80;       // The height of the bottom snowball of the snowman.
    private int headWidth = 60;        // The width of the middle snowball of the snowman.
    private int headHeight = 60;       // The height of the middle snowball of the snowman.
    private int hatWidth = 50;         // The width of the snowman's hat.
    private int hatHeight = 40;        // The height of the snowman's hat.
    private int armLength = 40;        // The length of the snowman's arms.
    private String bodyColor;          // The hex color of the body of the snowman.
    private String headColor;          // The hex color of the head of the snowman.
    private String hatColor;           // The hex color of the hat of the snowman.
    private BasicStroke stroke = new BasicStroke(1);  // Stroke of 1 pixel used to outline each shape of the snowman.

    public Snowman(Graphics2D g2, int x, int y, double scale, String bodyColor, String headColor, String hatColor) {
        super(g2, x, y, scale);
        this.bodyColor = "#" + bodyColor;
        this.headColor = "#" + headColor;
        this.hatColor = "#" + hatColor;
    }//end of Constructor Snowman

    //Methods

    /**
     * draw()
     * Calls applyScale to apply the scale multiplier to all shape dimensions for the object.
     * Calls drawBody to draw the body of the snowman.
     * Calls drawHead to draw the head of the snowman.
     * Calls drawArms to draw the arms of the snowman.
     * Calls drawHat to draw the hat of the snowman.
     *
     * @return void.
     */
    public void draw() {
        applyScale();
        drawBody();
        drawHead();
        drawArms();
        drawHat();
    }//end of method draw()

    /**
     * applyScale
     * Applies the scale multiplier to all shape dimensions for the object.
     * Called by draw()
     *
     * @return void.
     */
    public void applyScale() {
        bodyHeight = (int) (bodyHeight * getScale());
        bodyWidth = (int) (bodyWidth * getScale());
        headHeight = (int) (headHeight * getScale());
        headWidth = (int) (headWidth * getScale());
        armLength = (int) (armLength * getScale());
        hatHeight = (int) (hatHeight * getScale());
        hatWidth = (int) (hatWidth * getScale());
    }//end of method applyScale()

    /**
     * drawBody()
     * Draws the body of the snowman.
     * Called by draw()
     *
     * @return void.
     */
    private void drawBody() {
        g2.setColor(Color.decode(bodyColor));
        g2.fillOval(currentX, currentY, bodyWidth, bodyHeight);
        g2.setColor(Color.BLACK);
        g2.setStroke(stroke);
        g2.drawOval(currentX, currentY, bodyWidth, bodyHeight);
    }//end of method drawBody()
    /**
     * drawHead()
     * Draws the head of the snowman.
     * Called by draw()
     *
     * @return void.
     */
    private void drawHead() {
        g2.setColor(Color.decode(headColor));
        g2.fillOval(currentX + bodyWidth/3, currentY - bodyHeight/2, headWidth, headHeight);
        g2.setColor(Color.BLACK);
        g2.setStroke(stroke);
        g2.drawOval(currentX + bodyWidth/3, currentY - bodyHeight/2, headWidth, headHeight);
    }//end of method drawHead()
    /**
     * drawArms()
     * Draws the arms of the snowman.
     * Called by draw()
     *
     * @return void.
     */
    private void drawArms() {
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(currentX + bodyWidth/2, currentY + bodyHeight/4, currentX + bodyWidth*3/4, currentY + bodyHeight/4);
        g2.drawLine(currentX + bodyWidth/2, currentY + bodyHeight/4, currentX + bodyWidth/4, currentY + bodyHeight/3);
    }//end of method drawArms()

    /**
     * drawHat()
     * Draws the hat of the snowman.
     * Called by draw()
     *
     * @return void.
     */
    private void drawHat() {
        g2.setColor(Color.decode(hatColor));
        g2.fillRoundRect(currentX + bodyWidth/2, currentY - bodyHeight/2 - hatHeight, hatWidth, hatHeight, 20, 20);

    }//end of method drawHat()

}

