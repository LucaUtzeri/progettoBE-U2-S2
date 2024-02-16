package lucautzeri.progettoS2.services;

import lucautzeri.progettoS2.entities.Worker;
import lucautzeri.progettoS2.repositories.WorkerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerDAO workerDAO;


    public Worker saveWorker(Worker newWorker){
        return workerDAO.save(newWorker);
    }

    public List<Worker> getWorkers(){return workerDAO.findAll();}
}
