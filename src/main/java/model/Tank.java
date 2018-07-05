
package model;
import java.awt.image.BufferedImage;

public class Tank extends Sprite implements Drawable
{
    // Orientation is for rotating the tank. It can be between 0 and 360, you know full circle;
    private String              bulletType;
    private BufferedImage       tankBase;
    private BufferedImage       tankCannon;
    private String              description;
    private boolean             driving;
    private Collision           collision;



    public Tank(String tankBase, String tankCannon, String bulletType, String description, double x, double y, double rotation, Constraint constraint, Collision collision)
    {
        super(x, y, rotation, constraint, collision);
        this.tankBase           = loadImage(tankBase);
        this.tankCannon         = loadImage(tankCannon);
        this.bulletType         = bulletType;
        this.description        = description;
        this.driving            = false;
    }

// TODO: Broken, and should not work for now. Remove?
//    public Tank(String image, String description, int x, int y)
//    {
//        this(image, null, description, x, y, 0.0, null);
//    }

    public int getWidth() { return tankBase.getWidth(); }
    public int getHeight() { return tankBase.getHeight(); }
    @Override
    public BufferedImage getImage() { return tankBase; }
    public String getBulletType() { return bulletType; }
//    @Override
//    public Constraint getConstraint() { return constraint; }

    public void setIsDriving(boolean state) { this.driving = state; }

    public BufferedImage getTankBase() { return tankBase; }
    public BufferedImage getTankCannon() { return tankCannon; }
    public boolean isDriving() { return driving; }



}