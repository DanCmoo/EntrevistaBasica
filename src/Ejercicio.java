import java.util.Arrays;

public class Ejercicio {
    public static String[][] basura(String[][] datos){
        String[] infoMes = datos[0];
        String[] oficina = datos[1]; // M o J
        int contOficina = 0;
        String[] principal = datos[2]; // Impar
        int contPrincipal = 0;
        String[] secundaria = datos[3]; // Par
        int contSecundaria = 0;
        int[] llegada = new int[4];
        int[] salida = new int[4];
        int diaMax = Integer.parseInt(infoMes[2]);
        int diaInicial = Integer.parseInt(infoMes[1]);
        int[] semana = {1,2,3,4,5,6,7};
        for(int i = 1; i <= diaMax; i++){
            if(i%2 == 1){
                String palabra = principal[contPrincipal];
                for(int j = 0; j < palabra.length(); j++){
                    switch(palabra.charAt(j)){
                        case 'r':
                            llegada[0]++;
                            break;
                        case 'v':
                            llegada[1]++;
                            break;
                        case 'b':
                            llegada[2]++;
                            break;
                        case 'a':
                            llegada[3]++;
                            break;
                    }

                }
                contPrincipal++;
            }
            if (i%2 == 0){
                String palabra = secundaria[contSecundaria];
                for(int j = 0; j < palabra.length(); j++){
                    switch(palabra.charAt(j)){
                        case 'r':
                            llegada[0]++;
                            break;
                        case 'v':
                            llegada[1]++;
                            break;
                        case 'b':
                            llegada[2]++;
                            break;
                        case 'a':
                            llegada[3]++;
                            break;
                    }

                }
                contSecundaria++;
            }
            if(i%7 == 2 || i%7 ==4){
                String palabra = oficina[contOficina];
                for(int j = 0; j < palabra.length(); j++){
                    switch(palabra.charAt(j)){
                        case 'r':
                            llegada[0]++;
                            break;
                        case 'v':
                            llegada[1]++;
                            break;
                        case 'b':
                            llegada[2]++;
                            break;
                        case 'a':
                            llegada[3]++;
                            break;
                    }

                }
                contOficina++;
            }
            if(i%3==0){
                salida = llegada.clone();
                llegada = new int[4];
            }
        }
        String[][] resultado = new String[2][4];

        resultado[0][0] = llegada[0] + "r";
        resultado[0][1] = llegada[1] + "v";
        resultado[0][2] = llegada[2] + "b";
        resultado[0][3] = llegada[3] + "a";
        resultado[1][0] = salida[0] + "r";
        resultado[1][1] = salida[1] + "v";
        resultado[1][2] = salida[2] + "b";
        resultado[1][3] = salida[3] + "a";



        return resultado;
    }
    public static int dia(String dia){
        switch (dia){
            case "L":
                return 1;
            case "M":
                return 2;
            case "X":
                return 3;
            case "J":
                return 4;
            case "V":
                return 5;
            case "S":
                return 6;
            case "D":
                return 7;
        }
        return 0;
    }
    public static void main(String[] args) {
        String[][] datos = {{"J","31","3"},{"rva","rb","bv","r"},{"va","rv","bb","rvr","b"},{"bb","vr","bva","vvr","rrv"}};
        String[][] solucion = basura(datos);
        System.out.println(Arrays.toString(solucion[0])+" "+Arrays.toString(solucion[1]));
    }
}
