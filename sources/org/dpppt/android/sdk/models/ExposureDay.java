package org.dpppt.android.sdk.models;

public class ExposureDay {
    public boolean deleted;
    public DayDate exposedDate;

    /* renamed from: id */
    public int f2672id;
    public long reportDate;

    public ExposureDay(int i, DayDate dayDate, long j) {
        this.f2672id = i;
        this.exposedDate = dayDate;
        this.reportDate = j;
    }

    public DayDate getExposedDate() {
        return this.exposedDate;
    }

    public int getId() {
        return this.f2672id;
    }

    public long getReportDate() {
        return this.reportDate;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public void setExposedDate(DayDate dayDate) {
        this.exposedDate = dayDate;
    }

    public void setId(int i) {
        this.f2672id = i;
    }

    public void setReportDate(long j) {
        this.reportDate = j;
    }
}
