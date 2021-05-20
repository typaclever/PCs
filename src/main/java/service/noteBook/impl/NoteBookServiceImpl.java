package service.noteBook.impl;

import Exeptions.noteBook.NoteBookDeleteException;
import Exeptions.noteBook.NoteBookUpdateException;
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
        try {
            return noteBookRepository.delete(noteBook);
        } catch (NoteBookDeleteException e) {
            e.printStackTrace();
        }
        return noteBook;
    }

    @Override
    public NoteBook updateNoteBook(NoteBook noteBook) {
        try {
            return noteBookRepository.update(noteBook);
        } catch (NoteBookUpdateException e) {
            e.printStackTrace();
        }
        return noteBook;
    }

    @Override
    public List<NoteBook> getAllNoteBooks() {
        return noteBookRepository.getAll();
    }
}
