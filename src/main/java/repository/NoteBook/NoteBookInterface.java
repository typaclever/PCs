package repository.NoteBook;

import someModels.Notebook.NoteBook;

public interface NoteBookInterface {
    void save(NoteBook noteBook);
    void update(NoteBook noteBook);
    void delete(NoteBook noteBook);
    NoteBook findById(int id);
}
