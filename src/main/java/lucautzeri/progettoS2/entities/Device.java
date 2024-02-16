package lucautzeri.progettoS2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucautzeri.progettoS2.enums.Status;
import lucautzeri.progettoS2.enums.Type;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue
    @ManyToOne
    private UUID deviceId;
    private Type type;
    private Status status;
}
