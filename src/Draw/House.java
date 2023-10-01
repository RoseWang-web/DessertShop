/*
 * File: Lab13a.java
 * Description: drawing HOuse
 * Lessons Learned:
 * Combine simply shapes to create multiple objects
 * Instructor's Name: Barbara Chamberlin
 *
 * @author     Rose Wang
 * @since       04/4/2023
 */
package Draw;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class House extends LandscapeObject{
        //Attributes
        private int houseWidth;					//The width of the house in pixels. Modified by applyScale method().
        private int houseHeight;					//The height of the house in pixels. Modified by applyScale method().
        private String houseColor; 				//The Hex color of the house, including the preceding '#'. Set in the constructor.
        private String roofColor;				//The Hex color of the roof, including the preceding '#'. Set in the constructor.
        private BasicStroke houseStroke = new BasicStroke(1);	//Stroke of 1 pixel use to outline the house shape.

        public House(Graphics2D g2, int x, int y, double scale, String s_houseColor, String s_roofColor) {
            super(g2, x, y, scale);
            this.houseWidth = 100;
            this.houseHeight = 80;
            this.houseColor = "#" + s_houseColor;
            this.roofColor = "#" + s_roofColor;
        }//end of Constructor House

        //Methods
        /**
         * draw()
         * Calls applyScale to apply the scale multiplier to all shape dimensions for the object.
         * Calls drawHouse to draw the house.
         * Calls drawRoof to draw the roof.
         *
         * @return	void.
         */
        public void draw() {
            applyScale();
            drawHouse();
            drawRoof();
        }//end of method draw()

        /**
         * applyScale
         * Applies the scale multiplier to all shape dimensions for the object.
         * Called by draw()
         *
         * @return	void.
         */
        public void applyScale() {
            houseWidth = (int) (houseWidth * getScale());
            houseHeight = (int) (houseHeight * getScale());
        }//end of method applyScale()

        /**
         * drawHouse()
         * Draws a rectangle for the house.
         * Called by draw()
         *
         * @return	void.
         */
        private void drawHouse() {
            g2.setColor(Color.decode(houseColor));
            g2.fillRect(currentX, currentY + houseHeight / 2, houseWidth, houseHeight / 2);

            g2.setColor(Color.BLACK);
            g2.setStroke(houseStroke);
            g2.drawRect(currentX, currentY + houseHeight / 2, houseWidth, houseHeight / 2);
        }//end of method drawHouse()

        /**
         * drawRoof()
         * Draws a triangle for the roof.
         * Called by draw()
         *
         * @return	void.
         */
        private void drawRoof() {
            int[] xPoints = {currentX, currentX + houseWidth / 2, currentX + houseWidth};
            int[] yPoints = {currentY + houseHeight / 2, currentY, currentY + houseHeight / 2};

            g2.setColor(Color.decode(roofColor));
            g2.fillPolygon(xPoints, yPoints, 3);

            g2.setColor(Color.BLACK);
            g2.setStroke(houseStroke);
            g2.drawPolygon(xPoints, yPoints, 3);
        }//end of method drawRoof()
    }
