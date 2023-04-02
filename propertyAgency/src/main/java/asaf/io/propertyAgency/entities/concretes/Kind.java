package asaf.io.propertyAgency.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "kinds")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Kind {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int kindId;
	
	@Column(name = "kind")
	private String kind;
}
