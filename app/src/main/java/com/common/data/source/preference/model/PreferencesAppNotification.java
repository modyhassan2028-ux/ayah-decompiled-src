package com.ayah.common.data.source.preference.model;

import android.support.v4.media.session.p;
import com.squareup.moshi.k;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class PreferencesAppNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppNotificationType f13692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13694c;

    public PreferencesAppNotification(AppNotificationType appNotificationType, boolean z10, String str) {
        j.e(appNotificationType, "appNotificationType");
        this.f13692a = appNotificationType;
        this.f13693b = z10;
        this.f13694c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferencesAppNotification)) {
            return false;
        }
        PreferencesAppNotification preferencesAppNotification = (PreferencesAppNotification) obj;
        return this.f13692a == preferencesAppNotification.f13692a && this.f13693b == preferencesAppNotification.f13693b && j.a(this.f13694c, preferencesAppNotification.f13694c);
    }

    public final int hashCode() {
        return this.f13694c.hashCode() + (((this.f13692a.hashCode() * 31) + (this.f13693b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferencesAppNotification(appNotificationType=");
        sb.append(this.f13692a);
        sb.append(", isEnabled=");
        sb.append(this.f13693b);
        sb.append(", isoTime=");
        return p.B(sb, this.f13694c, ")");
    }
}
