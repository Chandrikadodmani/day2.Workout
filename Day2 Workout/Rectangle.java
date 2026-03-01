public class Rectangle {
    int length;
    int width;
    int area(){
        return (length*width);
    }
    public static void main(String[]args){
        Rectangle r=new Rectangle();
        r.length=5;
        r.width=6;
    System.out.println("area="+r.area());
    }
    
}
