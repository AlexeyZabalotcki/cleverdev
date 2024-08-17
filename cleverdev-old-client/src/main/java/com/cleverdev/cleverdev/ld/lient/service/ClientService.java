package com.cleverdev.cleverdev.ld.lient.service;

import com.cleverdev.cleverdev.ld.lient.dto.ClientDto;
import com.cleverdev.cleverdev.ld.lient.dto.NoteDto;

import java.util.List;

public interface ClientService {

    List<ClientDto> findAll();
}
