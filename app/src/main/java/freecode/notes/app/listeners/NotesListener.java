package freecode.notes.app.listeners;

import freecode.notes.app.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
