import java.util.Scanner;

public class Calculo extends Figuras {

    public Calculo() {

    }

    public Calculo(int area, int base, int altura, double PI, int radio, String figura) {
        super(area, base, altura, PI, radio, figura);
    }
    @Override
    public void Eleccion(){
        Scanner input=new Scanner(System.in);
        System.out.println("Que figura desea ? 1.Triangulo,  2.Rectángulo,  3.Círculo,  4.Ninguno");
        int figura=input.nextInt();
        switch(figura){
            case 1:
                System.out.println("Ingrese el valor de la base");
                base=input.nextInt();
                System.out.println("Ingrese el valor de la altura");
                altura=input.nextInt();

                System.out.println("triangulo" + "\n" +"los valores de la operación son: base="+ base+ "*" + "valor de la altura:" + altura + "/2");
                area=(base*altura)/2;
break;
            case 2:
                System.out.println("Ingrese el valor de la base");
                base=input.nextInt();
                System.out.println("Ingrese el valor de la altura");
                altura=input.nextInt();
                System.out.println("Rectangulo" + "\n" +"los valores de la operación son:  base" + base + "* altura" + altura);
                area=(base*altura);
                        break;

                case 3:
                    System.out.println("círculo" + "\n" +"los valores de la operación son: radio" + radio + "elevado al cuadrado, multiplicado por PI: "+PI);
                    area=(int)(Math.pow(radio,2)*PI);
                    break;

                    case 4:
                        System.out.println("FIN");

    }
}

@Override
public void area(){
    System.out.println ("el resultado del area es : " + area);}
}