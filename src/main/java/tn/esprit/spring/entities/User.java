package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tn.esprit.spring.entities.Role;
import lombok.*;
@Entity

@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails , Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	@Enumerated(EnumType.STRING)	
    private Role role;
	
	private String email;
	private String password;
	private String num;
	private Boolean locked = false;
	private Boolean enabled = false;
	private String favoris;


	
	//relation
		@OneToMany(cascade = CascadeType.ALL)
		private Set<Annonce> Annonce;
		@OneToMany(cascade = CascadeType.ALL)
		private Set<Reclamation> Reclamation;
		@ManyToMany(cascade = CascadeType.ALL)
		private Set<Contrat> Contrat;
		@OneToMany(cascade = CascadeType.ALL)
		private Set<Credit> Credit;
		@OneToMany(cascade = CascadeType.ALL)
		private Set<SouscriptionAssurance> SouscriptionAssurance;

		@JsonIgnore
		@Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        SimpleGrantedAuthority authority =
	                new SimpleGrantedAuthority(role.name());
	        return Collections.singletonList(authority);
	    }
	    @Override
	    public String getPassword() {
	        return password;
	    }
		@Override
		public boolean isAccountNonExpired() {
			return true;
		}
		  @Override
		    public String getUsername() {
		        return email;
		    }
		  
		 
		  
		  
		@Override
		public boolean isAccountNonLocked() {
			 return false;
		}
		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}
		@Override
		public boolean isEnabled() {
			 return enabled;
		}
		
		  
		    public String getEmail() {
		        return email;
		    }
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public Role getRole() {
				return role;
			}
			public void setRole(Role role) {
				this.role = role;
			}
			public String getNum() {
				return num;
			}
			public void setNum(String num) {
				this.num = num;
			}
			public Boolean getLocked() {
				return locked;
			}
			public void setLocked(Boolean locked) {
				this.locked = locked;
			}
			public Boolean getEnabled() {
				return enabled;
			}
			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}
			public String getFavoris() {
				return favoris;
			}
			public void setFavoris(String favoris) {
				this.favoris = favoris;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public User(Long id, String username, Role role, String email, String password, String num, Boolean locked,
					Boolean enabled, String favoris) {
				super();
				this.id = id;
				this.username = username;
				this.role = role;
				this.email = email;
				this.password = password;
				this.num = num;
				this.locked = locked;
				this.enabled = enabled;
				this.favoris = favoris;
			}
			
		
	
		
	
		
		
}
