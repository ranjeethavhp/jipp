// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "media-sheets-col" collection as defined in:
 * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class MediaSheetsCol
constructor(
    var blank: Int? = null,
    var blankTwoSided: Int? = null,
    var fullColor: Int? = null,
    var fullColorTwoSided: Int? = null,
    var highlightColor: Int? = null,
    var highlightColorTwoSided: Int? = null,
    var monochrome: Int? = null,
    var monochromeTwoSided: Int? = null
) : AttributeCollection {

    /** Construct an empty [MediaSheetsCol]. */
    constructor() : this(null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            blank?.let { Types.blank.of(it) },
            blankTwoSided?.let { Types.blankTwoSided.of(it) },
            fullColor?.let { Types.fullColor.of(it) },
            fullColorTwoSided?.let { Types.fullColorTwoSided.of(it) },
            highlightColor?.let { Types.highlightColor.of(it) },
            highlightColorTwoSided?.let { Types.highlightColorTwoSided.of(it) },
            monochrome?.let { Types.monochrome.of(it) },
            monochromeTwoSided?.let { Types.monochromeTwoSided.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<MediaSheetsCol>(MediaSheetsCol)

    /** All member names as strings. */
    object Name {
        /** "blank" member name */
        const val blank = "blank"
        /** "blank-two-sided" member name */
        const val blankTwoSided = "blank-two-sided"
        /** "full-color" member name */
        const val fullColor = "full-color"
        /** "full-color-two-sided" member name */
        const val fullColorTwoSided = "full-color-two-sided"
        /** "highlight-color" member name */
        const val highlightColor = "highlight-color"
        /** "highlight-color-two-sided" member name */
        const val highlightColorTwoSided = "highlight-color-two-sided"
        /** "monochrome" member name */
        const val monochrome = "monochrome"
        /** "monochrome-two-sided" member name */
        const val monochromeTwoSided = "monochrome-two-sided"
    }

    /** Types for each member attribute. */
    object Types {
        val blank = IntType(Name.blank)
        val blankTwoSided = IntType(Name.blankTwoSided)
        val fullColor = IntType(Name.fullColor)
        val fullColorTwoSided = IntType(Name.fullColorTwoSided)
        val highlightColor = IntType(Name.highlightColor)
        val highlightColorTwoSided = IntType(Name.highlightColorTwoSided)
        val monochrome = IntType(Name.monochrome)
        val monochromeTwoSided = IntType(Name.monochromeTwoSided)
    }

    /** Defines types for each member of [MediaSheetsCol] */
    companion object : AttributeCollection.Converter<MediaSheetsCol> {
        override fun convert(attributes: List<Attribute<*>>): MediaSheetsCol =
            MediaSheetsCol(
                extractOne(attributes, Types.blank),
                extractOne(attributes, Types.blankTwoSided),
                extractOne(attributes, Types.fullColor),
                extractOne(attributes, Types.fullColorTwoSided),
                extractOne(attributes, Types.highlightColor),
                extractOne(attributes, Types.highlightColorTwoSided),
                extractOne(attributes, Types.monochrome),
                extractOne(attributes, Types.monochromeTwoSided)
            )
    }
}
