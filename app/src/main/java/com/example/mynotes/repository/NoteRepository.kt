package com.example.mynotes.repository

import com.example.mynotes.database.NoteDatabase
import com.example.mynotes.model.Note

class NoteRepository(private val db: NoteDatabase) {
    suspend fun insertNote(note: Note) = db.getNoteDOA().insertNote(note)
    suspend fun deletetNote(note: Note) = db.getNoteDOA().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDOA().updateNote(note)

    fun getAllNotes() = db.getNoteDOA().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDOA().searchNote(query)
}