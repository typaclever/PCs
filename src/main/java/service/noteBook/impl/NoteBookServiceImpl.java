package service.noteBook.impl;

import lombok.Data;
import lombok.NonNull;
import model.noteBook.NoteBook;
import repository.noteBook.NoteBookRepository;
import service.noteBook.NoteBookService;

import java.util.List;

@Data
public class NoteBookServiceImpl implements NoteBookService {
    @NonNull
    private NoteBookRepository noteBookRepository;

    @Override
    public NoteBook findNoteBook(int id) {
        return noteBookRepository.findById(id);
    }

    @Override
    public NoteBook saveNoteBook(NoteBook noteBook) {
        return noteBookRepository.save(noteBook);
    }

    @Override
    public NoteBook deleteNoteBook(NoteBook noteBook) {
        return noteBookRepository.delete(noteBook);
    }

    @Override
    public NoteBook updateNoteBook(NoteBook noteBook) {
        return noteBookRepository.update(noteBook);
    }

    @Override
    public List<NoteBook> getAllNoteBooks() {
        return noteBookRepository.getAll();
    }
}
