package com.ayah.common.data.source.preference.model;

import V8.d;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesAppNotificationJsonAdapter extends JsonAdapter<PreferencesAppNotification> {
    private final JsonAdapter<AppNotificationType> appNotificationTypeAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final m options;
    private final JsonAdapter<String> stringAdapter;

    public PreferencesAppNotificationJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("appNotificationType", "isEnabled", "isoTime");
        t tVar = t.f19442r;
        this.appNotificationTypeAdapter = c10.b(AppNotificationType.class, tVar, "appNotificationType");
        this.booleanAdapter = c10.b(Boolean.TYPE, tVar, "isEnabled");
        this.stringAdapter = c10.b(String.class, tVar, "isoTime");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        nVar.e();
        AppNotificationType appNotificationType = null;
        Boolean bool = null;
        String str = null;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0) {
                appNotificationType = (AppNotificationType) this.appNotificationTypeAdapter.a(nVar);
                if (appNotificationType == null) {
                    throw d.j("appNotificationType", "appNotificationType", nVar);
                }
            } else if (iV == 1) {
                bool = (Boolean) this.booleanAdapter.a(nVar);
                if (bool == null) {
                    throw d.j("isEnabled", "isEnabled", nVar);
                }
            } else if (iV == 2 && (str = (String) this.stringAdapter.a(nVar)) == null) {
                throw d.j("isoTime", "isoTime", nVar);
            }
        }
        nVar.n();
        if (appNotificationType == null) {
            throw d.e("appNotificationType", "appNotificationType", nVar);
        }
        if (bool == null) {
            throw d.e("isEnabled", "isEnabled", nVar);
        }
        boolean zBooleanValue = bool.booleanValue();
        if (str != null) {
            return new PreferencesAppNotification(appNotificationType, zBooleanValue, str);
        }
        throw d.e("isoTime", "isoTime", nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        PreferencesAppNotification preferencesAppNotification = (PreferencesAppNotification) obj;
        j.e(sVar, "writer");
        if (preferencesAppNotification == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("appNotificationType");
        this.appNotificationTypeAdapter.e(sVar, preferencesAppNotification.f13692a);
        sVar.w("isEnabled");
        this.booleanAdapter.e(sVar, Boolean.valueOf(preferencesAppNotification.f13693b));
        sVar.w("isoTime");
        this.stringAdapter.e(sVar, preferencesAppNotification.f13694c);
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(PreferencesAppNotification)");
        return sb.toString();
    }
}
