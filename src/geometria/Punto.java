
package geometria;


public class Punto {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto(){
        this.x=0;
        this.y=0;
    }
    
    public Punto(Punto p){
        this.x = p.x;
        this.y = p.y;
    }
    public void desplazar(int incX, int incY){
        this.x += incX;
        this.y += incY;
    }
}
