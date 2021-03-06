// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-09-17
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-error-sheet" collection as defined in:
 * [PWG5100.3](https://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobErrorSheet
constructor(
    /** May contain any keyword from [JobErrorSheetType] or a name. */
    var jobErrorSheetType: KeywordOrName? = null,
    /** May contain any keyword from [JobErrorSheetWhen]. */
    var jobErrorSheetWhen: String? = null,
    /** May contain any keyword from [Media] or a name. */
    var media: KeywordOrName? = null,
    var mediaCol: MediaCol? = null
) : AttributeCollection {

    /** Construct an empty [JobErrorSheet]. */
    constructor() : this(null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            jobErrorSheetType?.let { Types.jobErrorSheetType.of(it) },
            jobErrorSheetWhen?.let { Types.jobErrorSheetWhen.of(it) },
            media?.let { Types.media.of(it) },
            mediaCol?.let { Types.mediaCol.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<JobErrorSheet>(JobErrorSheet)

    /** All member names as strings. */
    object Name {
        /** "job-error-sheet-type" member name */
        const val jobErrorSheetType = "job-error-sheet-type"
        /** "job-error-sheet-when" member name */
        const val jobErrorSheetWhen = "job-error-sheet-when"
        /** "media" member name */
        const val media = "media"
        /** "media-col" member name */
        const val mediaCol = "media-col"
    }

    /** Types for each member attribute. */
    object Types {
        val jobErrorSheetType = KeywordOrNameType(Name.jobErrorSheetType)
        val jobErrorSheetWhen = KeywordType(Name.jobErrorSheetWhen)
        val media = KeywordOrNameType(Name.media)
        val mediaCol = MediaCol.Type(Name.mediaCol)
    }

    /** Defines types for each member of [JobErrorSheet] */
    companion object : AttributeCollection.Converter<JobErrorSheet> {
        override fun convert(attributes: List<Attribute<*>>): JobErrorSheet =
            JobErrorSheet(
                extractOne(attributes, Types.jobErrorSheetType),
                extractOne(attributes, Types.jobErrorSheetWhen),
                extractOne(attributes, Types.media),
                extractOne(attributes, Types.mediaCol)
            )
    }
}
