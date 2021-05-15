package com.dalbotinc.artists

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ArtistsApp

object ArtistsApp {

  def main(args: Array[String]): Unit = {
    val app: Array[Class[_]] = Array(classOf[ArtistsApp])
    SpringApplication.run(app, args)
  }

}
