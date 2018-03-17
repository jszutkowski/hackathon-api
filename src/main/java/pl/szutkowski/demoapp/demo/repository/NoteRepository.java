package pl.szutkowski.demoapp.demo.repository;

import pl.szutkowski.demoapp.demo.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long>{

}
