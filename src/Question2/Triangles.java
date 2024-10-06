package Question2;

public class Triangles {
    public int side1;
    public int side2;
    public int side3;

    public void setSide1 (int value1){
        if (value1 >0){
            this.side1 = value1;
        }else{
            System.out.println(" Side is positive!");  
            side1 =0;        
        }
    }
    public int getSide1 (){
        return side1;
    }

    public void setSide2 (int value2){
        if (value2 >0){
            this.side2 = value2;
        }else{
            System.out.println(" Side is positive!");    
            side2 = 0;      
        }
    }

    public int getSide2 (){
        return side2;
    }

    public void setSide3 (int value3){
        if (value3 >0){
            this.side3 = value3;
        }else{
            System.out.println(" Side is positive!");    
            side3 = 0;     
        }
    }

    public int getSide3 (){
        return side3;
    }


    public Triangles ( int side1, int side2, int side3 ){
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public void VerifyTriangles (){
        if ( side1 <= 0 || side2 <= 0 || side3 <=0){
            System.out.println(" Not Triangle\n");
        }
        else if (side1 == side2 && side2 == side3){
            System.out.println(" Equilateral Triangle\n");
        } else if (side1==side2&&side1!=side3||side2==side3&&side2!=side1||side1==side3&&side1!=side2){
            System.out.println(" Isosceles Triangle\n");
        } else { 
            System.out.println(" Scalene Triangle\n");
        }
    }
    public static void main(String[] args){
        Triangles tri1 = new Triangles(3,3,3);
        tri1.VerifyTriangles();
        Triangles tri2 = new Triangles(2,3,3);
        tri2.VerifyTriangles();
        Triangles tri3 = new Triangles(0,3,3);
        tri3.VerifyTriangles();
        Triangles tri4 = new Triangles(1,2,3);
        tri4.VerifyTriangles();
    }
}
