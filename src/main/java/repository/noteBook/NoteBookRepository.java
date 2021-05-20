package repository.noteBook;

import Exeptions.noteBook.NoteBookDeleteException;
import Exeptions.noteBook.NoteBookUpdateException;
import model.noteBook.NoteBook;

import java.util.List;

public interface NoteBookRepository {
    NoteBook save(NoteBook noteBook);
    NoteBook update(NoteBook noteBook) throws NoteBookUpdateException;
    NoteBook delete(NoteBook noteBook) throws NoteBookDeleteException;
    NoteBook findById(int id);
    List<NoteBook> getAll();
}
