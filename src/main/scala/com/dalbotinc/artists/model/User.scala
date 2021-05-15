package com.dalbotinc.artists.model
import java.util.UUID
import javax.persistence.{GeneratedValue, Id, MappedSuperclass}

@MappedSuperclass
abstract class User(
          var email: String,
          var password: String,
          var name: String,
          var phoneNumber: String,
          var confirmedEmail: Boolean,
          var confirmedPhone: Boolean,
          var accountState: UserStatus.Status
          ) {

  @Id
  @GeneratedValue
  var id: UUID = _

}
