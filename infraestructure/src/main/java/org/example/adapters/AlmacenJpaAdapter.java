package org.example.adapters;

import org.example.data.AlmacenDto;
import org.example.entity.Almacen;
import org.example.mappers.AlmacenMapper;
import org.example.ports.spi.AlmacenPersistencePort;
import org.example.repository.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenJpaAdapter implements AlmacenPersistencePort {

    @Autowired
    private AlmacenRepository almacenRepository;

    @Override
    public AlmacenDto addAlmacen(AlmacenDto almacenDto) {
        Almacen almacen = AlmacenMapper.INSTANCE.AlmacenDtoToAlmacen(almacenDto);
        Almacen almacenSaved = almacenRepository.save(almacen);
        return AlmacenMapper.INSTANCE.AlmacenToAlmacenDto(almacenSaved);
    }

    @Override
    public List<AlmacenDto> getAlmacenes() {
        List<Almacen> almacenes = almacenRepository.findAll();
        return AlmacenMapper.INSTANCE.AlmacenListToAlmacenDtoList(almacenes);
    }
}
