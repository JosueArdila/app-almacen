package org.example.service;

import org.example.data.AlmacenDto;
import org.example.ports.api.AlmacenServicePort;
import org.example.ports.spi.AlmacenPersistencePort;

import java.util.List;

public class AlmacenServiceImpl implements AlmacenServicePort {

    private AlmacenPersistencePort almacenPersistencePort;

    public AlmacenServiceImpl(AlmacenPersistencePort almacenPersistencePort) {
        this.almacenPersistencePort = almacenPersistencePort;
    }

    public AlmacenDto addAlmacen(AlmacenDto almacenDto) {
        return almacenPersistencePort.addAlmacen(almacenDto);
    }

    public List<AlmacenDto> getAlmacenes() {
        return almacenPersistencePort.getAlmacenes();
    }
}
