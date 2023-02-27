/*Clase para manejar las entradas de un blog.
 * La clase se creó el 21/3/1999 por Ana López.
 * Esta es la versión 2.3
 */
public class EntradaBlogASM {
//separador es el carácter que separa ENTRADA DE del nombre del autor

public static char separador=':';
private int id;
private String texto;
private String autor;


    /**
     * @param id El numero de entrada
     * @param autor El autor de la entrada
     * @param texto El texto de la entrada
     * @throws IllegalArgumentException Si el numero es negativo lanza una excepcion
     */
public EntradaBlogASM(int id, String autor, String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
        }


    /**
     * @return La entrada del blog
     */
@Override
public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
        }

    /**
     * @return El número de la entrada
     */
public int getId(){
        return this.id;
        }

    /**
     * @return el texto completo de la entrada
     */
public String getTexto(){
        return this.texto;
        }

    /**
     * @return el nombre del autor de la entrada en mayúsculas
     */
public String getAutor(){
        return this.autor.toUpperCase();
        }

    /**
     * @return el nombre del autor. Ya no se usa. Mejor ver getAutor
     */
public String devuelveAutor(){
        return this.autor;
        }

    /**
     * @param args los argumentos de la linea de comandos
     */
public static void main(String[] args) {
        //Modificar.
        EntradaBlogASM e1=new EntradaBlogASM (3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
        }
        }
