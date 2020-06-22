package com.example

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.reactive.RxJavaCrudRepository
import io.reactivex.Maybe
import java.util.UUID

@JdbcRepository(dialect = Dialect.MYSQL)
interface ItemRepository : RxJavaCrudRepository<Item, UUID> {
    fun findByOrgId(orgId: UUID): Maybe<Item>
    fun findByName(name: String): Maybe<Item>
}
