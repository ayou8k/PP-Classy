package enset.pip.virtualclass.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor 
public class Diplomat {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long Id;
	@OneToOne(mappedBy="Diplomes")
	Student diplome;
	@NotNull
	String Name;//Diplomat Name : DUT , Licence etc ... 
	@NotNull
	String Filiere;//Genie Info , Licence ISI 
	@NotNull
	String Mention;//Bien , Tres Bien , Assez Bien , Passable
	@DateTimeFormat(iso = ISO.DATE)
	Date ObtentionDate;
	@Override
	public String toString() {
		return "Diplomat [Id=" + Id + ", Name=" + Name + ", Filiere=" + Filiere + ", Mention=" + Mention
				+ ", ObtentionDate=" + ObtentionDate + "]";
	}
	
}
