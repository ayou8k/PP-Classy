package enset.pip.virtualclass.exceptions;

public class CategorieNotFoundException extends RuntimeException {
    public CategorieNotFoundException(Long id) {
        super("Could not find categorie : " + id);
    }
}
