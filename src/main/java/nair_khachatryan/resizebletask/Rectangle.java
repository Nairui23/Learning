package nair_khachatryan.resizebletask;

public class Rectangle implements Resizable{
    public int resizeWidth(int width){
        int resizedWidth= width + 10;
        return resizedWidth;
    }

    public int resizeHight(int hight){
       int resizedHight = hight + 20;
       return resizedHight;
    }

}
