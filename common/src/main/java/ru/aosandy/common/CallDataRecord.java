package ru.aosandy.common;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CallDataRecord implements Serializable {

    private final int callType;
    private final String number;
    private final LocalDateTime startDateTime;
    private final LocalDateTime endDateTime;

    public CallDataRecord(
        int callType,
        String number,
        LocalDateTime dateTimeStart,
        LocalDateTime dateTimeEnd
    ) {
        this.callType = callType;
        this.number = number;
        this.startDateTime = dateTimeStart;
        this.endDateTime = dateTimeEnd;
    }

    public int getCallType() {
        return callType;
    }

    public String getNumber() {
        return number;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    @Override
    public String toString() {
        return "CallDataRecord{" +
            "callType=" + callType +
            ", number='" + number + '\'' +
            ", dateTimeStart=" + startDateTime +
            ", dateTimeEnd=" + endDateTime +
            '}';
    }
}
