package Java_week3_mitali;

public class Programme_15_wall {
    //Instance variables
    double width;
    double height;

    //default Constructor
    public Programme_15_wall() {

    }

    //Parameterized Constructor
    public Programme_15_wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Get width method
    public double getWidth() {
        return width;
    }

    //get Height method
    public double getHeight() {
        return height;
    }

    //set width method
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;

        } else {
            this.width = width;
        }
    }

    //set height method
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //get Area method
    public double getArea() {
        return (getHeight() * getWidth());
    }

    // main method
    public static void main(String[] args) {
        Programme_15_wall wall = new Programme_15_wall(5, 4);
        System.out.println(("area=" + wall.getArea()));
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area=" + wall.getArea());
    }
}
