public class Principal {
    public static void main(String[] args){
        Figura figura1 = new Circulo("vermelho",5);
        Figura figura2 = new Retangulo("roxo",3,5);
        System.out.println("A area do circulo é: "+figura1.area()+ " "+figura1.cor);
        System.out.println("A area do circulo é: "+figura2.area()+ " "+figura2.cor);
    }
}
