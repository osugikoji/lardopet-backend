package br.com.bonnepet.resource;

import br.com.bonnepet.dto.*;
import br.com.bonnepet.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/hosts")
public class HostResource {

    @Autowired
    private HostService hostService;

    @PostMapping("/insert")
    public ResponseEntity<Void> insertHost(@Valid @RequestBody NewHostDTO newHostDTO) {
        hostService.insertHost(newHostDTO);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HostDTO> getHost(@PathVariable Integer id) {
        HostDTO hostDTO = hostService.getHost(id);
        return ResponseEntity.ok(hostDTO);
    }

    @GetMapping()
    public ResponseEntity<List<HostDTO>> getAllHosts() {
        List<HostDTO> petList = hostService.getAllHosts();
        return ResponseEntity.ok(petList);
    }

    @PutMapping("/edit")
    public ResponseEntity<Void> editHost(@Valid @RequestBody EditHostDTO editHostDTO) {
        hostService.editHost(editHostDTO);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/rate")
    public ResponseEntity<Void> rateHost(@Valid @RequestBody RateDTO rateDTO) {
        hostService.rateHost(rateDTO);
        return ResponseEntity.noContent().build();
    }
}
