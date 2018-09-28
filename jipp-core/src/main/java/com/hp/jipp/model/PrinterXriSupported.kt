// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-09-17
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "printer-xri-supported" collection as defined in:
 * [RFC3380](http://www.iana.org/go/rfc3380).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PrinterXriSupported
constructor(
    /** May contain any keyword from [XriAuthenticationSupported]. */
    var xriAuthentication: String? = null,
    /** May contain any keyword from [XriSecuritySupported]. */
    var xriSecurity: String? = null,
    var xriUri: java.net.URI? = null
) : AttributeCollection {

    /** Construct an empty [PrinterXriSupported]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            xriAuthentication?.let { Types.xriAuthentication.of(it) },
            xriSecurity?.let { Types.xriSecurity.of(it) },
            xriUri?.let { Types.xriUri.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<PrinterXriSupported>(PrinterXriSupported)

    /** All member names as strings. */
    object Name {
        /** "xri-authentication" member name */
        const val xriAuthentication = "xri-authentication"
        /** "xri-security" member name */
        const val xriSecurity = "xri-security"
        /** "xri-uri" member name */
        const val xriUri = "xri-uri"
    }

    /** Types for each member attribute. */
    object Types {
        val xriAuthentication = KeywordType(Name.xriAuthentication)
        val xriSecurity = KeywordType(Name.xriSecurity)
        val xriUri = UriType(Name.xriUri)
    }

    /** Defines types for each member of [PrinterXriSupported] */
    companion object : AttributeCollection.Converter<PrinterXriSupported> {
        override fun convert(attributes: List<Attribute<*>>): PrinterXriSupported =
            PrinterXriSupported(
                extractOne(attributes, Types.xriAuthentication),
                extractOne(attributes, Types.xriSecurity),
                extractOne(attributes, Types.xriUri)
            )
    }
}
