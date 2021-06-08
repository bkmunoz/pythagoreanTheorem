public class PythagTheo{
    public Double calculateHypot(Double sideA, Double sideB){
        Double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return hypotenuse;
    }
}