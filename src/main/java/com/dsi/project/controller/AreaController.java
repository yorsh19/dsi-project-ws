package com.dsi.project.controller;

import org.springframework.web.bind.annotation.*;

import com.dsi.project.service.AreaService;

@RestController
@RequestMapping("/areas")
@CrossOrigin("*")
public class AreaController {
    private final AreaService areaService;

    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @GetMapping("/{id}")
    public Object getArea(@PathVariable String id) {
        return areaService.getArea(id);
    }

    @GetMapping
    public Object getAllAreas() {
        return areaService.getAllAreas();
    }
}
