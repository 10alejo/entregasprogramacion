package tareaexcepciones;

class BurradasNOException extends Exception {
    public BurradasNOException(String tpalabros) {
        super("Error no se permite lenguaje obsceno = "+  tpalabros);
    }
}
	

