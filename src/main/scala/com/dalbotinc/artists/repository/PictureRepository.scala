package com.dalbotinc.artists.repository

import com.dalbotinc.artists.model.Picture
import org.springframework.data.repository.CrudRepository

import java.util.UUID

trait PictureRepository extends CrudRepository[Picture, UUID] {

}
