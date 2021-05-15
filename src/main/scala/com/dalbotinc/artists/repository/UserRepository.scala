package com.dalbotinc.artists.repository

import com.dalbotinc.artists.model.User
import org.springframework.data.repository.CrudRepository

import java.util.UUID

trait UserRepository extends CrudRepository[User, UUID] {

}
