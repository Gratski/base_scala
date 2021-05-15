package com.dalbotinc.artists.repository

import com.dalbotinc.artists.model.Recruiter
import org.springframework.data.repository.CrudRepository

import java.util.UUID

trait RecruiterRepository extends CrudRepository[Recruiter, UUID] {

}
