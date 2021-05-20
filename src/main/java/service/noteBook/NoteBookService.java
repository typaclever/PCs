package service.noteBook;

import model.noteBook.NoteBook;

import java.util.List;

public interface NoteBookService {
    NoteBook findNoteBook(int id);
    NoteBook saveNoteBook(NoteBook noteBook);
    NoteBook deleteNoteBook(NoteBook noteBook);
    NoteBook updateNoteBook(NoteBook noteBook);
    List<NoteBook> getAllNoteBooks();
}
