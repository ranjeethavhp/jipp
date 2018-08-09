// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "media-col" collection as defined in:
 * [PWG5100.11](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf),
 * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf),
 * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class MediaCol
constructor(
    /** May contain any keyword from [MediaBackCoating] or a name. */
    var mediaBackCoating: String? = null,
    var mediaBottomMargin: Int? = null,
    /** May contain any keyword from [MediaColor] or a name. */
    var mediaColor: String? = null,
    /** May contain any keyword from [MediaBackCoating] or a name. */
    var mediaFrontCoating: String? = null,
    /** May contain any keyword from [MediaGrain] or a name. */
    var mediaGrain: String? = null,
    var mediaHoleCount: Int? = null,
    var mediaInfo: String? = null,
    /** May contain any keyword from [Media] or a name. */
    var mediaKey: String? = null,
    var mediaLeftMargin: Int? = null,
    var mediaOrderCount: Int? = null,
    /** May contain any keyword from [MediaPrePrinted] or a name. */
    var mediaPrePrinted: String? = null,
    /** May contain any keyword from [MediaRecycled] or a name. */
    var mediaRecycled: String? = null,
    var mediaRightMargin: Int? = null,
    var mediaSize: MediaSize? = null,
    /** May contain any keyword from [Media] or a name. */
    var mediaSizeName: String? = null,
    /** May contain any keyword from [MediaSource] or a name. */
    var mediaSource: String? = null,
    var mediaSourceProperties: MediaSourceProperties? = null,
    var mediaThickness: Int? = null,
    /** May contain any keyword from [MediaTooth] or a name. */
    var mediaTooth: String? = null,
    var mediaTopMargin: Int? = null,
    /** May contain any keyword from [MediaType] or a name. */
    var mediaType: String? = null,
    var mediaWeightMetric: Int? = null
) : AttributeCollection {

    /** Construct an empty [MediaCol]. */
    constructor() : this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            mediaBackCoating?.let { Types.mediaBackCoating.of(it) },
            mediaBottomMargin?.let { Types.mediaBottomMargin.of(it) },
            mediaColor?.let { Types.mediaColor.of(it) },
            mediaFrontCoating?.let { Types.mediaFrontCoating.of(it) },
            mediaGrain?.let { Types.mediaGrain.of(it) },
            mediaHoleCount?.let { Types.mediaHoleCount.of(it) },
            mediaInfo?.let { Types.mediaInfo.of(it) },
            mediaKey?.let { Types.mediaKey.of(it) },
            mediaLeftMargin?.let { Types.mediaLeftMargin.of(it) },
            mediaOrderCount?.let { Types.mediaOrderCount.of(it) },
            mediaPrePrinted?.let { Types.mediaPrePrinted.of(it) },
            mediaRecycled?.let { Types.mediaRecycled.of(it) },
            mediaRightMargin?.let { Types.mediaRightMargin.of(it) },
            mediaSize?.let { Types.mediaSize.of(it) },
            mediaSizeName?.let { Types.mediaSizeName.of(it) },
            mediaSource?.let { Types.mediaSource.of(it) },
            mediaSourceProperties?.let { Types.mediaSourceProperties.of(it) },
            mediaThickness?.let { Types.mediaThickness.of(it) },
            mediaTooth?.let { Types.mediaTooth.of(it) },
            mediaTopMargin?.let { Types.mediaTopMargin.of(it) },
            mediaType?.let { Types.mediaType.of(it) },
            mediaWeightMetric?.let { Types.mediaWeightMetric.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<MediaCol>(MediaCol)

    /** All member names as strings. */
    object Name {
        /** "media-back-coating" member name */
        const val mediaBackCoating = "media-back-coating"
        /** "media-bottom-margin" member name */
        const val mediaBottomMargin = "media-bottom-margin"
        /** "media-color" member name */
        const val mediaColor = "media-color"
        /** "media-front-coating" member name */
        const val mediaFrontCoating = "media-front-coating"
        /** "media-grain" member name */
        const val mediaGrain = "media-grain"
        /** "media-hole-count" member name */
        const val mediaHoleCount = "media-hole-count"
        /** "media-info" member name */
        const val mediaInfo = "media-info"
        /** "media-key" member name */
        const val mediaKey = "media-key"
        /** "media-left-margin" member name */
        const val mediaLeftMargin = "media-left-margin"
        /** "media-order-count" member name */
        const val mediaOrderCount = "media-order-count"
        /** "media-pre-printed" member name */
        const val mediaPrePrinted = "media-pre-printed"
        /** "media-recycled" member name */
        const val mediaRecycled = "media-recycled"
        /** "media-right-margin" member name */
        const val mediaRightMargin = "media-right-margin"
        /** "media-size" member name */
        const val mediaSize = "media-size"
        /** "media-size-name" member name */
        const val mediaSizeName = "media-size-name"
        /** "media-source" member name */
        const val mediaSource = "media-source"
        /** "media-source-properties" member name */
        const val mediaSourceProperties = "media-source-properties"
        /** "media-thickness" member name */
        const val mediaThickness = "media-thickness"
        /** "media-tooth" member name */
        const val mediaTooth = "media-tooth"
        /** "media-top-margin" member name */
        const val mediaTopMargin = "media-top-margin"
        /** "media-type" member name */
        const val mediaType = "media-type"
        /** "media-weight-metric" member name */
        const val mediaWeightMetric = "media-weight-metric"
    }

    /** Types for each member attribute. */
    object Types {
        val mediaBackCoating = KeywordType(Name.mediaBackCoating)
        val mediaBottomMargin = IntType(Name.mediaBottomMargin)
        val mediaColor = KeywordType(Name.mediaColor)
        val mediaFrontCoating = KeywordType(Name.mediaFrontCoating)
        val mediaGrain = KeywordType(Name.mediaGrain)
        val mediaHoleCount = IntType(Name.mediaHoleCount)
        val mediaInfo = TextType(Name.mediaInfo)
        val mediaKey = KeywordType(Name.mediaKey)
        val mediaLeftMargin = IntType(Name.mediaLeftMargin)
        val mediaOrderCount = IntType(Name.mediaOrderCount)
        val mediaPrePrinted = KeywordType(Name.mediaPrePrinted)
        val mediaRecycled = KeywordType(Name.mediaRecycled)
        val mediaRightMargin = IntType(Name.mediaRightMargin)
        val mediaSize = MediaSize.Type(Name.mediaSize)
        val mediaSizeName = KeywordType(Name.mediaSizeName)
        val mediaSource = KeywordType(Name.mediaSource)
        val mediaSourceProperties = MediaSourceProperties.Type(Name.mediaSourceProperties)
        val mediaThickness = IntType(Name.mediaThickness)
        val mediaTooth = KeywordType(Name.mediaTooth)
        val mediaTopMargin = IntType(Name.mediaTopMargin)
        val mediaType = KeywordType(Name.mediaType)
        val mediaWeightMetric = IntType(Name.mediaWeightMetric)
    }

    /** Defines types for each member of [MediaCol] */
    companion object : AttributeCollection.Converter<MediaCol> {
        override fun convert(attributes: List<Attribute<*>>): MediaCol =
            MediaCol(
                extractOne(attributes, Types.mediaBackCoating),
                extractOne(attributes, Types.mediaBottomMargin),
                extractOne(attributes, Types.mediaColor),
                extractOne(attributes, Types.mediaFrontCoating),
                extractOne(attributes, Types.mediaGrain),
                extractOne(attributes, Types.mediaHoleCount),
                extractOne(attributes, Types.mediaInfo)?.value,
                extractOne(attributes, Types.mediaKey),
                extractOne(attributes, Types.mediaLeftMargin),
                extractOne(attributes, Types.mediaOrderCount),
                extractOne(attributes, Types.mediaPrePrinted),
                extractOne(attributes, Types.mediaRecycled),
                extractOne(attributes, Types.mediaRightMargin),
                extractOne(attributes, Types.mediaSize),
                extractOne(attributes, Types.mediaSizeName),
                extractOne(attributes, Types.mediaSource),
                extractOne(attributes, Types.mediaSourceProperties),
                extractOne(attributes, Types.mediaThickness),
                extractOne(attributes, Types.mediaTooth),
                extractOne(attributes, Types.mediaTopMargin),
                extractOne(attributes, Types.mediaType),
                extractOne(attributes, Types.mediaWeightMetric)
            )
    }

    /**
     * Data object corresponding to a "media-size" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class MediaSize
    constructor(
        var xDimension: Int? = null,
        var yDimension: Int? = null
    ) : AttributeCollection {

        /** Construct an empty [MediaSize]. */
        constructor() : this(null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                xDimension?.let { Types.xDimension.of(it) },
                yDimension?.let { Types.yDimension.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<MediaSize>(MediaSize)

        /** All member names as strings. */
        object Name {
            /** "x-dimension" member name */
            const val xDimension = "x-dimension"
            /** "y-dimension" member name */
            const val yDimension = "y-dimension"
        }

        /** Types for each member attribute. */
        object Types {
            val xDimension = IntType(Name.xDimension)
            val yDimension = IntType(Name.yDimension)
        }

        /** Defines types for each member of [MediaSize] */
        companion object : AttributeCollection.Converter<MediaSize> {
            override fun convert(attributes: List<Attribute<*>>): MediaSize =
                MediaSize(
                    extractOne(attributes, Types.xDimension),
                    extractOne(attributes, Types.yDimension)
                )
        }
    }

    /**
     * Data object corresponding to a "media-source-properties" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class MediaSourceProperties
    constructor(
        /** May contain any keyword from [FeedOrientation]. */
        var mediaSourceFeedDirection: String? = null,
        var mediaSourceFeedOrientation: Orientation? = null
    ) : AttributeCollection {

        /** Construct an empty [MediaSourceProperties]. */
        constructor() : this(null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                mediaSourceFeedDirection?.let { Types.mediaSourceFeedDirection.of(it) },
                mediaSourceFeedOrientation?.let { Types.mediaSourceFeedOrientation.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<MediaSourceProperties>(MediaSourceProperties)

        /** All member names as strings. */
        object Name {
            /** "media-source-feed-direction" member name */
            const val mediaSourceFeedDirection = "media-source-feed-direction"
            /** "media-source-feed-orientation" member name */
            const val mediaSourceFeedOrientation = "media-source-feed-orientation"
        }

        /** Types for each member attribute. */
        object Types {
            val mediaSourceFeedDirection = KeywordType(Name.mediaSourceFeedDirection)
            /**
             * "media-source-feed-orientation" member type.
             */
            val mediaSourceFeedOrientation = Orientation.Type(Name.mediaSourceFeedOrientation)
        }

        /** Defines types for each member of [MediaSourceProperties] */
        companion object : AttributeCollection.Converter<MediaSourceProperties> {
            override fun convert(attributes: List<Attribute<*>>): MediaSourceProperties =
                MediaSourceProperties(
                    extractOne(attributes, Types.mediaSourceFeedDirection),
                    extractOne(attributes, Types.mediaSourceFeedOrientation)
                )
        }
    }
}
