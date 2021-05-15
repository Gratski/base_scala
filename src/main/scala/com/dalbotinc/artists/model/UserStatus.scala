package com.dalbotinc.artists.model

object UserStatus extends Enumeration {
  type Status = Value
  val ACTIVE, BLOCKED, DELETED = Value
}
