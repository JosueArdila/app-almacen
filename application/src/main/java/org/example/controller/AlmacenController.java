package org.example.controller;

import org.example.data.AlmacenDto;
import org.example.ports.api.AlmacenServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/almacen")
public class AlmacenController {

    @Autowired
    private AlmacenServicePort almacenServicePort;

    @PostMapping("/add")
    public AlmacenDto addAlmacen(@RequestBody AlmacenDto almacenDto) {
        return almacenServicePort.addAlmacen(almacenDto);
    }

    @GetMapping("/get")
    public List<AlmacenDto> getAlmacenesDto() {
        return almacenServicePort.getAlmacenes();
    }

}
