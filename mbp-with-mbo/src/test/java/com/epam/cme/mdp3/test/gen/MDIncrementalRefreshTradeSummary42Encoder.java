/* Generated SBE (Simple Binary Encoding) message codec */
package com.epam.cme.mdp3.test.gen;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"com.epam.cme.mdp3.test.gen.MDIncrementalRefreshTradeSummary42Encoder"})
@SuppressWarnings("all")
public class MDIncrementalRefreshTradeSummary42Encoder
{
    public static final int BLOCK_LENGTH = 11;
    public static final int TEMPLATE_ID = 42;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 8;

    private final MDIncrementalRefreshTradeSummary42Encoder parentMessage = this;
    private MutableDirectBuffer buffer;
    protected int offset;
    protected int limit;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "X";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public MDIncrementalRefreshTradeSummary42Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int transactTimeEncodingOffset()
    {
        return 0;
    }

    public static int transactTimeEncodingLength()
    {
        return 8;
    }

    public static long transactTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long transactTimeMinValue()
    {
        return 0x0L;
    }

    public static long transactTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public MDIncrementalRefreshTradeSummary42Encoder transactTime(final long value)
    {
        buffer.putLong(offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int matchEventIndicatorEncodingOffset()
    {
        return 8;
    }

    public static int matchEventIndicatorEncodingLength()
    {
        return 1;
    }

    private final MatchEventIndicatorEncoder matchEventIndicator = new MatchEventIndicatorEncoder();

    public MatchEventIndicatorEncoder matchEventIndicator()
    {
        matchEventIndicator.wrap(buffer, offset + 8);
        return matchEventIndicator;
    }

    private final NoMDEntriesEncoder noMDEntries = new NoMDEntriesEncoder();

    public static long noMDEntriesId()
    {
        return 268;
    }

    public NoMDEntriesEncoder noMDEntriesCount(final int count)
    {
        noMDEntries.wrap(parentMessage, buffer, count);
        return noMDEntries;
    }

    public static class NoMDEntriesEncoder
    {
        private static final int HEADER_SIZE = 3;
        private final GroupSizeEncoder dimensions = new GroupSizeEncoder();
        private MDIncrementalRefreshTradeSummary42Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;

        public void wrap(
            final MDIncrementalRefreshTradeSummary42Encoder parentMessage, final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 254)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            this.parentMessage = parentMessage;
            this.buffer = buffer;
            dimensions.wrap(buffer, parentMessage.limit());
            dimensions.blockLength((int)32);
            dimensions.numInGroup((short)count);
            index = -1;
            this.count = count;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 32;
        }

        public NoMDEntriesEncoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + sbeBlockLength());
            ++index;

            return this;
        }

        public static int mDEntryPxEncodingOffset()
        {
            return 0;
        }

        public static int mDEntryPxEncodingLength()
        {
            return 8;
        }

        private final PRICEEncoder mDEntryPx = new PRICEEncoder();

        public PRICEEncoder mDEntryPx()
        {
            mDEntryPx.wrap(buffer, offset + 0);
            return mDEntryPx;
        }

        public static int mDEntrySizeEncodingOffset()
        {
            return 8;
        }

        public static int mDEntrySizeEncodingLength()
        {
            return 4;
        }

        public static int mDEntrySizeNullValue()
        {
            return -2147483648;
        }

        public static int mDEntrySizeMinValue()
        {
            return -2147483647;
        }

        public static int mDEntrySizeMaxValue()
        {
            return 2147483647;
        }

