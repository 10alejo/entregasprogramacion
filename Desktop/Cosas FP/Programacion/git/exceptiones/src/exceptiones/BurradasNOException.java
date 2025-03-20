package exceptiones;


/**
 * Creamos la exception personalizada 
 * @param la exception y su mensaje
 */ 
class BurradasNOException extends Exception {
    public BurradasNOException(String tpalabros) {
        super("Error no se permite lenguaje obsceno = "+  tpalabros);
    }
}