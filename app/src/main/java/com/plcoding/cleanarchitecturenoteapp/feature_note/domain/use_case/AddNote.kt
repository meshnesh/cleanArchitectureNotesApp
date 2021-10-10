package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        when {
            note.title.isBlank() -> {
                throw InvalidNoteException("The title of the not can not be empty.")
            }
            note.content.isBlank() -> {
                throw InvalidNoteException("The content of the not can not be empty.")
            }
            else -> repository.insertNote(note)
        }
    }
}