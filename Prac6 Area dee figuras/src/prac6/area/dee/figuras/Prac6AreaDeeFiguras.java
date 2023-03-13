
package prac6.area.dee.figuras;
/**
 *
 * @author Diego Armando Campos Valverde Grupo:SC
 */
public class Prac6AreaDeeFiguras {
    double area;
   public void circulo(){
       double pi= 3.1416;
       int radio= 10;
       area= (pi*(radio*radio));
            System.out.println("El area del circulo es : "+ area);
   }
      public void cuadrado(){
       
       byte lado= 10;
       area= (lado*lado);
       System.out.println("El Area del cuadrado es " + area);
   }
   public void triangulo (){
        short base= 5;
        short altura= 10;
        area= ((base*altura)/2);
        System.out.println("El are del triangulo es: " + area);
   }
    public void rectangulo (){
        byte largo= 8;
        byte ancho= 5;
        area=(largo* ancho);
          System.out.println("El area del rectangulo es: " + area);
    }
    public void esfera () {
        double pi=3.1416;
        short radio= 10;
        area= ((4*pi)*(2*radio));
        System.out.println("El area de la esfera es: " + area );
    }
    public void cubo(){
        int areadeuncuadrado= 5;
        area=(6*areadeuncuadrado);
        System.out.println("El area del cubo es: " + area );
    }
    public static void main(String[] args) {
       Prac6AreaDeeFiguras circulo = new Prac6AreaDeeFiguras ();
               circulo.circulo();
       Prac6AreaDeeFiguras cuadrado = new Prac6AreaDeeFiguras();
               cuadrado.cuadrado();
       Prac6AreaDeeFiguras triangulo = new Prac6AreaDeeFiguras();
               triangulo.triangulo();
       Prac6AreaDeeFiguras rectangulo = new Prac6AreaDeeFiguras();
               rectangulo.rectangulo();
       Prac6AreaDeeFiguras esfera = new Prac6AreaDeeFiguras();
               esfera.esfera();
       Prac6AreaDeeFiguras cubo =new Prac6AreaDeeFiguras();
               cubo.cubo();
               
 
               

               
    }
    
}
