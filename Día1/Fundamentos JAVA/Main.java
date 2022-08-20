class Main {
  public static void main(String[] args) {
    //variables java y asignando
    int edad = 6;
    //solo declarando (Tira error de que fue NO inicializada)
    int articulo;

    double precio = 15.2;
    boolean vivo = true;
    String nombreCompleto = "Ricardo Dulanto";
    String apellido = "Ramirez";

    int N1, N2, N3;
    double resultado; // PUEDE CAMBIAR

    final double igv = 0.18; //NO PUEDE CAMBIAR
    //igv = 0.10; //TIRA ERROR

    N1 = 2;
    N2 = 4;
    N3 = 6;

    resultado = N1+ N2+ N3;

    System.out.println(nombreCompleto +" "+ apellido);
    System.out.println(edad + " " + edad); // NO suma
    System.out.println(edad + edad); // suma
    System.out.println("Resultado = "+ resultado); 

    resultado = N1 * N2 * N3;
    System.out.println("Resultado = "+ resultado); 

    resultado = N1 - N2 - N3;
    System.out.println("Resultado = "+ resultado); 

    resultado = N2 / N1 * N3;
    System.out.println("Resultado = "+ resultado); 

    boolean res;
    res = N1 == N2;
    if (res)
    {
      System.out.println("Iguales");
      System.out.println(!res);
    }
    else
    {
      System.out.println(res);
    }

    N1 += 100; //N1 = N1 + 100;
  }
}