package com.bk.playground.controller.api;

import com.bk.playground.controller.request.ImmigrantRequest;
import com.bk.playground.dto.mapper.ImmigrantRequest2ModelDTOMapper;
import com.bk.playground.exceptions.ImmigrantNotFoundException;
import com.bk.playground.repository.ImmigrantRepository;
import com.bk.playground.service.ImmigrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImmigrantController {

    @Autowired
    private ImmigrantService service;
    private ImmigrantRepository immigrantRepository;
    public ImmigrantController(ImmigrantService service) {
        this.service = service;
    }

    @PostMapping(name = "CreateImmigrantRecord", value = "/immigrants")
    public ResponseEntity createImmigrantRecord (@RequestBody ImmigrantRequest request) {
        boolean recordCreated = service.createImmigrantRecord(new ImmigrantRequest2ModelDTOMapper().mapToModel(request));
        boolean messageSent = service.sendImmigrantMessage(new ImmigrantRequest2ModelDTOMapper().mapToModel(request));
        if (recordCreated && messageSent) {
            return new ResponseEntity(HttpStatus.CREATED);
        }
        else
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(name = "GetImmigrantRecord", value = "/immigrants/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getImmigrantRecord(@PathVariable("id") String id) {
        if (!immigrantRepository.getImmigrantRecord(Integer.valueOf(id))) {
            throw new ImmigrantNotFoundException();
        }
        return new ResponseEntity<>("Immigrant found", HttpStatus.FOUND);
    }
}
