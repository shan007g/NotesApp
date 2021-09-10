package com.example.notes;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("Insert into notes (contents) Values ('new note')")
    void create();

    @Query("Select * from notes")
    List<Note> getAllNotes();

    @Query("Update notes set contents = :contents where id = :id")
    void save(String contents, int id);
}
