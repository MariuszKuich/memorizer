package pl.mariuszk.memorizer.note;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;
}
