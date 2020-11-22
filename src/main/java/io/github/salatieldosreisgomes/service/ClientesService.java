package io.github.salatieldosreisgomes.service;

import io.github.salatieldosreisgomes.model.Cliente;
import io.github.salatieldosreisgomes.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    private ClientesRepository repository;

    @Autowired
    public void ClienteService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validaCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validaCliente(Cliente cliente){
        //faz as validações
    }
}
