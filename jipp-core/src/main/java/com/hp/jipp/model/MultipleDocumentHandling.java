// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-09-17
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "multiple-document-handling" keywords.
 *
 * Also used by: "multiple-document-handling-default", "multiple-document-handling-supported".
 *
 * @see <a href="http://www.iana.org/go/rfc8011">RFC8011</a>
 */
public class MultipleDocumentHandling {
    public static final String separateDocumentsCollatedCopies = "separate-documents-collated-copies";
    public static final String separateDocumentsUncollatedCopies = "separate-documents-uncollated-copies";
    public static final String singleDocument = "single-document";
    public static final String singleDocumentNewSheet = "single-document-new-sheet";
}