        public NoMDEntriesEncoder mDEntrySize(final int value)
        {
            buffer.putInt(offset + 8, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int securityIDEncodingOffset()
        {
            return 12;
        }

        public static int securityIDEncodingLength()
        {
            return 4;
        }

        public static int securityIDNullValue()
        {
            return -2147483648;
        }

        public static int securityIDMinValue()
        {
            return -2147483647;
        }

        public static int securityIDMaxValue()
        {
            return 2147483647;
        }

        public NoMDEntriesEncoder securityID(final int value)
        {
            buffer.putInt(offset + 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int rptSeqEncodingOffset()
        {
            return 16;
        }

        public static int rptSeqEncodingLength()
        {
            return 4;
        }

        public static long rptSeqNullValue()
        {
            return 4294967294L;
        }

        public static long rptSeqMinValue()
        {
            return 0L;
        }

        public static long rptSeqMaxValue()
        {
            return 4294967293L;
        }

        public NoMDEntriesEncoder rptSeq(final long value)
        {
            buffer.putInt(offset + 16, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int numberOfOrdersEncodingOffset()
        {
            return 20;
        }

        public static int numberOfOrdersEncodingLength()
        {
            return 4;
        }

        public static int numberOfOrdersNullValue()
        {
            return 2147483647;
        }

        public static int numberOfOrdersMinValue()
        {
            return -2147483647;
        }

        public static int numberOfOrdersMaxValue()
        {
            return 2147483647;
        }

        public NoMDEntriesEncoder numberOfOrders(final int value)
        {
            buffer.putInt(offset + 20, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int aggressorSideEncodingOffset()
        {
            return 24;
        }

        public static int aggressorSideEncodingLength()
        {
            return 1;
        }

        public NoMDEntriesEncoder aggressorSide(final AggressorSide value)
        {
            buffer.putByte(offset + 24, (byte)value.value());
            return this;
        }

        public static int mDUpdateActionEncodingOffset()
        {
            return 25;
        }

        public static int mDUpdateActionEncodingLength()
        {
            return 1;
        }

        public NoMDEntriesEncoder mDUpdateAction(final MDUpdateAction value)
        {
            buffer.putByte(offset + 25, (byte)value.value());
            return this;
        }

        public static int mDEntryTypeEncodingOffset()
        {
            return 26;
        }

        public static int mDEntryTypeEncodingLength()
        {
            return 0;
        }

        public static byte mDEntryTypeNullValue()
        {
            return (byte)0;
        }

        public static byte mDEntryTypeMinValue()
        {
            return (byte)32;
        }

        public static byte mDEntryTypeMaxValue()
        {
            return (byte)126;
        }

        private static final byte[] MDENTRYTYPE_VALUE = {50};

        public static int mDEntryTypeLength()
        {
            return 1;
        }

        public byte mDEntryType(final int index)
        {
            return MDENTRYTYPE_VALUE[index];
        }

        public int getMDEntryType(final byte[] dst, final int offset, final int length)
        {
            final int bytesCopied = Math.min(length, 1);
            System.arraycopy(MDENTRYTYPE_VALUE, 0, dst, offset, bytesCopied);

            return bytesCopied;
        }

        public static int mDTradeEntryIDEncodingOffset()
        {
            return 26;
        }

        public static int mDTradeEntryIDEncodingLength()
        {
            return 4;
        }

        public static long mDTradeEntryIDNullValue()
        {
            return 4294967295L;
        }

        public static long mDTradeEntryIDMinValue()
        {
            return 0L;
        }

        public static long mDTradeEntryIDMaxValue()
        {
            return 4294967293L;
        }

        public NoMDEntriesEncoder mDTradeEntryID(final long value)
        {
            buffer.putInt(offset + 26, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

    }

    private final NoOrderIDEntriesEncoder noOrderIDEntries = new NoOrderIDEntriesEncoder();

    public static long noOrderIDEntriesId()
    {
        return 37705;
    }

    public NoOrderIDEntriesEncoder noOrderIDEntriesCount(final int count)
    {
        noOrderIDEntries.wrap(parentMessage, buffer, count);
        return noOrderIDEntries;
    }

    public static class NoOrderIDEntriesEncoder
    {
        private static final int HEADER_SIZE = 8;
        private final GroupSize8ByteEncoder dimensions = new GroupSize8ByteEncoder();
        private MDIncrementalRefreshTradeSummary42Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;

        public void wrap(
            final MDIncrementalRefreshTradeSummary42Encoder parentMessage, final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 254)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            this.parentMessage = parentMessage;
            this.buffer = buffer;
            dimensions.wrap(buffer, parentMessage.limit());
            dimensions.blockLength((int)16);
            dimensions.numInGroup((short)count);
            index = -1;
            this.count = count;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 16;
        }

        public NoOrderIDEntriesEncoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + sbeBlockLength());
            ++index;

            return this;
        }

        public static int orderIDEncodingOffset()
        {
            return 0;
        }

        public static int orderIDEncodingLength()
        {
            return 8;
        }

        public static long orderIDNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long orderIDMinValue()
        {
            return 0x0L;
        }

        public static long orderIDMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public NoOrderIDEntriesEncoder orderID(final long value)
        {
            buffer.putLong(offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int lastQtyEncodingOffset()
        {
            return 8;
        }

        public static int lastQtyEncodingLength()
        {
            return 4;
        }

        public static int lastQtyNullValue()
        {
            return -2147483648;
        }

        public static int lastQtyMinValue()
        {
            return -2147483647;
        }

        public static int lastQtyMaxValue()
        {
            return 2147483647;
        }

        public NoOrderIDEntriesEncoder lastQty(final int value)
        {
            buffer.putInt(offset + 8, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        MDIncrementalRefreshTradeSummary42Decoder writer = new MDIncrementalRefreshTradeSummary42Decoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}
