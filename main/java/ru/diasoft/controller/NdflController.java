package ru.diasoft.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.diasoft.service.NdflService;

import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping(value = "/ndfl", produces = MediaType.APPLICATION_JSON_VALUE)
public class NdflController {
    private final NdflService ndflService;

    public NdflController(NdflService ndflService) {
        this.ndflService = ndflService;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void executeById(@PathVariable("id") UUID id) throws IOException {
        ndflService.execById(id);
    }
}
