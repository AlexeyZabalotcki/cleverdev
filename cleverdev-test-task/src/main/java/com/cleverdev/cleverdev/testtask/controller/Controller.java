package com.cleverdev.cleverdev.testtask.controller;

import com.cleverdev.cleverdev.testtask.dao.ClientRepository;
import com.cleverdev.cleverdev.testtask.dao.NoteRepository;
import com.cleverdev.cleverdev.testtask.entity.Client;
import com.cleverdev.cleverdev.testtask.entity.Note;
import com.cleverdev.cleverdev.testtask.service.ImportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {

    private final ClientRepository clientRepository;
    private final NoteRepository noteRepository;
    private final ImportService service;

    @GetMapping("/import")
    public void imports (){
        service.importData();
    }

    @GetMapping("/clients")
    public List<Client> findAllClients(){
        return clientRepository.findAll();
    }

    @GetMapping("/notes")
    public List<Note> findAllNotes(){
        return noteRepository.findAll();
    }
}


