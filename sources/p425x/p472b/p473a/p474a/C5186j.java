package p425x.p472b.p473a.p474a;

import java.util.Collection;
import java.util.List;
import org.dpppt.android.sdk.models.ExposureDay;

/* renamed from: x.b.a.a.j */
public class C5186j {

    /* renamed from: a */
    public boolean f12387a;

    /* renamed from: b */
    public long f12388b;

    /* renamed from: c */
    public C5183g f12389c;

    /* renamed from: d */
    public Collection<C5187a> f12390d;

    /* renamed from: x.b.a.a.j$a */
    public enum C5187a {
        LOCATION_SERVICE_DISABLED(C5185i.dp3t_sdk_service_notification_error_location_service),
        BLE_DISABLED(C5185i.dp3t_sdk_service_notification_error_bluetooth_disabled),
        BLE_NOT_SUPPORTED(C5185i.dp3t_sdk_service_notification_error_bluetooth_not_supported),
        GAEN_NOT_AVAILABLE(C5185i.dp3t_sdk_service_notification_error_gaen_not_available),
        GAEN_UNEXPECTEDLY_DISABLED(C5185i.dp3t_sdk_service_notification_error_gaen_unexpectedly_disabled),
        BATTERY_OPTIMIZER_ENABLED(C5185i.dp3t_sdk_service_notification_error_battery_optimization),
        SYNC_ERROR_SERVER(C5185i.dp3t_sdk_service_notification_error_sync_server),
        SYNC_ERROR_NETWORK(C5185i.dp3t_sdk_service_notification_error_sync_network),
        SYNC_ERROR_NO_SPACE(C5185i.dp3t_sdk_service_notification_error_no_space),
        SYNC_ERROR_SSLTLS(C5185i.dp3t_sdk_service_notification_error_sync_ssltls),
        SYNC_ERROR_TIMING(C5185i.dp3t_sdk_service_notification_error_sync_timing),
        SYNC_ERROR_SIGNATURE(C5185i.dp3t_sdk_service_notification_error_sync_signature),
        SYNC_ERROR_API_EXCEPTION(C5185i.dp3t_sdk_service_notification_error_sync_api);
        

        /* renamed from: e */
        public int f12405e;

        /* renamed from: f */
        public String f12406f;

        /* access modifiers changed from: public */
        C5187a(int i) {
            this.f12405e = i;
        }
    }

    public C5186j(boolean z, long j, C5183g gVar, List<ExposureDay> list, Collection<C5187a> collection) {
        this.f12387a = z;
        this.f12388b = j;
        this.f12389c = gVar;
        this.f12390d = collection;
    }
}
