package com.example.exercicenotes.service

import com.example.exercicenotes.models.Etudiant
import com.example.exercicenotes.models.Epreuve

interface Service {

    fun creerEtudiant(etudiant: Etudiant): Unit

    fun creerEpreuve(epreuve: Epreuve): Unit
}

