package ContainerLibrary.Iterators;
import ContainerLibrary.Exception.OurIndexOutOfBoundsException;

/** Iteratore che consente la rimozione dell'elemento in una posizione fissata (si suppone che la collezione sia indicizzabile).
 * Viene lanciata l'OurIndexOutOfBoundsException se l'indice &egrave fuori dalla lista.
 * @param <T> tipo degli elementi su cui si itera.
 */

public interface OurListIteratorHeavy<T> extends IteratorHeavy<T>, OurJumpListIterator<T> {

    /**Metodo che consente la rimozione di un elemento in una posizione prefissata.
     *
     * @param index indice dell'elemento da rimuovere
     * @return oggetto nella posizione index se esiste, altrimenti viene lanciata una eccezione.
     * @throws OurIndexOutOfBoundsException se l'indice &egrave fuori dalla lista.
	 */
    T removeIndex(int index) throws OurIndexOutOfBoundsException;


}
