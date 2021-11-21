package org.example.mappers;

import org.example.data.AlmacenDto;
import org.example.entity.Almacen;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AlmacenMapper {

    AlmacenMapper INSTANCE = Mappers.getMapper(AlmacenMapper.class);

    AlmacenDto AlmacenToAlmacenDto(Almacen almacen);

    Almacen AlmacenDtoToAlmacen(AlmacenDto almacenDto);

    List<AlmacenDto> AlmacenListToAlmacenDtoList(List<Almacen> almacenes);

    List<Almacen> AlmacenDtoListToAlmacenList(List<AlmacenDto> almacenesDtos);



}