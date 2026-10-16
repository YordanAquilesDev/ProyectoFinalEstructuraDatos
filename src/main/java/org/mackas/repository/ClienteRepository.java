package org.mackas.repository;
import  java.util.List;

import org.mackas.model.Cliente;;
public class ClienteRepository {

    public List<Cliente> findAll(){
        return List.of(
            new Cliente(),
            new Cliente(),
            new Cliente(),
            new Cliente()
        );
    }
    public Cliente findById(){
        return new Cliente();
    }




}
