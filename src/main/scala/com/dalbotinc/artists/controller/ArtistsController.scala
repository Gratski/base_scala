package com.dalbotinc.artists.controller

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
@RequestMapping(value = Array("/artists"))
class ArtistsController {

  @GetMapping(value = Array())
  def getArtists(): String = {
    "test"
  }

  @GetMapping(value = Array("/extras"))
  def getExtras(): List[String] = {
    List("a", "b", "c")
  }

}
