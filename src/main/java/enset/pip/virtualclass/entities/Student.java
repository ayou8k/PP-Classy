package enset.pip.virtualclass.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Student {
	//F137318699
	@Id
	@Column(length = 10)
String Id;
	String FirstName;
	String LastName;
	@Email
	String Mail;
	@Size(min=10,max=13)
	String Tel;
	@OneToOne
	Diplomat Diplomes;
	
}
