public class Cuenta {
    private String nombreDelTitular;
    private double saldoDeCuenta;
    private long numeroDeCuenta;

    public Cuenta(String nombreDelTitular, double saldoDeCuenta){
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = (long) (Math.random() * 10000000000L);//Se agrega la L para que lo reconozca como un long
    }

    //Metodos get para obtener el saldo de la cuenta y los datos generales
    public double getSaldoCuenta(){
        return this.saldoDeCuenta;
    }

    public String getDatosCuenta(){
        return "Nombre del titular: " + this.nombreDelTitular + "\nSaldo de la cuenta: " + this.saldoDeCuenta + "\nNúmero de cuenta: " + this.numeroDeCuenta;
    }

    //Metodo para ingresar una cantidad a la cuenta
    public void setIngreso(double cantidad){
        this.saldoDeCuenta += cantidad;
        System.out.println("Cuenta recargada correctamente");
    }

    //Metodo para retirar una cantidad de la cuenta
    public void setRetiro(double cantidad){
        if (this.saldoDeCuenta - cantidad >= 0){
            saldoDeCuenta -= cantidad;
            System.out.println("Retiro realizado con exito");
        } else {
            System.out.println("Saldo insuficiente para el retiro solicitado, su saldo actual es de " +  this.saldoDeCuenta);
        }
    }

}
