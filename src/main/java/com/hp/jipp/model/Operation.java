package com.hp.jipp.model;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;
import com.hp.jipp.encoding.Attribute;
import com.hp.jipp.encoding.EnumEncoder;
import com.hp.jipp.encoding.NameCode;

/**
 * An operation code, as found in request packets
 */
@AutoValue
public abstract class Operation extends NameCode {

    public final static Operation PrintJob = create("Print-Job", 0x0002);
    public final static Operation PrintUri = create("Print-URI", 0x0003);
    public final static Operation ValidateJob = create("Validate-Job", 0x0004);
    public final static Operation CreateJob = create("Create-Job", 0x0005);
    public final static Operation SendDocument = create("SendDocument", 0x0006);
    public final static Operation SendUri = create("Send-URI", 0x0007);
    public final static Operation CancelJob = create("Cancel-Job", 0x0008);
    public final static Operation GetJobAttributes = create("Get-Job-Attributes", 0x0009);
    public final static Operation GetJobs = create("Get-Jobs", 0x000A);
    public final static Operation GetPrinterAttributes = create("Get-Printer-Attributes",
            0x000B);
    public final static Operation HoldJob = create("Hold-Job", 0x000C);
    public final static Operation ReleaseJob = create("Release-Job", 0x000D);
    public final static Operation RestartJob = create("Restart-Job", 0x000E);
    public final static Operation PausePrinter = create("Pause-Printer", 0x0010);
    public final static Operation ResumePrinter = create("Resume-Printer", 0x0011);
    public final static Operation PurgeJobs = create("Purge-Jobs", 0x0012);

    public static final EnumEncoder<Operation> Encoder = EnumEncoder.create("operation-id",
            ImmutableSet.of(Attribute.OperationsSupported),
            new ImmutableSet.Builder<Operation>().add(
                    PrintJob, PrintUri, ValidateJob, CreateJob, SendDocument, SendUri, CancelJob,
                    GetJobAttributes, GetJobs, GetPrinterAttributes, HoldJob, ReleaseJob,
                    RestartJob, PausePrinter, ResumePrinter, PurgeJobs
            ).build(),
            new NameCode.Factory<Operation>() {
                @Override
                public Operation create(String name, int code) {
                    return new AutoValue_Operation(name, code);
                }
            });

    public static Attribute<Operation> attribute(String name, Operation... values) {
        return Encoder.toAttribute(name, values);
    }

    /** Returns true if this is a known operation code */
    public static boolean isKnown(int code) {
        return Encoder.getEnumsMap().containsKey(code);
    }

    /**
     * Look up or convert an operation code into an Operation object
     */
    public static Operation toOperation(int code) {
        return Encoder.getEnum(code);
    }

    /**
     * Returns a new instance
     * @param name human-readable name of the the operation
     * @param code machine-readable identifier for the operation
     */
    public static Operation create(String name, int code) {
        return new AutoValue_Operation(name, code);
    }
}