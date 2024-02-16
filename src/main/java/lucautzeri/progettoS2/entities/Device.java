package lucautzeri.progettoS2.entities;

import jakarta.persistence.*;
import lombok.*;
import lucautzeri.progettoS2.enums.Status;
import lucautzeri.progettoS2.enums.Type;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue
    private UUID deviceId;
    private Type type;
    private Status status;
    @ManyToOne
    private Worker worker;
}
