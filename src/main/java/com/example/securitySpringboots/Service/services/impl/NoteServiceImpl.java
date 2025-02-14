package com.example.securitySpringboots.Service.services.impl;

import com.example.securitySpringboots.Entity.Notes;
import com.example.securitySpringboots.Repository.NotesRepository;
import com.example.securitySpringboots.Service.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NotesRepository noteRepository;

    @Override
    public Notes createNoteForUser(String username, String content) {
        Notes note = new Notes();
        note.setContent(content);
        note.setOwnerUsername(username);
        Notes savedNote = noteRepository.save(note);
        return savedNote;
    }

    @Override
    public Notes updateNoteForUser(Long noteId, String content, String username) {
        Notes note = noteRepository.findById(noteId).orElseThrow(()
                -> new RuntimeException("Note not found"));
        note.setContent(content);
        Notes updatedNote = noteRepository.save(note);
        return updatedNote;
    }

    @Override
    public void deleteNoteForUser(Long noteId, String username) {

        noteRepository.deleteById(noteId);
    }

    @Override
    public List<Notes> getNotesForUser(String username) {
        List<Notes> personalNotes = noteRepository
                .findByownerUsername(username);
        return personalNotes;
    }
}


