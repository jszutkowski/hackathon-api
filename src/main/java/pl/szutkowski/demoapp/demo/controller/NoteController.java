package pl.szutkowski.demoapp.demo.controller;

import org.springframework.web.bind.annotation.*;
import pl.szutkowski.demoapp.demo.exception.ResourceNotFoundException;
import pl.szutkowski.demoapp.demo.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import pl.szutkowski.demoapp.demo.repository.NoteRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@RestController
public class NoteController {
    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        System.out.println("aa");
        return noteRepository.findAll();
    }

    @PostMapping("/add")
    public Note createNote(@Valid @RequestBody Note note) {
//        return note;
//        note.setId((long) 1);
        return noteRepository.save(note);
    }

    @GetMapping("/note/{id}")
    public Note get(@PathVariable(value = "id") Long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", id));
    }


}
