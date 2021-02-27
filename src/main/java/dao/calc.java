
package dao;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "calc")
@RequestScoped
public class calc {

private double num01;
private double num02;
private double result;
private String opcion;

    public double getNum01() {
        return num01;
    }

    public void setNum01(double num01) {
        this.num01 = num01;
    }

    public double getNum02() {
        return num02;
    }

    public void setNum02(double num02) {
        this.num02 = num02;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

   public String calcular(){
   calculadora c =new calculadora();
   
    switch(opcion){
                case "Sumar":
                    setResult(c.sumar(num01, num02));
                    break;
                case "Restar":
                    setResult(c.restar(num01, num02));
                    break;
                case "Multiplicar":
                    setResult(c.multiplicar(num01, num02));
                    break;
                case "Dividir":
                    setResult(c.dividir(num01, num02));
                    break;
                default:
                    break;
           }
    return "resultado";
   } 
}
