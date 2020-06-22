package com.example

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.micronaut.test.annotation.MicronautTest
import java.util.UUID

@MicronautTest
class DemoTest(private val service: ItemService)
    : StringSpec({
                     "test the index function" {
                         val list = service.index()
                             .toList()
                             .blockingGet()
                         list.size shouldBe 1
                     }

                     "test the findById function" {
                         val item = service.findById(UUID.fromString("57f19fdc-f694-4c94-a2f7-3ca292f17fe6"))
                             .blockingGet()
                         item.name shouldBe "test"
                     }

                     "test the findByName function" {
                         val item = service.findByName("test")
                             .blockingGet()
                         item.name shouldBe "test"
                     }

                     "test the findByOrgId function" {
                         val item = service.findByOrgId(UUID.fromString("e265bb25-203f-425c-965e-d2098ae4df94"))
                             .blockingGet()
                         item.name shouldBe "test"
                     }

                     "test the findByNameAndOrgId function" {
                         val item = service.findByNameAndOrgId("test", UUID.fromString("e265bb25-203f-425c-965e-d2098ae4df94"))
                             .blockingGet()
                         item.name shouldBe "test"
                     }
                 })
