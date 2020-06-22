package com.example

import io.micronaut.core.annotation.Introspected
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Introspected
@Entity
data class Item(@Id
                @GeneratedValue
                var id: UUID? = null,
                var name: String,
                var orgId: UUID? = null)
