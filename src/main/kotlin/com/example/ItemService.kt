package com.example

import io.reactivex.Flowable
import io.reactivex.Maybe
import java.util.UUID
import javax.inject.Singleton

@Singleton
class ItemService(private val repository: ItemRepository) {

    fun index(): Flowable<Item> {
        return repository.findAll()
    }

    fun findById(id: UUID): Maybe<Item> {
        return repository.findById(id)
    }

    fun findByOrgId(orgId: UUID): Maybe<Item> {
        return repository.findByOrgId(orgId)
    }

    fun findByName(name: String): Maybe<Item> {
        return repository.findByName(name)
    }
}
