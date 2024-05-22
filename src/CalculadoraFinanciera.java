public class CalculadoraFinanciera extends Calculadora {
    
    public CalculadoraFinanciera(){
        // super() es para llamar al constructor de la clase Calculadora
        super("Financiera");
    }

     /* crear un metodo que calcule el IVA de una cantidad de dinero (30%) 
     (que reciba una cantidad dinero y devuelva el IVA)
    */
    /*Metodo para calcular el IVA */
    public double calcularIVA(double cantidad) {
        double iva = cantidad * 0.3;
        return iva;
    }

    public static void main(String[] args) {
        
        CalculadoraFinanciera miCalculadora = new CalculadoraFinanciera();
        double CantidadDinero = 10000.0;
        double IVAcalculado = miCalculadora.calcularIVA(CantidadDinero);
        System.out.println("El IVA de $: "+CantidadDinero+ " Es: $"+IVAcalculado);


    }


   


    /* crear un metodo que agregue un aumento a una cantidad de dinero
     (que reciba la cantidad de dinero y el porcentaje que se va a aumentar
     y que devuelva la cantidad de dinero mas el aumento)
     */
}
