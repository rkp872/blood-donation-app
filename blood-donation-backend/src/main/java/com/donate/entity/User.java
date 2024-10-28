package com.donate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  Long id;
   private String name;
   private String email;
   private String password;
   private String role;

   @ManyToOne
   @JoinColumn(name = "blood_group_id")
   private BloodGroup bloodGroup;

   @ManyToOne
   @JoinColumn(name = "location_id")
   private Location location; 
}
