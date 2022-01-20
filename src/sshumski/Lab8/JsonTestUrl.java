package sshumski.Lab8;

public class JsonTestUrl {
    private String XCloudTraceContext;
    private String Accept;
    private Number UpgradeInsecureRequests;
    private String traceparent;
    private String UserAgent;
    private String Host;
    private String AcceptLanguage;

    public JsonTestUrl(String xCloudTraceContext, String accept,
                       Number upgradeInsecureRequests,
                       String traceparent, String userAgent,
                       String host, String acceptLanguage) {
        XCloudTraceContext = xCloudTraceContext;
        Accept = accept;
        UpgradeInsecureRequests = upgradeInsecureRequests;
        this.traceparent = traceparent;
        UserAgent = userAgent;
        Host = host;
        AcceptLanguage = acceptLanguage;
    }

    public String getXCloudTraceContext() {
        return XCloudTraceContext;
    }

    public String getAccept() {
        return Accept;
    }

    public Number getUpgradeInsecureRequests() {
        return UpgradeInsecureRequests;
    }

    public String getTraceparent() {
        return traceparent;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getHost() {
        return Host;
    }

    public String getAcceptLanguage() {
        return AcceptLanguage;
    }
}
