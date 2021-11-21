package org.example.ports.spi;

import org.example.data.AlmacenDto;

import java.util.List;

public interface AlmacenPersistencePort {

    AlmacenDto addAlmacen(AlmacenDto almacenDto);

    List<AlmacenDto> getAlmacenes();
}
