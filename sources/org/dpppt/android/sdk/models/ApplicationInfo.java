package org.dpppt.android.sdk.models;

public class ApplicationInfo {
    public String appId;
    public String bucketBaseUrl;
    public String reportBaseUrl;

    public ApplicationInfo(String str, String str2, String str3) {
        this.appId = str;
        this.reportBaseUrl = str2;
        this.bucketBaseUrl = str3;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getBucketBaseUrl() {
        return this.bucketBaseUrl;
    }

    public String getReportBaseUrl() {
        return this.reportBaseUrl;
    }
}
