// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-09-17
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "xri-authentication-supported" keywords.
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf">PWG5100.13</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf">PWG5100.18</a>
 * @see <a href="http://www.iana.org/go/rfc3380">RFC3380</a>
 * @see <a href="http://www.iana.org/go/rfc8011">RFC8011</a>
 */
public class XriAuthenticationSupported {
    public static final String basic = "basic";
    public static final String certificate = "certificate";
    public static final String digest = "digest";
    public static final String negotiate = "negotiate";
    public static final String none = "none";
    public static final String oauth = "oauth";
    public static final String requestingUserName = "requesting-user-name";
}