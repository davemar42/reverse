public class Main {
    public static void main(String[]args){
        String cadena="gordo";
        String nuevacadena="";
        for(int i=cadena.length()-1;i>=0;i--){
            nuevacadena=nuevacadena+cadena.charAt(i);

        }
        System.out.println(nuevacadena);
    }
}
