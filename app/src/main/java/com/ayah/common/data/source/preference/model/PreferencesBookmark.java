package com.ayah.common.data.source.preference.model;

import com.squareup.moshi.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class PreferencesBookmark {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13698d;

    public PreferencesBookmark(int i10, long j, String str, String str2) {
        j.e(str, "name");
        j.e(str2, "color");
        this.f13695a = i10;
        this.f13696b = str;
        this.f13697c = str2;
        this.f13698d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferencesBookmark)) {
            return false;
        }
        PreferencesBookmark preferencesBookmark = (PreferencesBookmark) obj;
        return this.f13695a == preferencesBookmark.f13695a && j.a(this.f13696b, preferencesBookmark.f13696b) && j.a(this.f13697c, preferencesBookmark.f13697c) && this.f13698d == preferencesBookmark.f13698d;
    }

    public final int hashCode() {
        int iX = a.x(this.f13697c, a.x(this.f13696b, this.f13695a * 31, 31), 31);
        long j = this.f13698d;
        return iX + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PreferencesBookmark(verseId=" + this.f13695a + ", name=" + this.f13696b + ", color=" + this.f13697c + ", timestampMillis=" + this.f13698d + ")";
    }

    public /* synthetic */ PreferencesBookmark(int i10, String str, String str2, long j, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 8) != 0 ? -1L : j, str, str2);
    }
}
