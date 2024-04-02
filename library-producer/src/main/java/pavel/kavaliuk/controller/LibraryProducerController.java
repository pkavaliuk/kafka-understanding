package pavel.kavaliuk.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pavel.kavaliuk.domain.LibraryEvent;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@Slf4j
public class LibraryProducerController {

    @PostMapping(value = "/v1/library-event", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public LibraryEvent postMethodName(@RequestBody LibraryEvent entity) {
        log.info("POST libraryEvent [{}]", entity);
        return entity;
    }

}
