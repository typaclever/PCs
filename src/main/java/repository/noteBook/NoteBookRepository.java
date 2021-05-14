package repository.noteBook;

import model.noteBook.NoteBook;

public interface NoteBookRepository {
    NoteBook save(NoteBook noteBook);
    NoteBook update(NoteBook noteBook);
    NoteBook delete(NoteBook noteBook);
    NoteBook findById(int id);
}
