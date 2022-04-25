package freecode.notes.app.listeners;

import freecode.notes.app.entities.Note;

public interface InterAdListener {
    void onClick(int position, Note note, String type);
}
