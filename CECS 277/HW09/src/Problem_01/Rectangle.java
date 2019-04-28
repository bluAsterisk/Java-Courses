package Problem_01;
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int temp){
        this.width = temp;
    }
    public void setHeight(int temp){
        this.height = temp;
    }
}