package lucautzeri.progettoS2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "workers")
public class Worker {
    @Id
    @GeneratedValue
    private UUID workerId;
    private String username;
    private String name;
    private String surname;
    private String email;
    @OneToMany
    private List<Device> deviceList;
}
