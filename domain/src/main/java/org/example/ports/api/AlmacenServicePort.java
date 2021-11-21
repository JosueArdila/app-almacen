package org.example.ports.api;

import org.example.data.AlmacenDto;

import java.util.List;

public interface AlmacenServicePort {

    AlmacenDto addAlmacen(AlmacenDto almacenDto);

    List<AlmacenDto> getAlmacenes();
}
