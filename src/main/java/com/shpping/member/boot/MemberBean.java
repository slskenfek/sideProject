package com.shpping.member.boot;



import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MemberBean {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, unique = true, length=50)
	private String uid;
	
	@Column(nullable = false, length=200)
	private String upw;
	
	@Column(nullable = false, unique = true, length=50)
	private String uemail;
	
	@CreationTimestamp
	private Date regdate;
	
	@UpdateTimestamp
	private Date updatedate;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="uid")
	private List<User> roles;
	
	
}
