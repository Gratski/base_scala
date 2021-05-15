package com.dalbotinc.artists.model

import java.util.{Date, UUID}
import javax.persistence.{Entity, GeneratedValue, Id}

@Entity
class Picture(var uri: String,
              var visible: Boolean, createdAt: Date, var updatedAt: Date) {

  @Id
  @GeneratedValue
  var id: UUID = _

}
