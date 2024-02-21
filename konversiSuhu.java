public class konversiSuhu {
    public static void main(String[] args) {
       
        Double reamur = 50.00;

        Double celcius = 5.00/4 * reamur;
        Double fahrenheit = 9.00/5 * celcius + 32;
        Double kelvin = celcius + 273;

        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Kelvin:" + kelvin);
    }
}
