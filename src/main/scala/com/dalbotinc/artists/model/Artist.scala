package com.dalbotinc.artists.model

import javax.persistence.Entity

@Entity
class Artist(
             email: String,
             password: String,
             name: String,
             phoneNumber: String,
             confirmedEmail: Boolean,
             confirmedPhone: Boolean,
             accountState: UserStatus.Status
           ) extends User (email, password, name, phoneNumber, confirmedEmail,
  confirmedPhone, accountState
            ) {

}
