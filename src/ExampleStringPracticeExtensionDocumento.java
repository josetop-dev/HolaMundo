import java.util.Scanner;
public class ExampleStringPracticeExtensionDocumento {
    public static void main(String[] args){
        char c = '.';
        String nombre = "nombre";
        String tipo = "";
        String pdf = "pdf";
        String docx = "docx";
        String jpeg ="jpeg";
        String png = "png";

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nombre del documento: ");
        nombre = keyboard.nextLine().trim();//Entrada normalizada
        System.out.println("Guardar como... ");
        System.out.println(pdf + " ---> Documento portátil");
        System.out.println(docx + " --> Documento de Microsoft Word");
        System.out.println(jpeg + " --> Imagen baja resolucion");
        System.out.println(png + " ---> Imagen alta resolucion");
        System.out.println("Tipo de archivo:");
        tipo = keyboard.nextLine().trim().toLowerCase();//Entrada normalizada
        boolean validacion = false;
        while (validacion == false){
            if(tipo.equals(pdf)||tipo.equals(docx)||tipo.equals(jpeg)||tipo.equals(png)){
                validacion = true;
            }else{
                System.out.println("Dato no valido ingreselo de nuevo:\n");
                tipo = keyboard.nextLine().trim().toLowerCase();//Entrada normalizada
            }
            /*Forma extendida
        if((tipo.equals("PDF"))){
            tipo = pdf;
            validacion = true;
        } else if((tipo.equals("DOCX"))){
            tipo = docx;
            validacion = true;
        } else if ((tipo.equals("JPEG"))) {
            tipo = jpeg;
            validacion = true;
        } else if ((tipo.equals("PNG"))) {
            tipo = png;
            validacion = true;
        } else{
            System.out.print("Dato no valido ingreselo de nuevo:\n");
            main(args); Llamar main(args) recursivamente es peligroso: puede causar StackOverflowError si el
            usuario falla muchas veces. Lo correcto es un bucle:
            System.exit(0);*/
        }
        StringBuilder documento = new StringBuilder();
        documento.append(nombre).append(c).append(tipo);//Construccion de la cadena final
        System.out.println("Documento = " + documento);//Impresion en consola de nombre completo + Extension
        System.out.println("Nombre del archivo = " + documento.substring(0,documento.lastIndexOf(".")));//Nombre del archivo
        System.out.println("Extension = " + documento.substring(documento.lastIndexOf(".")+1));//Extension
    }
}