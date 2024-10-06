package Question1;

public class Rectangle {
    public int width;
    public int height;



        public void setWidth ( int value1){

            if ( value1 >= 0 ){
                this.width = value1;
            } else{
                System.out.println(" Width value can't be negative!");
                this.width = 1;
            }
            
        }
            public int getWidth (){
                return width;
        }

        public void setHeight ( int value2 ){
            if ( value2 >= 0 ){
                this.height = value2;
            } else{
                System.out.println(" Height value can't be negative!");
                this.height =1;
            }
            
        }
            public int getHeight (){
                return height;
        }
    
        public Rectangle (int width, int height) {
            setWidth(width);
            setHeight(height);
        }
    
        public void displayRectangle(){
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }



    public static void main(String[] args){
        Rectangle rec1 = new Rectangle (7,2);
        rec1.displayRectangle();
        System.out.println("\n");
        Rectangle rec2 = new Rectangle (9,3);
        rec2.displayRectangle();
        System.out.println("\n");
        Rectangle rec3 = new Rectangle (10,4);
        rec3.displayRectangle();
        System.out.println("\n");
        Rectangle rec4 = new Rectangle (-1,8);
        rec4.displayRectangle();
        System.out.println("\n");
        Rectangle rec5 = new Rectangle (9,2);
        rec5.displayRectangle();
        System.out.println("\n");
}
}



