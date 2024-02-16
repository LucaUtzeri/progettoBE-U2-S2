package lucautzeri.progettoS2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    private Device device;
}
