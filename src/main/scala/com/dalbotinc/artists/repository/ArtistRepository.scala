package com.dalbotinc.artists.repository

import com.dalbotinc.artists.model.Artist
import org.springframework.data.repository.CrudRepository

import java.util.UUID

trait ArtistRepository extends CrudRepository[Artist, UUID] {

}
