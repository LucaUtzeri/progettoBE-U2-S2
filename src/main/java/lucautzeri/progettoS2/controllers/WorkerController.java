package lucautzeri.progettoS2.controllers;

import lucautzeri.progettoS2.entities.Worker;
import lucautzeri.progettoS2.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    @Autowired
    private WorkerService workerService;


    @GetMapping
    public List<Worker> getAllWorkers(){
        return this.workerService.getWorkers();
    }

    @PostMapping
    public Worker saveWorker(@RequestBody Worker newWorker){
        return this.workerService.saveWorker(newWorker);
    }
}
