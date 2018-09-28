// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-09-17
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "document-digital-signature" keywords.
 *
 * Also used by: "document-digital-signature-default", "document-digital-signature-supported".
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf">PWG5100.7</a>
 */
public class DocumentDigitalSignature {
    public static final String dss = "dss";
    public static final String none = "none";
    public static final String pgp = "pgp";
    public static final String smime = "smime";
    public static final String xmldsig = "xmldsig";
}