package com.ayah.common.data.source.preference.model;

import com.squareup.moshi.k;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class PreferencesKhatmah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13702d;

    public PreferencesKhatmah(int i10, int i11, String str, String str2) {
        j.e(str, "plan");
        this.f13699a = str;
        this.f13700b = str2;
        this.f13701c = i10;
        this.f13702d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferencesKhatmah)) {
            return false;
        }
        PreferencesKhatmah preferencesKhatmah = (PreferencesKhatmah) obj;
        return j.a(this.f13699a, preferencesKhatmah.f13699a) && j.a(this.f13700b, preferencesKhatmah.f13700b) && this.f13701c == preferencesKhatmah.f13701c && this.f13702d == preferencesKhatmah.f13702d;
    }

    public final int hashCode() {
        return ((a.x(this.f13700b, this.f13699a.hashCode() * 31, 31) + this.f13701c) * 31) + this.f13702d;
    }

    public final String toString() {
        return "PreferencesKhatmah(plan=" + this.f13699a + ", startDateIso=" + this.f13700b + ", startingDayIndex=" + this.f13701c + ", currentDayIndex=" + this.f13702d + ")";
    }
}
