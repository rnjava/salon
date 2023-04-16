package man.salon.api.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Slot {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private Timestamp confirmedAt;

    @Column(nullable = true)
    private Timestamp lockedAt;

    @Column(nullable = false)
    private Timestamp slotFor;

    @Column(nullable = false)
    private Integer status;

    @Column(nullable = true, length = 255)
    private String stylistName;

    @Column(nullable = true)
    private Long selectedServiceId;
}
