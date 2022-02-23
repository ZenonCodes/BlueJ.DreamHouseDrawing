
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square door;
     private Square floor;
    private Square grass;
    private Square wall2;
    private Square background;
    private Triangle roof;
    private Triangle roof2;
    private Triangle roof3;
    private Circle sun;
    private Circle sun2;
    private Circle doorArch;
    private Circle steppingStone;
    private Circle steppingStone2;
    private Circle steppingStone3;
   
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        background = new Square();
        background.changeColor("black");
        background.moveVertical(-140);
        background.moveHorizontal(-135);
        background.changeSize(500);
        background.makeVisible();
        
        floor = new Square();
        floor.changeColor("blue");
        floor.moveVertical(140);
        floor.moveHorizontal(-220);
        floor.changeSize(500);
        floor.makeVisible();
        
        wall = new Square();
        wall.moveVertical(40);
        wall.changeSize(60);
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.changeSize(90);
        wall2.moveHorizontal(40);
        wall2.moveVertical(40);
        wall2.changeColor("red");
        wall2.makeVisible();
        
        door = new Square();
        door.changeColor("magenta");
        door.moveHorizontal(60);
        door.moveVertical(80);
        door.changeSize(40);
        door.makeVisible();
        
        doorArch = new Circle();
        doorArch.changeColor("black");
        doorArch.moveHorizontal(95);
        doorArch.moveVertical(85);
        doorArch.changeSize(40);
        doorArch.makeVisible();
        
        steppingStone = new Circle();
        steppingStone.changeColor("yellow");
        steppingStone.moveHorizontal(145);
        steppingStone.moveVertical(95);
        steppingStone.changeSize(40);
        steppingStone.makeVisible();
        
        steppingStone2 = new Circle();
        steppingStone2.changeColor("blue");
        steppingStone2.moveHorizontal(165);
        steppingStone2.moveVertical(95);
        steppingStone2.changeSize(40);
        steppingStone2.makeVisible();
        
        steppingStone3 = new Circle();
        steppingStone3.changeColor("magenta");
        steppingStone3.moveHorizontal(185);
        steppingStone3.moveVertical(95);
        steppingStone3.changeSize(40);
        steppingStone3.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(60);
        window.makeVisible();


        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("red");
        sun2.slowMoveHorizontal(40);
        sun2.moveHorizontal(190);
        sun2.moveVertical(-10);
        sun2.changeSize(75);
        sun2.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("white");
        roof.changeSize(50, 140);
        roof.moveHorizontal(20);
        roof.moveVertical(25);
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeColor("white");
        roof2.changeSize(50, 140);
        roof2.moveHorizontal(40);
        roof2.moveVertical(25);
        roof2.makeVisible();
        
        roof3 = new Triangle();
        roof3.changeColor("white");
        roof3.changeSize(70, 160);
        roof3.moveHorizontal(90);
        roof3.moveVertical(25);
        roof3.makeVisible();
        
        grass = new Square();
        grass.changeSize(200);
        grass.moveHorizontal(0);
        grass.moveVertical(120);
        grass.changeColor("green");
        grass.makeVisible();

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
