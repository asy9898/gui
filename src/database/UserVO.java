package database;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
	private int no;
	private String name;
	private Date birthday;
	private String address;

}
