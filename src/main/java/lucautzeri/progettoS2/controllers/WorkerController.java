package lucautzeri.progettoS2.controllers;

import lucautzeri.progettoS2.entities.Worker;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    @PostMapping
    public Worker saveWorker(@RequestBody Worker newWorker){
        return this.saveWorker(newWorker);
    }
}
