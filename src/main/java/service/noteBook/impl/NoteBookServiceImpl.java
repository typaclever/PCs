package service.noteBook.impl;

import model.noteBook.NoteBook;
import repository.noteBook.NoteBookRepository;
import repository.noteBook.impl.NoteBookRepositoryImpl;
import service.noteBook.NoteBookService;

import java.util.List;

public class NoteBookServiceImpl implements NoteBookService {
    private NoteBookRepository noteBookRepository = new NoteBookRepositoryImpl();
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
